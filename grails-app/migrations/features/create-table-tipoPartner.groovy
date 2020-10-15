databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-tipoPartner") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `tipo_partner` ( `idTipoPartner` int(11) NOT NULL, `tipoPartner_txt` varchar(300) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;")
            }
        }
    }
}