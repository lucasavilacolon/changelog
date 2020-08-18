databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-15") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `wsEmisionParamTipo` VARCHAR(20) NOT NULL AFTER `linea_emision`;")
                
            }
        }
    }
}