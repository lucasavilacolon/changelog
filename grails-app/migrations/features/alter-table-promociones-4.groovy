databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-promociones-4") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `promociones` ADD `text` VARCHAR(300) NULL AFTER `percent`;")
                
            }
        }
    }
}