databaseChangeLog = {

    changeSet(author: "German Middi", id: "add-config-1") {

        grailsChange {
            change {
                sql.execute("TRUNCATE TABLE `config`;")
            }
        }
    }
}