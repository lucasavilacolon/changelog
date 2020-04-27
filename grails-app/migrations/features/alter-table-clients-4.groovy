databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-clients-4") {

        grailsChange {
            change {
                sql.execute("alter table clients MODIFY column telephone varchar(12);")
            }
        }
    }
}