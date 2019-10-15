databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-orderregform-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `orders_reg_forms` ( `idOrderRegForm` INT NOT NULL AUTO_INCREMENT , `idOrder` INT NOT NULL , `idField` INT NOT NULL , `value` VARCHAR(100) NOT NULL , PRIMARY KEY (`idOrderRegForm`)) ENGINE = InnoDB;")
            }
        }
    }
}