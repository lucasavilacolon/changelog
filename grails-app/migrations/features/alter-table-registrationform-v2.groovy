databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-registrationform-v2") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `registration_forms` DROP `isRequired`;")
            }
        }
    }
}