databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-1") {

        grailsChange {
            change {
                sql.execute("alter table products add column seoTitle varchar(120) default null after createdBy;")
            }
        }
    }
}