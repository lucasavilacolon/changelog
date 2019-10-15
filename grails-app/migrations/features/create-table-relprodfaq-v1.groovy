databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-relprodfaq-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `rel_prod_faqs` (   `idRelProdFaq` INT NOT NULL AUTO_INCREMENT ,   `idProduct` INT NOT NULL ,   `idFaq` INT NOT NULL ,   `createdBy` INT NOT NULL ,   `createdDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ,   `updatedBy` INT NOT NULL ,   `updatedDate` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ,   PRIMARY KEY (`idRelProdFaq`)) ENGINE = InnoDB;")
            }
        }
    }
}