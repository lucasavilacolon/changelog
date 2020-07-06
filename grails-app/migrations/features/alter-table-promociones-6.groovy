databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-promociones-6") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `promociones` CHANGE `cupon` `cupon` VARCHAR(10) NOT NULL;")
            }
        }
    }
}