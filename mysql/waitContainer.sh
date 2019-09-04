#!/bin/bash

#CONTAINER="b2c_backend"
#MESSAGE='Tomcat started on port(s): '

CONTAINER=$1
MESSAGE=$2

checkSupervisor() {
   docker logs "$CONTAINER" 2>&1 | cat | grep -q "$MESSAGE"
}

checkContenedor(){

	echo "esperando contenedor: $CONTAINER"
        checkSupervisor
        while [ "$?" != "0" ]
        do
           seconds=$((seconds+1))
           echo -n '.'
           sleep 1

           checkSupervisor
        done

        echo ""
        echo "Listo. Tardó $seconds segundos."
}

checkContenedor
