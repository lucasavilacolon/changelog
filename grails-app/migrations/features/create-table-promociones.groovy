databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-promociones") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `promociones` ( `idPromocion` int(11) NOT NULL, `idTipoPromocion` int(11) NOT NULL, `idProducto` int(11) NOT NULL, `cupon` varchar(6) NOT NULL, `fecha_inicio` date NOT NULL, `fecha_fin` date NOT NULL, `price` double NOT NULL, `percent` int(11) DEFAULT NULL, `terms` longtext DEFAULT NULL, `is_active` int(1) DEFAULT NULL, `is_delete` int(1) DEFAULT NULL, `created_by` varchar(99) DEFAULT NULL, `created_at` date DEFAULT NULL, `updated_by` varchar(99) DEFAULT NULL, `updated_at` date DEFAULT NULL ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;")
                
            }
        }
    }
}