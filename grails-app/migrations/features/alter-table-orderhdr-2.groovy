databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderhdr-2") {

        grailsChange {
            change {
                sql.execute("alter table orders_hdr add column policy_number varchar(40) default null after idClient;")
            }
        }
    }
}