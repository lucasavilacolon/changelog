databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-orderhdr-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `orders_hdr` (  `idOrder` int(11) NOT NULL, `idUser` int(11) NOT NULL, `created` date NOT NULL, `idStatusOrder` int(11) NOT NULL, `total` int(11) NOT NULL, `createdBy` int(11) NOT NULL, `createdDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP, `updateBy` int(11) NOT NULL, `updateDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;")
            }
        }
    }
}