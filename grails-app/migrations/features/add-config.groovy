databaseChangeLog = {

    changeSet(author: "German Middi", id: "add-config") {

        grailsChange {
            change {
                sql.execute("INSERT INTO `config` (`idConfig`, `section`, `name`, `parameter`, `value`) VALUES (1, 'checkout_webservice', 'tst_assist_pago_dev', 'platform', 'mercadopago'), (2, 'checkout_webservice', 'tst_assist_pago_dev', 'channel', 'ecommerce'), (3, 'checkout_webservice', 'tst_assist_pago_dev', 'webhookChannel_URL', 'https://ecolon.onmedia.com.ar/contratar/emission'), (4, 'checkout_webservice', 'tst_assist_pago_dev', 'webhookChannel_REDIRECT', 'true'), (5, 'checkout_webservice', 'tst_assist_pago_dev', 'product_methods', 'credit'), (6, 'checkout_webservice', 'tst_assist_pago_dev', 'actionAfter', 'saveup-customer-recurring'), (7, 'checkout_webservice', 'tst_assist_pago_dev', 'origin', 'http://colonseguros.com.ar'), (8, 'checkout_webservice', 'tst_assist_pago_prod', 'platform', 'mercadopago'), (9, 'checkout_webservice', 'tst_assist_pago_prod', 'channel', 'ecommerce'), (10, 'checkout_webservice', 'tst_assist_pago_prod', 'webhookChannel_URL', 'https://ecolonpreprod.ecolon.com.ar/ecommerce_assist/contratar/emission'), (11, 'checkout_webservice', 'tst_assist_pago_prod', 'webhookChannel_REDIRECT', 'true'), (12, 'checkout_webservice', 'tst_assist_pago_prod', 'product_methods', 'credit'), (13, 'checkout_webservice', 'tst_assist_pago_prod', 'actionAfter', 'saveup-customer-recurring'), (14, 'checkout_webservice', 'tst_assist_pago_prod', 'origin', 'http://colonseguros.com.ar');")
            }
        }
    }
}