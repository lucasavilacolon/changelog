databaseChangeLog = {

    changeSet(author: "David Rivero", id: "create-table-section-partials") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `bse_section_partials` (`partial_id` int(11) NOT NULL AUTO_INCREMENT, `partial_name` varchar(125) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL, `partial_code` varchar(80) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL, `partial_type` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL, `order` int(11) NOT NULL, `is_required` tinyint(4) NOT NULL, `section_id` int(11) NOT NULL, PRIMARY KEY (`partial_id`) , INDEX `fk_partialdx` (`section_id` ASC) USING BTREE) ENGINE = InnoDB DEFAULT CHARACTER SET = latin1 COLLATE = latin1_swedish_ci;")
            }
        }
    }
}
