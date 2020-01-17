databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-field_list") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `field_list`;")
            }
        }
    }
}