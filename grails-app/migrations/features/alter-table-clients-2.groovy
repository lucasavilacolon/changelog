databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-clients-2") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE clients MODIFY telephone varchar(12) default null;")
            }
        }
    }
}