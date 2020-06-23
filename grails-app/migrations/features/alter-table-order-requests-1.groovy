databaseChangeLog = {

    changeSet(author: "David Rivero", id: "alter-table-order-requests-1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `orders_requests` ADD CONSTRAINT  `fk_orderreqidx` FOREIGN KEY(order_id) REFERENCES `orders_hdr` (`idOrder`) ON DELETE NO ACTION ON UPDATE NO ACTION;")
            }
        }
    }
}