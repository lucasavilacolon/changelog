databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orders-payment") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE orders_payment ADD COLUMN assit_payment_id int(11) after idOrderHdr;")
            }
        }
    }
}