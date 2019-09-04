@ECHO OFF
SET CONTAINER_PORT=3306
SET CONTAINER_NAME=db-mysql
SET PASS=root

SET PATH_TO_FILES=%cd%
ECHO PATH: %PATH_TO_FILES%

docker stop %CONTAINER_NAME%
docker rm %CONTAINER_NAME%
docker run --name=%CONTAINER_NAME% -e MYSQL_ROOT_PASSWORD=%PASS% -p %CONTAINER_PORT%:3306 -v %PATH_TO_FILES%/my.cnf:/etc/my.cnf -d mysql

ECHO HOST: localhost USER: root PASS: root PORT: %CONTAINER_PORT% CONTAINER NAME: %CONTAINER_NAME%
