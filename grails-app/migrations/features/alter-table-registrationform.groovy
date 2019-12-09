databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-registrationform") {

        grailsChange {
            change {
                sql.execute("alter table registration_forms add column position int(11) not null after idField;")
            }
        }
    }
}