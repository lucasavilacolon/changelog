databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-product-v1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `products` ADD `rama_id` INT(11) NOT NULL AFTER `isDelete`, ADD `producto_id` INT(11) NOT NULL AFTER `rama_id`, ADD `plan_id` INT(11) NOT NULL AFTER `producto_id`, ADD `canal_id` INT(11) NOT NULL AFTER `plan_id`, ADD `subcanal_id` INT(11) NOT NULL AFTER `canal_id`, ADD `linea_emision` INT(11) NOT NULL AFTER `subcanal_id`;")
            }
        }
    }
}