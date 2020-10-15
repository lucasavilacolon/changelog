databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-18") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `terms_conditions` TEXT NULL AFTER `whatsapp_message`;")
                
            }
        }
    }
}