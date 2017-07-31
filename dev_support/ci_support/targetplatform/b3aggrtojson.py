#!/bin/env/python
import os,time,json,shutil
import glob
from xml.dom.minidom import parse, parseString
from os.path import basename

SCRIPT_HOME=os.getcwd()

def aggregator_to_map(directory):
    sites = {}
    for filename in glob.glob(directory + '/*.b3aggrcon'):
                name = os.path.splitext(basename(filename))[0]
                urls = []
                dom = parse(filename)
                itemlist = dom.getElementsByTagName('repositories')
                for item in itemlist:
                    url = item.attributes['location'].value
                    urls.append(url)
                sites[name] = urls
    return sites

sites = aggregator_to_map('/home/cedric/src/org.eclipse.simrel.build')
print json.dumps(sites,sort_keys=True,indent=4, separators=(',', ': '))
