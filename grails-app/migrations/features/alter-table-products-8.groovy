databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-8") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` CHANGE `featureTitle` `featureTitle` VARCHAR(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL;")
                
            }
        }
    }
}