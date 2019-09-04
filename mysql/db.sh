#|/bin/bash

CONTAINER_PORT="3307"
CONTAINER_NAME="db-mysql"
PASS="root"

PATH_TO_FILES=`pwd`
echo "PATH: $PATH_TO_FILES"

docker stop $CONTAINER_NAME
docker rm $CONTAINER_NAME
docker run --name=$CONTAINER_NAME -e MYSQL_ROOT_PASSWORD=$PASS -p $CONTAINER_PORT:3306 -v $PATH_TO_FILES/my.cnf:/etc/my.cnf -d mysql

waitMessage='3306'
waitContainer=$CONTAINER_NAME
bash waitContainer.sh $waitContainer $waitMessage

#PASS=`docker logs $CONTAINER_NAME | grep 'GENERATED'`
#echo "PASS: $PASS"

echo "HOST: localhost USER: root PASS: root PORT: $CONTAINER_PORT CONTAINER NAME: $CONTAINER_NAME"
