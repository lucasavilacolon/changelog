databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-11") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `html_planes` LONGTEXT NULL AFTER `featureTitle`;")
                
            }
        }
    }
}