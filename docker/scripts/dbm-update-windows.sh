#!/bin/bash
AMBIENTE=$1
cd /home/workspace/docker/scripts/
echo "EJECUTA CHANGELOG EN AMBIENTE: $AMBIENTE"
source ~/.sdkman/bin/sdkman-init.sh
cd ../..
echo "gradle clean"
gradle clean
echo "grails dbm-update"
gradle -Dgrails.env="$AMBIENTE" dbmUpdate
#echo "EJECUTO EL CHANGELOG CON EXITO"
