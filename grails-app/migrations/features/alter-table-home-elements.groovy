databaseChangeLog = {

    changeSet(author: "David Rivero", id: "alter-table-home-elements") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `bse_home_elements` ADD CONSTRAINT `sectiondixx_id` FOREIGN KEY (`section_id`) REFERENCES `bse_sections` (`section_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;")
            }
        }
    }
}