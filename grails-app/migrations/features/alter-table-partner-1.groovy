databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-partner-1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `partners` CHANGE COLUMN `idPartner` `idPartner` INT(11) NOT NULL AUTO_INCREMENT , ADD PRIMARY KEY (`idPartner`);")
            }
        }
    }
}