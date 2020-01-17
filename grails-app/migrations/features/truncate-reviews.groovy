databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-reviews") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `reviews`;")
            }
        }
    }
}