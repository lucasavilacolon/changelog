databaseChangeLog = {

    changeSet(author: "David Rivero", id: "insert-data-ws-logwebservices-2") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `ws_logwebservices`(`log_webservice_id`, `name`, `code`, `description`, `status`, `status_message`, `created_at`, `updated_at`) VALUES (2, 'Servicio de Marcas', 'BRAND_DATA', 'Servicio para actualizar base de marcas', 'OK', 'Carga exitosa', '2020-05-20 18:19:49', '2020-05-22 06:47:49');")
            }
        }
    }
}