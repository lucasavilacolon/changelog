databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-promociones-2") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `promociones` MODIFY `idPromocion` int(11) NOT NULL AUTO_INCREMENT;")
                
            }
        }
    }
}