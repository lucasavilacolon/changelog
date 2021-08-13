databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-leads") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `leads` (  `idLead` int(11) NOT NULL AUTO_INCREMENT,  `dni` int(8) NOT NULL,  `name` varchar(60) COLLATE utf8_bin DEFAULT NULL,  `lastname` varchar(60) COLLATE utf8_bin DEFAULT NULL,  `email` varchar(100) COLLATE utf8_bin DEFAULT NULL,  `areacode` int(4) DEFAULT NULL,  `cellphone` int(8) DEFAULT NULL,  `coupon_used` timestamp NULL DEFAULT NULL,  `createdBy` int(11) DEFAULT NULL,  `createdDate` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),  `updatedBy` int(11) DEFAULT NULL,  `updatedDate` timestamp NULL DEFAULT NULL ON UPDATE current_timestamp(),  PRIMARY KEY (`idLead`)) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;")
            }
        }
    }
}