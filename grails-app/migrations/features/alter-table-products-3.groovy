databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-3") {

        grailsChange {
            change {
                sql.execute("alter table products add column seoDescription varchar(255) default null after seoTitle;")
                
            }
        }
    }
}