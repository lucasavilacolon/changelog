databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderhdr-1") {

        grailsChange {
            change {
                sql.execute("alter table orders_hdr MODIFY column total double default 0;")
            }
        }
    }
}