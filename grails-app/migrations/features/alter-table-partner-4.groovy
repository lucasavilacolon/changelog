databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-partner-4") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `partners` ADD COLUMN `entity_code` VARCHAR(45) NULL DEFAULT NULL AFTER `credential`;")

            }
        }
    }
}