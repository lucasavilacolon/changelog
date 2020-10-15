databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-9") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `desc_pre_title` LONGTEXT NULL AFTER `description`;")
                
            }
        }
    }
}