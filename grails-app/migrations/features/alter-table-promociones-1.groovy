databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-promociones-1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `promociones` ADD PRIMARY KEY (`idPromocion`), ADD KEY `tipo_promocion_fk_idx` (`idTipoPromocion`);")
                
            }
        }
    }
}