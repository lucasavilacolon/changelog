databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-orderhdr-5") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `orders_hdr` ADD CONSTRAINT `order_promocion_fk`  FOREIGN KEY (`idPromocion`)  REFERENCES `promociones` (`idPromocion`)  ON DELETE NO ACTION  ON UPDATE NO ACTION;")
                
            }
        }
    }
}