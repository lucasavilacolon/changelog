databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-partner") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `partners` ADD COLUMN `is_leadtoneotel` TINYINT(1) NULL DEFAULT 0 AFTER `logo`,ADD COLUMN `is_leadtomail` TINYINT(1) NULL DEFAULT 0 AFTER `is_leadtoneotel`,ADD COLUMN `email` VARCHAR(100) NULL AFTER `is_leadtomail`;")
            }
        }
    }
}