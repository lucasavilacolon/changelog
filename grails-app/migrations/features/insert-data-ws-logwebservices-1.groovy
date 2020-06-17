databaseChangeLog = {

    changeSet(author: "David Rivero", id: "insert-data-ws-logwebservices-1") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `ws_logwebservices`(`log_webservice_id`, `name`, `code`, `description`, `status`, `status_message`, `created_at`, `updated_at`) VALUES (1, 'Servicio de provincias y localidades', 'PROV_LOC', 'Servicio para actualizar base de provincias y localidades', 'OK', 'Carga Ok', '2020-05-20 18:19:15', '2020-05-22 06:20:23');")
            }
        }
    }
}