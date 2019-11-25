databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderspayment2") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE orders_payment MODIFY assit_payment_id varchar(80) default null;")
            }
        }
    }
}