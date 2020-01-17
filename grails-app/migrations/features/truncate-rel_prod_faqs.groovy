databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-rel_prod_faqs") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `rel_prod_faqs`;")
            }
        }
    }
}