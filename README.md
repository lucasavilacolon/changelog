Se debe tener instalado en la pc previamente (docker y mysql en localhost puerto 3306)

Para ejecutar con Linux/Mac/Windows las modificaciones sobre la base de datos.

1- Se tiene que poner la ip de la maquina local en el archivo grails-app/conf/application.yml en la url del host (linea 107)

2- Ir al directorio docker/ y ejecutar el archivo ./build.sh (build.bat en windows)
Esto generará una imagen de docker la cual se ejecutara con el script de abajo

3- Ir al directorio deploy/ y ejecutar el archivo ./run.sh (run.bat en windows)

NOTA: Este script ejecutara el changelog sin importar que version de gradle/grails/java/groovy tengan instalados en la pc local.
