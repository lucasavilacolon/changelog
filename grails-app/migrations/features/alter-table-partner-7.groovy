databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-partner-7") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `partners` ADD COLUMN `channel` VARCHAR(45) NULL DEFAULT NULL AFTER `entity_name`;")

            }
        }
    }
}