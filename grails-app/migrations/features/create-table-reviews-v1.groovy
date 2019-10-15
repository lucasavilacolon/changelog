databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-reviews-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `reviews` (`idReview` INT NOT NULL AUTO_INCREMENT , `idProduct` INT NOT NULL , `idValue` INT NOT NULL , `comment` LONGTEXT NOT NULL , `isActive` TINYINT NOT NULL,`autor` VARCHAR(60) NOT NULL,`createdBy` INT NOT NULL , `createdDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updatedBy` INT NOT NULL , `updatedDate` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`idReview`) ENGINE = InnoDB;")
            }
        }
    }
}