databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-review_values") {

        grailsChange {
            change {
                sql.execute("update review_values set txtValue = 'Bueno' where 	idValue = 3;")
            }
        }
    }
}

