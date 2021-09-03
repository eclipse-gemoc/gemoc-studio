#! /usr/bin/python3

# script derived and adapted from https://github.com/giampaolo/psutil/blob/master/scripts/procsmem.py

from __future__ import print_function
import sys
import time
import psutil
import copy



if not (psutil.LINUX or psutil.MACOS or psutil.WINDOWS):
    sys.exit("platform not supported")


def convert_bytes(n):
    symbols = ('K', 'M', 'G', 'T', 'P', 'E', 'Z', 'Y')
    prefix = {}
    for i, s in enumerate(symbols):
        prefix[s] = 1 << (i + 1) * 10
    for s in reversed(symbols):
        if n >= prefix[s]:
            value = float(n) / prefix[s]
            return '%.1f%s' % (value, s)
    return "%sB" % n

def printProc(p):
    templ = "%-7s %-7s %7s %7s %7s %7s %7s"
    cmd = " ".join(p._info["cmdline"])[:256] if p._info["cmdline"] else ""
    line = templ % (
        p.pid,
        p._info["username"][:7] if p._info["username"] else "",
        convert_bytes(p._uss),
        convert_bytes(p._pss) if p._pss != "" else "",
        convert_bytes(p._swap) if p._swap != "" else "",
        convert_bytes(p._rss),
        cmd,
    )
    print(line)

def printAllMax(procs):
    procs.sort(key=lambda p: p['uss'])
    print("=" * 78)
    templ = "%-7s %-7s %7s %7s %7s %7s %7s"
    t = time.localtime()
    current_time = time.strftime("%H:%M:%S", t)
    print("Memory information used by processes at when last seen at maximum unique set size (USS) ", current_time)
    print(templ % ("PID", "User", "max(USS)", "PSS", "Swap", "RSS", "Cmdline"))
    print("=" * 78)
    # for p in procs[:86]:
    for p in procs:
        printProc(p['proc'])

def main():
    ad_pids = []
    procs = []
    
    prevProcsMap = {}
    procsMap = {}
    
    
    # i = 1
    # while i < 1000:
    #     print("loop ", i)
    #     i += 1
    while True:
        newMaxObserved = False
       # procsMap = {p.pid: p.info for p in psutil.process_iter()}
        for p in psutil.process_iter():
            with p.oneshot():
                try:
                    mem = p.memory_full_info()
                    info = p.as_dict(["cmdline", "username"])
                except psutil.AccessDenied:
                    ad_pids.append(p.pid)
                except psutil.NoSuchProcess:
                    pass
                else:
                    p._uss = mem.uss
                    p._rss = mem.rss
                    if not p._uss:
                        continue
                    p._pss = getattr(mem, "pss", "")
                    p._swap = getattr(mem, "swap", "")
                    p._info = info
                    if int(p._pid) in prevProcsMap:
                        if prevProcsMap[int(p._pid)]['uss'] < p._uss:
                            print('New max USS for pid ', p._pid, ' : USS=', prevProcsMap[int(p._pid)]['uss'], '->', p._uss)
                            # printProc(p)
                            procsMap[int(p._pid)] = { "uss": p._uss, "proc": p}
                            prevProcsMap[int(p._pid)] = { "uss": p._uss, "proc": p}
                            newMaxObserved = True     
                    else:
                        newMaxObserved = True
                        print('New pid : ', p._pid, ': USS=', p._uss)
                        # printProc(p)
                        procsMap[int(p._pid)] = { "uss": p._uss, "proc": p}
                        prevProcsMap[int(p._pid)] = { "uss": p._uss, "proc": p}
                    # procs.append(p)
        #prevProcsMap = copy.deepcopy(procsMap)
        if newMaxObserved:
            printAllMax(list(prevProcsMap.values()))
        # keep only active pid
        for pid in [pid for pid in prevProcsMap.keys() if pid not in procsMap.keys()]:
            prevProcsMap.pop(pid)
        procsMap.clear()
        time.sleep(1)


if __name__ == '__main__':
    sys.exit(main())
