databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-faq-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `faqs` (`idFaq` int(11) NOT NULL,`question` varchar(200) COLLATE utf8_bin NOT NULL,`answer` text COLLATE utf8_bin NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;")
            }
        }
    }
}