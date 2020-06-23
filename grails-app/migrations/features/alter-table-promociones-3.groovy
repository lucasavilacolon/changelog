databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-promociones-3") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `promociones` ADD CONSTRAINT `tipo_promocion_fk` FOREIGN KEY (`idTipoPromocion`) REFERENCES `tipo_promocion` (`idTipo_promocion`) ON DELETE NO ACTION ON UPDATE NO ACTION; COMMIT;")
                
            }
        }
    }
}