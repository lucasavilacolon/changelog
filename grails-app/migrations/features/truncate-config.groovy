databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-config") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `config`;")
            }
        }
    }
}