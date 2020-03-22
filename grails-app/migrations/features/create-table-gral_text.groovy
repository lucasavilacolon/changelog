databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-gral_text") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `gral_text` (`id_text` int(11) NOT NULL,`section` varchar(60) NOT NULL,`title` varchar(60) NOT NULL,`text` longtext NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;")
            }
        }
    }
}