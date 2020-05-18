databaseChangeLog = {

    changeSet(author: "David Rivero", id: "alter-table-features-1") {

        grailsChange {
            change {
                sql.execute("update features set isDelete = 0;")
            }
        }
    }
}
