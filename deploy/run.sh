#!/bin/bash

PATH_WORKSPACE=~/proyectos/changelog
PATH_DEPENDENCIES=~/changelogs/.m2

AMBIENTE="localhost"

DOCKER_CHANGELOG_RUNNING=`docker ps -a | grep changelog | wc -l`
if [ $DOCKER_CHANGELOG_RUNNING -eq 1 ]; then
        docker rm changelog
fi

docker run --name changelog \
    -v "$PATH_DEPENDENCIES":/root/.gradle \
  	-v "$PATH_WORKSPACE":/home/workspace/ \
  	--entrypoint="/home/workspace/docker/scripts/dbm-update.sh" \
   	changelog $AMBIENTE

docker rm changelog
