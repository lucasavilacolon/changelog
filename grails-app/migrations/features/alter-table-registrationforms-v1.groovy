databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-registrationforms-v1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `registration_forms` ADD `idProduct` INT NOT NULL AFTER `idRegistrationForm`;")
            }
        }
    }
}