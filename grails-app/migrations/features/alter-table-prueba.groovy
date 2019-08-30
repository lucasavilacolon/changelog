databaseChangeLog = {

    changeSet(author: "Lucas Avila", id: "feature-alter-table") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE tabla_prueba ADD COLUMN apellido VARCHAR(255)")
            }
        }
    }
}