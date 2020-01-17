databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-auth_sessions") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `auth_sessions`;")
            }
        }
    }
}