package features

databaseChangeLog = {

	changeSet(author: "German Middi", id: "insert-idorderstatus") {

		grailsChange {
			change {

				def lista = [
								[idOrderStatus: 0, txtOrderStatus: "INICIADO",description:'Cuando se da click en continuar en el paso 1'],
								[idOrderStatus: 1, txtOrderStatus: "PROCESANDO PAGO",description:'Cuando se muestra el paso 3 al usuario, pantalla de MP'],
								[idOrderStatus: 2, txtOrderStatus: "PAGADO",description:''],
								[idOrderStatus: 3, txtOrderStatus: "ERROR DE EMISION",description:'']
							]

				lista.forEach{item->sql.execute("INSERT INTO orders_status values (${item.idOrderStatus}, ${item.txtOrderStatus}, ${item.description})")}
			}
		}
	}
}