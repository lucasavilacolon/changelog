databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-orderpayment-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `orders_payment` ( `idOrderPayment` INT NOT NULL AUTO_INCREMENT , `idOrderHdr` INT NOT NULL , `paymentUrl` VARCHAR(300) NOT NULL , `date` DATE NOT NULL , `time` TIME NOT NULL , `idPaymentStatus` INT NOT NULL , PRIMARY KEY (`idOrderPayment`)) ENGINE = InnoDB;")
            }
        }
    }
}