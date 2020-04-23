databaseChangeLog = {

    changeSet(author: "David Rivero", id: "rel_prod_features-1") {

        grailsChange {
            change {
                sql.execute("alter table rel_prod_features add column position int default null after createdBy;")
            }
        }
    }
}
