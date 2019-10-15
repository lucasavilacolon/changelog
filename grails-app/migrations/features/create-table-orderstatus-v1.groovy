databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-orderstatus-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `orders_status` ( `idOrderStatus` INT NOT NULL AUTO_INCREMENT , `txtOrderStatus` VARCHAR(50) NOT NULL , `description` VARCHAR(250) NOT NULL , PRIMARY KEY (`idOrderStatus`)) ENGINE = InnoDB;")
            }
        }
    }
}