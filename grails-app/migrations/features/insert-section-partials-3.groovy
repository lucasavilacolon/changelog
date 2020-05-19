databaseChangeLog = {

    changeSet(author: "David Rivero", id: "insert-section-partials-3") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `bse_section_partials`(`partial_id`, `partial_name`, `partial_code`, `partial_type`, `order`, `is_required`, `section_id`) VALUES (3, 'Imagen', 'url_image', 'file', 2, 1, 1);")
            }
        }
    }
}