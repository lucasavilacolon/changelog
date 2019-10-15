databaseChangeLog = {

    changeSet(author: "German Middi", id: "insert-table-reviews_values-v1") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `review_values` (`idValue`, `txtValue`, `description`)VALUES(1, 'Malo', 'puntuación de 1 a 2'),(2, 'Regular', 'Puntuación de 3 a 4'),(3, 'Buenon', 'puntuación de 5 a 6'),(4, 'Muy bueno', 'Puntuación de 7 a 8'),(5, 'Excelente', 'Puntuación de 9 a 10');")
            }
        }
    }
}