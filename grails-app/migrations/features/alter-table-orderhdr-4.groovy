databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderhdr-4") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `orders_hdr` ADD COLUMN `idPromocion` INT(11) NULL AFTER `idStatusOrder`, ADD INDEX `order_promocion_fk_idx` (`idPromocion` ASC);")
                
            }
        }
    }
}