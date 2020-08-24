databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-14") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `idPartner` INT NULL AFTER `featureTitle`;")
                
            }
        }
    }
}