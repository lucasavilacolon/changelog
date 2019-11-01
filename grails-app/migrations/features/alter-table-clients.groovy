databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-clients") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `clients` ADD `createdBy` INT(11) NOT NULL AFTER `dpto`, ADD `createdDate` TIMESTAMP NOT NULL AFTER `createdBy`, ADD `updatedBy` INT(11) NOT NULL AFTER `createdDate`, ADD `updatedDate` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL AFTER `updatedBy`, ADD `addlead` BOOLEAN NULL DEFAULT FALSE AFTER `dpto`;")
            }
        }
    }
}