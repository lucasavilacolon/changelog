databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderhdr") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `orders_hdr` CHANGE `idUser` `idClient` INT(11) NOT NULL;")
            }
        }
    }
}