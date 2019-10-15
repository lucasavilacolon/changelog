databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-v3") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` CHANGE `img` `img` LONGTEXT CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL;  ")
            }
        }
    }
}