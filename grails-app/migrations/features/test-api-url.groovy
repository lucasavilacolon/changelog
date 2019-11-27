databaseChangeLog = {

    changeSet(author: "German Middi", id: "test-api-url") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `products` (`idProduct`, `title`, `description`, `price`, `img`, `idSaleCondition`, `isFeatured`, `isActive`, `isDelete`, `createdBy`, `createdDate`, `updatedBy`, `updatedDate`) VALUES
(6, 'test', '', '450.00', '', 2, 1, 0, NULL, 0, '2019-09-30 19:50:08', 0, '2019-10-18 02:56:39');")
            }
        }
    }
}

