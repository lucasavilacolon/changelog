databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `fncheckout` VARCHAR(255) NULL AFTER `linea_emision`;")
            }
        }
    }
}