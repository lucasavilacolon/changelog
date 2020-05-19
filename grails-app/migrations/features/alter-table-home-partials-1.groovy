databaseChangeLog = {

    changeSet(author: "David Rivero", id: "alter-table-home-partials-1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `bse_home_partials` ADD CONSTRAINT `partial_id_iodxx` FOREIGN KEY (`partial_id`) REFERENCES `bse_section_partials` (`partial_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;")
            }
        }
    }
}