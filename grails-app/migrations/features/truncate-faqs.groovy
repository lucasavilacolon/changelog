databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-faqs") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `faqs`;")
            }
        }
    }
}