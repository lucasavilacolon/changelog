databaseChangeLog = {

    changeSet(author: "David Rivero", id: "insert-home-sections") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `bse_sections` (`section_id`, `name`, `description`, `created_at`, `updated_at`) VALUES (1, 'Sección 1', '¿Por qué contratar una asistencia en eColón?', '2020-05-15 14:20:45', '2020-05-15 14:20:48');")
            }
        }
    }
}