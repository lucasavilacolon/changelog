databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orders_reg_forms-2") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `orders_reg_forms` ADD `neotal_label` VARCHAR(100) NOT NULL AFTER `value`, ADD `neotel_value` VARCHAR(100) NOT NULL AFTER `neotal_label`;")
            }
        }
    }
}

