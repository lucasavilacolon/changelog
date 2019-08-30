#!/bin/bash

AMBIENTE=$1
echo "EJECUTA CHANGELOG EN AMBIENTE: $AMBIENTE"

source ~/.sdkman/bin/sdkman-init.sh
#export GRAILS_OPTS="-server -Xms1024m -Xmx2048m -XX:-UseGCOverheadLimit -XX:MaxPermSize=1024m -Dfile.encoding=UTF-8"
cd /home/workspace/

echo "gradle clean"
gradle clean

echo "grails dbm-update"
gradle -Dgrails.env="$AMBIENTE" dbmUpdate

#echo "EJECUTO EL CHANGELOG CON EXITO"

