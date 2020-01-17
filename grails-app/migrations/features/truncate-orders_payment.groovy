databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-orders_payment") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `orders_payment`;")
            }
        }
    }
}