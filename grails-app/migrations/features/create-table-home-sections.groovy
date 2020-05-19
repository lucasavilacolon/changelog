databaseChangeLog = {

    changeSet(author: "David Rivero", id: "create-table-home-sections") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `bse_sections` (`section_id` int(11) NOT NULL AUTO_INCREMENT, `name` varchar(125) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL, `description` longtext CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL, `created_at` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP, `updated_at` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP, PRIMARY KEY (`section_id`)) ENGINE = InnoDB DEFAULT CHARACTER SET = latin1 COLLATE = latin1_swedish_ci;")
            }
        }
    }
}