databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-registration_forms") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `registration_forms`;")
            }
        }
    }
}