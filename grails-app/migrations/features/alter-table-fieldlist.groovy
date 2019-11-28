databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-fieldlist") {

        grailsChange {
            change {
                sql.execute("alter table field_list add column internal_code varchar(125) default null after label")
            }
        }
    }
}

