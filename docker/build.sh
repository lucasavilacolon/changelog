#!/bin/bash

CONTAINER_NAME="changelog"

docker stop $CONTAINER_NAME
docker rm $CONTAINER_NAME

docker build -t "$CONTAINER_NAME" .
