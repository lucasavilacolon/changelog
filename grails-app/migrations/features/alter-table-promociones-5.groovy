databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-promociones-5") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `promociones` CHANGE `created_at` `created_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP;")                
            }
        }
    }
}