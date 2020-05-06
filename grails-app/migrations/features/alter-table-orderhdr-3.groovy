databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderhdr-3") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `orders_hdr` ADD `isDeleted` BOOLEAN NOT NULL AFTER `total`;")
            }
        }
    }
}