#!/bin/bash




# Initialize variables for options
optionOffline=
optionDebug=
optionLinux=
optionDebugResolver=
optionBatchMode=

printUsage() {
	echo "Usage: $0 [-b|--batch-mode] [-d|--debug] [-l|--linux] [-o|--offline] [-r|--debugResolver] CommandName"
	echo "   CommandName = full, clean, no_system_test, system_test_only, tycho_dependencies "
}

# Parse options
while getopts ":-:bdlor" opt; do
  case $opt in
    b) optionBatchMode="--batch-mode" ;;
    d) optionDebug="--debug" ;;
    l) optionLinux="-P test_linux" ;;
    o) optionOffline="--offline" ;;
    r) optionDebug="--debug"
       optionDebugResolver="-Dtycho.debug.resolver=true" ;;
    -)
      case "${OPTARG}" in
        batch-mode)
            optionBatchMode="--batch-mode"  ;;
        debug)
            optionDebug="--debug" ;;
        linux)
            optionLinux="-P test_linux" ;;
        offline)
            optionOffline="--offline"  ;;
        debugResolver)
            optionDebug="--debug"
            optionDebugResolver="-Dtycho.debug.resolver=true" ;;
        *) echo "Unknown option --${OPTARG}"; printUsage; exit 1 ;;
      esac
    ;;
    \?) echo "Invalid option: -$OPTARG" >&2; printUsage; exit 1 ;;
  esac
done

shift $((OPTIND - 1))

# Check for mandatory command parameter
if [ -z "$1" ]; then
  echo "Error: CommandName is required."
  printUsage
  exit 1
fi

commandName=$1

## Start script logic



echo commandName seen: $1
echo "options: optionLinux=${optionLinux} optionOffline=${optionOffline}  optionDebug=${optionDebug}   optionDebugResolver=${optionDebugResolver} optionBatchMode=${optionBatchMode}"

#Xvfb :99 &
#export DISPLAY=:99

#$HOME/.vnc/xstartup.sh

$HOME/start-vnc.sh


cd $HOME/src/gemoc-studio/dev_support/tycho_full_compilation/

pwd



case "${commandName}" in
	"full") 
		echo "-------- compile full gemoc studio (and install in .m2) --------"
		mvn ${optionLinux} ${optionOffline}  ${optionDebug}   ${optionDebugResolver} clean install --errors  --show-version ${optionBatchMode} ;;
	"clean")
		echo "-------- clean --------"
		mvn clean --errors  --show-version;;
	"no_system_test")
		echo "-------- compile gemoc studio no system tests (and install in .m2) --------"
		mvn ${optionLinux} ${optionOffline}  ${optionDebug} ${optionDebugResolver}  \
			--projects !../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.lwb,!../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.mwb  \
			-Djava.awt.headless=true \
			install \
			--errors  --show-version ${optionBatchMode};;
	"system_test_only")
		echo "-------- running system tests only ------------"
		mvn ${optionLinux} ${optionOffline}  ${optionDebug} ${optionDebugResolver} \
			-Dmaven.test.failure.ignore --projects ../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.lwb,../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.mwb,../../gemoc_studio/releng/org.eclipse.gemoc.gemoc_studio.targetplatform \
			verify \
			--errors  --show-version  ${optionBatchMode} ;;
	"tycho_dependencies") 
		echo "-------- show tycho dependencies  ------------"
		mvn ${optionLinux} ${optionOffline}  ${optionDebug} ${optionDebugResolver} \
			org.eclipse.tycho:tycho-p2-plugin:dependency-tree  ${optionBatchMode} ;;
	*)		
		echo "command $commandName not recognized"
		printUsage ;;
esac


