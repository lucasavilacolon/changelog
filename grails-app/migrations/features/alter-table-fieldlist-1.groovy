databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-fieldlist-1") {

        grailsChange {
            change {
                sql.execute("alter table field_list add column deleted bit(1) not null;")
            }
        }
    }
}

