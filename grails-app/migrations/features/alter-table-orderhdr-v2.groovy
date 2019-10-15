databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderhdr-v2") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `orders_hdr` MODIFY `idOrder` int(11) NOT NULL AUTO_INCREMENT;")
            }
        }
    }
}