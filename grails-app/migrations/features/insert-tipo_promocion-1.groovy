databaseChangeLog = {

    changeSet(author: "German Middi", id: "insert-tipo_promocion-1") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `tipo_promocion` (`idTipo_promocion`, `tipo`) VALUES ('2', 'Promo producto simple');")
                
            }
        }
    }
}