databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-sessions") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `ci_sessions`;")
            }
        }
    }
}