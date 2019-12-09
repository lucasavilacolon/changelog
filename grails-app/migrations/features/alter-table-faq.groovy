databaseChangeLog = {

    changeSet(author: "German Middi", id: "alter-table-faq") {

        grailsChange {
            change {
                sql.execute("alter table faqs add column deleted bit(1) not null after updatedDate;")
            }
        }
    }
}