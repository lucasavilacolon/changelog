databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-products") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `products`;")
            }
        }
    }
}