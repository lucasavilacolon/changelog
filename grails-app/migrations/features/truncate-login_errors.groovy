databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-login_errors") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `login_errors`;")
            }
        }
    }
}