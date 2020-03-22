databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-gral_text-2") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `gral_text` MODIFY `id_text` int(11) NOT NULL AUTO_INCREMENT;")
            }
        }
    }
}