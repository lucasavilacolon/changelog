databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-script") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `script` (`id_script` int(11) NOT NULL,`instance` varchar(4) NOT NULL,`position` varchar(6) NOT NULL,`name` varchar(100) NOT NULL,`script` longtext NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;")
            }
        }
    }
}