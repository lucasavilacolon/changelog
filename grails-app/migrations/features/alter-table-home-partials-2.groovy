databaseChangeLog = {

    changeSet(author: "David Rivero", id: "alter-table-home-partials-2") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `bse_home_partials` ADD CONSTRAINT `homeixxd_ix` FOREIGN KEY (`home_id`) REFERENCES `bse_home_elements` (`home_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;")
            }
        }
    }
}