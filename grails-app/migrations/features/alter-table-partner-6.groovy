databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-partner-6") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `partners` ADD COLUMN `platform` VARCHAR(45) NULL DEFAULT NULL AFTER `entity_name`;")

            }
        }
    }
}