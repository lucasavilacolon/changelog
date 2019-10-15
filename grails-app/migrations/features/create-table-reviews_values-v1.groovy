databaseChangeLog = {

    changeSet(author: "German Middi", id: "create-table-reviews_values-v1") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `review_values` (`idValue` INT NOT NULL AUTO_INCREMENT ,`txtValue` VARCHAR(200) NOT NULL , `description` LONGTEXT NOT NULL , PRIMARY KEY (`idValue`)) ENGINE = InnoDB;")
            }
        }
    }
}