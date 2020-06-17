databaseChangeLog = {

    changeSet(author: "David Rivero", id: "create-table-ws-localidades") {

        grailsChange {
            change {
                sql.execute("CREATE TABLE `ws_localidades` (`id` int(11) NOT NULL AUTO_INCREMENT, `id_localidad` int(11) NOT NULL, `id_provincia` int(11) NOT NULL, `descripcion_provincia` varchar(125) DEFAULT NULL, `descripcion_localidad` varchar(125) DEFAULT NULL, `codigo_postal` char(4) DEFAULT NULL, `id_zona_riesgo` int(11) DEFAULT NULL, `orden` int(11) DEFAULT NULL, PRIMARY KEY (`id`));")
            }
        }
    }
}