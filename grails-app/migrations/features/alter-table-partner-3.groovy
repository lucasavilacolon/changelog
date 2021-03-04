databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-partner-3") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `partners` ADD COLUMN `credential` LONGTEXT NULL DEFAULT NULL AFTER `link`;")

            }
        }
    }
}