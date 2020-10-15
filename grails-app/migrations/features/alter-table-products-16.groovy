databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-16") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `whatsapp_number` VARCHAR(14) NULL AFTER `html_planes`;")
                
            }
        }
    }
}