databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-orderitm-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `orders_itm` ( `idOrderItm` INT NOT NULL AUTO_INCREMENT , `idOrderHdr` INT NOT NULL , `idProduct` INT NOT NULL , `position` INT NOT NULL , `quantity` INT NOT NULL , `price` INT NOT NULL , `idPromotion` INT NOT NULL , `createdBy` INT NOT NULL , `createdDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updateBy` INT NOT NULL , `updateDate` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`idOrderItm`)) ENGINE = InnoDB;")
            }
        }
    }
}