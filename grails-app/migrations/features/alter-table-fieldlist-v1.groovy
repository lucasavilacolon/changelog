databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-fieldlist-v1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `field_list` CHANGE `type` `type` VARCHAR(200) NOT NULL;")
            }
        }
    }
}