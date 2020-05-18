databaseChangeLog = {

    changeSet(author: "David Rivero", id: "create-table-home-partials") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `bse_home_partials` (`home_partial_id` int(11) NOT NULL AUTO_INCREMENT, `home_id` int(11) NOT NULL, `partial_id` int(11) NOT NULL, `value` longtext CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL, `deleted` tinyint(4) NOT NULL, `created_at` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP, `updated_at` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP, PRIMARY KEY (`home_partial_id`) , INDEX `homeixxd_ix` (`home_id` ASC) USING BTREE, INDEX `partial_id_iodxx` (`partial_id` ASC) USING BTREE) ENGINE = InnoDB DEFAULT CHARACTER SET = latin1 COLLATE = latin1_swedish_ci;")
            }
        }
    }
}
