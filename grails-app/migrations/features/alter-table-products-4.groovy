databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-4") {

        grailsChange {
            change {
                sql.execute("alter table products add column seoKeyword varchar(255) default null after seoDescription;")
                
            }
        }
    }
}