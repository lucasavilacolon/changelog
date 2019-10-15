databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderhdr-v1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `orders_hdr` ADD PRIMARY KEY (`idOrder`);")
            }
        }
    }
}