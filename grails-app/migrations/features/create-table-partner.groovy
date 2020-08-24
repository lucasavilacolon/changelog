databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-partner") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `partners` (   `idPartner` int(11) NOT NULL,   `nombre` varchar(100) NOT NULL,   `idTipoPartner` int(11) NOT NULL,   `logo` varchar(300) NOT NULL,   `link` varchar(200) DEFAULT NULL,   `createdBy` int(11) DEFAULT NULL,   `createdAt` date DEFAULT NULL,   `updatedBy` int(11) DEFAULT NULL,   `updatedAt` date NOT NULL ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;")
            }
        }
    }
}