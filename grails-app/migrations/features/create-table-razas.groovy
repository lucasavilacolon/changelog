databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-razas") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `razas` ( `id_raza` int(11) NOT NULL, `raza_tipo` int(11) NOT NULL, `raza_txt` varchar(50) NOT NULL, `is_active` tinyint(1) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;")

            }
        }
    }
}