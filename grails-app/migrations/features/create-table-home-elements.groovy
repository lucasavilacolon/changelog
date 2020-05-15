sdatabaseChangeLog = {

    changeSet(author: "David Rivero", id: "create-table-home-elements") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `bse_home_elements` (`home_id` int(11) NOT NULL AUTO_INCREMENT, `item` int(11) NULL DEFAULT NULL, `section_id` int(11) NOT NULL, `deleted` tinyint(4) NOT NULL, `created_at` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP, `updated_at` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP, PRIMARY KEY (`home_id`) , INDEX `sectiondixx_id` (`section_id` ASC) USING BTREE) ENGINE = InnoDB DEFAULT CHARACTER SET = latin1 COLLATE = latin1_swedish_ci;")
            }
        }
    }
}
