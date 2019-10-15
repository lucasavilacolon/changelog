databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-relprodfaq-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `rel_prod_faq` (`idRel` int(11) NOT NULL,`idProduct` int(11) NOT NULL,`idFaqs` int(11) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;")
            }
        }
    }
}