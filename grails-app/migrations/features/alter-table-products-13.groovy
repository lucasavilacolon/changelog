databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-13") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` CHANGE `createdBy` `createdBy` INT(11) NOT NULL AFTER `html_planes`;")
                
            }
        }
    }
}