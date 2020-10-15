databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-17") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `whatsapp_message` VARCHAR(300) NULL AFTER `whatsapp_number`;")
                
            }
        }
    }
}