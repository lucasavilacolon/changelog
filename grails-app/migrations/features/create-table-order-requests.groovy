databaseChangeLog = {

    changeSet(author: "David Rivero", id: "create-table-order-requests") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `orders_requests` (`order_request_id` int(11) NOT NULL AUTO_INCREMENT, `order_id` int(11) DEFAULT NULL, `endpoint` varchar(255) NOT NULL, `request_payload` json DEFAULT NULL, `response_payload` json DEFAULT NULL, `created_at` datetime NOT NULL, `request_name` varchar(125) DEFAULT NULL, `status_code` varchar(12) NOT NULL, PRIMARY KEY (`order_request_id`), KEY `fk_orderreqidx` (`order_id`)) ENGINE=InnoDB;")
            }
        }
    }
}