databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orders_reg_forms-1") {

        grailsChange {
            change {
                sql.execute("alter table orders_reg_forms add column item varchar(20) after `value`;")
            }
        }
    }
}