databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-gral_text-1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `gral_text` ADD PRIMARY KEY (`id_text`);")
            }
        }
    }
}