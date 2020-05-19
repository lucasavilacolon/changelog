databaseChangeLog = {

    changeSet(author: "David Rivero", id: "alter-table-section-partials") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `bse_section_partials` ADD CONSTRAINT `fk_partialdx` FOREIGN KEY (`section_id`) REFERENCES `bse_sections` (`section_id`) ON DELETE NO ACTION ON UPDATE NO ACTION; ")
            }
        }
    }
}