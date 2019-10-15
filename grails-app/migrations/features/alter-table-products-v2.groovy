databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-v2") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` DROP `idregistrationForm`;")
            }
        }
    }
}