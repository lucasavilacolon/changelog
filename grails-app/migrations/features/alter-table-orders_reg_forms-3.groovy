databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orders_reg_forms-3") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `orders_reg_forms` CHANGE `neotal_label` `neotel_label` VARCHAR(100) NOT NULL;")
            }
        }
    }
}


