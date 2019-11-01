databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderitm") {

        grailsChange {
            change {
                sql.execute("alter table orders_itm MODIFY column price double default 0;")
            }
        }
    }
}