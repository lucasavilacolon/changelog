databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-12") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `idParent` INT NOT NULL AFTER `featureTitle`;")
                
            }
        }
    }
}