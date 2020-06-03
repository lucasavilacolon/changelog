databaseChangeLog = {

    changeSet(author: "David Rivero", id: "create-table-ws-logwebservices") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `ws_logwebservices` (`log_webservice_id` int(11) NOT NULL AUTO_INCREMENT, `name` varchar(125) NOT NULL, `code` varchar(12) NOT NULL, `description` longtext, `status` varchar(10) DEFAULT NULL, `status_message` varchar(125) DEFAULT NULL, `created_at` datetime DEFAULT NULL, `updated_at` datetime DEFAULT NULL, PRIMARY KEY (`log_webservice_id`));")
            }
        }
    }
}