databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-partner-2") {

        grailsChange {
            change {
                sql.execute('ALTER TABLE `ecolon`.`partners` ADD COLUMN `credential` LONGTEXT NULL DEFAULT NULL AFTER `link`;')

            }
        }
    }
}