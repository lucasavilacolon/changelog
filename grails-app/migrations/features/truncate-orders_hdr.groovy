databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-orders_hdr") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `orders_hdr`;")
            }
        }
    }
}