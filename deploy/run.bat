@ECHO OFF

cd ..
SET PATH_WORKSPACE=%cd%
ECHO %PATH_WORKSPACE%

SET PATH_DEPENDENCIES=%cd%/dependencies
echo %PATH_DEPENDENCIES% 


SET AMBIENTE=localhost

docker stop changelog
docker rm changelog

docker run --name changelog -v %PATH_DEPENDENCIES%:/root/.gradle -v %PATH_WORKSPACE%:/home/workspace --entrypoint="/home/workspace/docker/scripts/dbm-update.sh" changelog %AMBIENTE%

docker rm changelog

cd deploy