databaseChangeLog = {

    changeSet(author: "Lucas Avila", id: "feature-tabla-prueba") {

	createTable(tableName: "tabla_prueba") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "addressPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "nombre", type: "VARCHAR(255)")
        }
    }
}
