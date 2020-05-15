databaseChangeLog = {

    changeSet(author: "David Rivero", id: "insert-section-partials") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `e_colon`.`bse_section_partials`(`partial_id`, `partial_name`, `partial_code`, `partial_type`, `order`, `is_required`, `section_id`) VALUES (1, 'Título', 'title', 'text', 0, 1, 1);INSERT INTO `e_colon`.`bse_section_partials`(`partial_id`, `partial_name`, `partial_code`, `partial_type`, `order`, `is_required`, `section_id`) VALUES (2, 'Descripción', 'description', 'textarea', 1, 1, 1);INSERT INTO `e_colon`.`bse_section_partials`(`partial_id`, `partial_name`, `partial_code`, `partial_type`, `order`, `is_required`, `section_id`) VALUES (3, 'Imagen', 'url_image', 'file', 2, 1, 1);")
            }
        }
    }
}