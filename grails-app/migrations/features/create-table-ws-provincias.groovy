databaseChangeLog = {

    changeSet(author: "David Rivero", id: "create-table-ws-provincias") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `ws_provincias` (`id` int(11) NOT NULL, `descripcion` varchar(125) DEFAULT NULL, `paisId` int(11) NOT NULL, PRIMARY KEY (`id`));")
            }
        }
    }
}