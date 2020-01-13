databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-5") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `featureTitle` VARCHAR(100) NOT NULL AFTER `seoKeyword`;")
                
            }
        }
    }
}