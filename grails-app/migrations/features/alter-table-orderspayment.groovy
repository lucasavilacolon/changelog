databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderspayment") {

        grailsChange {
            change {
                sql.execute("alter table orders_payment add column status_payment varchar(40) default null, add column status_payment_detail varchar(40) default null;")
            }
        }
    }
}