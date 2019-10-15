databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-faq-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `faqs` ( `idFaq` INT NOT NULL AUTO_INCREMENT , `question` TEXT NOT NULL , `answer` LONGTEXT NOT NULL , `createdBy` INT NOT NULL , `createdDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updatedBy` INT NOT NULL , `updatedDate` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`idFaq`) ) ENGINE = InnoDB;")
            }
        }
    }
}