databaseChangeLog = {

    changeSet(author: "German Middi", id: "insert-table-gral_text") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `gral_text` (`id_text`, `section`, `title`, `text`) VALUES (1, 'GENERAL', 'Términos y Condiciones', '');")
            }
        }
    }
}