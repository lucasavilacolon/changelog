databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-products-6") {

        grailsChange {
            change {
                sql.execute("alter table products add column alias_menu varchar(125) after title;")
                
            }
        }
    }
}