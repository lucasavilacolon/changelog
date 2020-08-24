databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-10") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `idVisibility` INT NOT NULL AFTER `isActive`;")
                
            }
        }
    }
}