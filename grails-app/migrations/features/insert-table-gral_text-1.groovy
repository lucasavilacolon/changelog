databaseChangeLog = {

    changeSet(author: "German Middi", id: "insert-table-gral_text-1") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `gral_text` (`id_text`, `section`, `title`, `text`) VALUES (2, 'FOOTER', 'Copyright', '');")
            }
        }
    }
}