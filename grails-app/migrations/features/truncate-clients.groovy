databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-clients") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `clients`;")
            }
        }
    }
}