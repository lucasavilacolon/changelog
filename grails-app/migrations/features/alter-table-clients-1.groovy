databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-clients-1") {

        grailsChange {
            change {
                sql.execute("alter table clients add column birthDate date default null after lastname, add column gender char(1) default null after birthDate, add column zipCode char(4) default null after ciudad;")
            }
        }
    }
}