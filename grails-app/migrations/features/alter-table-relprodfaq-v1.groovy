databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-relprodfaq-v1") {

        grailsChange {
            change {
                sql.execute("ALTER TABLE `rel_prod_faq` ADD PRIMARY KEY (`idRel`);")
            }
        }
    }
}