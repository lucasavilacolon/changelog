databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-script-2") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `script` MODIFY `id_script` int(11) NOT NULL AUTO_INCREMENT;")
            }
        }
    }
}