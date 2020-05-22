databaseChangeLog = {

    changeSet(author: "David Rivero", id: "create-table-ws-marcas") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `ws_marcas` (`id` int(11) NOT NULL AUTO_INCREMENT, `name` varchar(125) NOT NULL, PRIMARY KEY (`id`));")
            }
        }
    }
}