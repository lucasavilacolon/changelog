databaseChangeLog = {

    changeSet(author: "German Middi", id: "truncate-orders_reg_forms") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `orders_reg_forms`;")
            }
        }
    }
}