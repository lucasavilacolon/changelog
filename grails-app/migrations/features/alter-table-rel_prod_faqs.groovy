databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-rel_prod_faqs") {

        grailsChange {
            change {
                sql.execute("alter table rel_prod_faqs add column position int(11) not null after idFaq;")
            }
        }
    }
}