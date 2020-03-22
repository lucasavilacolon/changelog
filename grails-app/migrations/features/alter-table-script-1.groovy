databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-script-1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `script` ADD PRIMARY KEY (`id_script`);")
            }
        }
    }
}