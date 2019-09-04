@ECHO OFF
cd ..
SET PATH_WORKSPACE=%cd%
ECHO %PATH_WORKSPACE%
SET PATH_DEPENDENCIES=%cd%\dependencies
ECHO %PATH_DEPENDENCIES% 
cd %PATH_WORKSPACE%
SET AMBIENTE=localhost

docker stop changelog
docker rm changelog

REM docker run --name changelog -v %PATH_DEPENDENCIES%:/root/.gradle -v %PATH_WORKSPACE%:/home/workspace --entrypoint "bash /home/workspace/docker/scripts/dbm-update-windows.sh" changelog "%AMBIENTE%"

docker run --name changelog -v %PATH_DEPENDENCIES%:/root/.gradle -v %PATH_WORKSPACE%:/home/workspace --entrypoint /home/workspace/docker/scripts/dbm-update-windows.sh changelog "localhost"

REM docker rm changelog

cd deploy
