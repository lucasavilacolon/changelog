databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-clients-3") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE clients MODIFY areacode varchar(4) default null;")
            }
        }
    }
}