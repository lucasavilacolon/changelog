databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-features") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `features`;")
            }
        }
    }
}