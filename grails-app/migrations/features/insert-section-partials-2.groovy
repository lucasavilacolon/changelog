databaseChangeLog = {

    changeSet(author: "David Rivero", id: "insert-section-partials-2") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `bse_section_partials`(`partial_id`, `partial_name`, `partial_code`, `partial_type`, `order`, `is_required`, `section_id`) VALUES (2, 'Descripción', 'description', 'textarea', 1, 1, 1);")
            }
        }
    }
}