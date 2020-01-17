databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-orders_itm") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `orders_itm`;")
            }
        }
    }
}