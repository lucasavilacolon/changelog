databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-tipopromocion") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `tipo_promocion` ( `idTipo_promocion` INT(11) NOT NULL, `tipo` VARCHAR(45) NOT NULL, PRIMARY KEY (`idTipo_promocion`));")
                
            }
        }
    }
}