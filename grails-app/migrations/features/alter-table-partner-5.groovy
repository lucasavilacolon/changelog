databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-partner-5") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `partners` ADD COLUMN `entity_name` VARCHAR(45) NULL DEFAULT NULL AFTER `entity_code`;")

            }
        }
    }
}