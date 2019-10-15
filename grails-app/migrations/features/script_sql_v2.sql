-- GMIDDI - 07/10/19 - Agregar campos en tabla Productos que relaciona los productos del eCommerce, con la BD Interna de eColon rama_id, producto_id, plan_id, canal_id, subcanal_id, linea_emision

-- ALTER TABLE `products` ADD `rama_id` INT(11) NOT NULL AFTER `isDelete`, ADD `producto_id` INT(11) NOT NULL AFTER `rama_id`, ADD `plan_id` INT(11) NOT NULL AFTER `producto_id`, ADD `canal_id` INT(11) NOT NULL AFTER `plan_id`, ADD `subcanal_id` INT(11) NOT NULL AFTER `canal_id`, ADD `linea_emision` INT(11) NOT NULL AFTER `subcanal_id`;


-- GMIDDI - 07/10/19 - Creación de tabla de Cabecera de los Pedidos

-- CREATE TABLE `orders_hdr` (
--   `idOrder` int(11) NOT NULL,
--   `idUser` int(11) NOT NULL,
--   `created` date NOT NULL,
--   `idStatusOrder` int(11) NOT NULL,
--   `total` int(11) NOT NULL,
--   `createdBy` int(11) NOT NULL,
--   `createdDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
--   `updateBy` int(11) NOT NULL,
--   `updateDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- ALTER TABLE `orders_hdr` ADD PRIMARY KEY (`idOrder`);

-- ALTER TABLE `orders_hdr` MODIFY `idOrder` int(11) NOT NULL AUTO_INCREMENT;


-- GMIDDI - 07/10/19 - Creación de tabla de Items de los Pedidos

-- CREATE TABLE `orders_itm` ( `idOrderItm` INT NOT NULL AUTO_INCREMENT , `idOrderHdr` INT NOT NULL , `idProduct` INT NOT NULL , `position` INT NOT NULL , `quantity` INT NOT NULL , `price` INT NOT NULL , `idPromotion` INT NOT NULL , `createdBy` INT NOT NULL , `createdDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updateBy` INT NOT NULL , `updateDate` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`idOrderItm`)) ENGINE = InnoDB;


-- GMIDDI - 07/10/19 - Creación de tabla de Estados para los pedidos

-- CREATE TABLE `orders_status` ( `idOrderStatus` INT NOT NULL AUTO_INCREMENT , `txtOrderStatus` VARCHAR(50) NOT NULL , `description` VARCHAR(250) NOT NULL , PRIMARY KEY (`idOrderStatus`)) ENGINE = InnoDB;

-- GMIDDI - 07/10/19 - Creación de tabla de Estados para los pedidos

-- CREATE TABLE `orders_payment` ( `idOrderPayment` INT NOT NULL AUTO_INCREMENT , `idOrderHdr` INT NOT NULL , `paymentUrl` VARCHAR(300) NOT NULL , `date` DATE NOT NULL , `time` TIME NOT NULL , `idPaymentStatus` INT NOT NULL , PRIMARY KEY (`idOrderPayment`)) ENGINE = InnoDB;


-- GMIDDI - 07/10/19 - Creación de tabla de Datos de Formulario de Registro para la Orden

-- CREATE TABLE `orders_reg_forms` ( `idOrderRegForm` INT NOT NULL AUTO_INCREMENT , `idOrder` INT NOT NULL , `idField` INT NOT NULL , `value` VARCHAR(100) NOT NULL , PRIMARY KEY (`idOrderRegForm`)) ENGINE = InnoDB;

-- Agustin - 07/10/19 - Borrado de campo en tabla prodcutos

-- ALTER TABLE `products` DROP `idregistrationForm`;

-- Agustin - 07/10/19 - creación de campo tan tabla de registro de formulario para mejor relación con la tabla producto

-- ALTER TABLE `registration_forms` ADD `idProduct` INT NOT NULL AFTER `idRegistrationForm`;

-- Agustin - 07/10/19 - Cambiamos propiedad del campo

-- ALTER TABLE `field_list` CHANGE `type` `type` VARCHAR(200) NOT NULL;

-- Agustin - 08/10/19 - Borrado de campo en tabla Registrations_forms para incluirlo en field list

-- ALTER TABLE `registration_forms` DROP `isRequired`;

-- Agustin - 08/10/19 - Agregamos el campo que sacamos anteriormente y lo agregamos en la tabla de field_list

  -- ALTER TABLE `field_list` ADD `isRequired` BOOLEAN NOT NULL AFTER `type`;

-- Carlos -- 08/10/19 - creacion tabla faqs 

-- CREATE TABLE `faqs` (`idFaq` int(11) NOT NULL,`question` varchar(200) COLLATE utf8_bin NOT NULL,`answer` text COLLATE utf8_bin NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
 

-- Carlos -- 08/10/19 -  indices tabla faqs

-- ALTER TABLE `faqs` ADD PRIMARY KEY (`idFaq`);

-- Carlos -- 08/10/19 - creacion de la tabla rel_prod_faq

-- CREATE TABLE `rel_prod_faq` (`idRel` int(11) NOT NULL,`idProduct` int(11) NOT NULL,`idFaqs` int(11) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


-- ALTER TABLE `rel_prod_faq` ADD PRIMARY KEY (`idRel`);


-- Agustin -- 11/10/19 - Modificamos el tipo de campo de la tabla productos para almacenar mas cantidad de imagenes en el string

-- ALTER TABLE `products` CHANGE `img` `img` LONGTEXT CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL;  

# Amicone Agustin - 2019/10/11 - Creamos la tabla de comentarios
-- CREATE TABLE `reviews` (`idReview` INT NOT NULL AUTO_INCREMENT , `idProduct` INT NOT NULL , `idValue` INT NOT NULL , `comment` LONGTEXT NOT NULL , `isActive` TINYINT NOT NULL,`autor` VARCHAR(60) NOT NULL,`createdBy` INT NOT NULL , `createdDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updatedBy` INT NOT NULL , `updatedDate` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`idReview`) ENGINE = InnoDB;

# Amicone Agustin - 2019/10/11 - Creamos la tabla de valoraciones para complementar la tabla de comentarios
-- CREATE TABLE `review_values` (`idValue` INT NOT NULL AUTO_INCREMENT ,`txtValue` VARCHAR(200) NOT NULL , `description` LONGTEXT NOT NULL , PRIMARY KEY (`idValue`)) ENGINE = InnoDB;

# Amicone Agustin - 2019/10/11 - Damos una dotos a la tabla de values
-- INSERT INTO `review_values` (`idValue`, `txtValue`, `description`)VALUES(1, 'Malo', 'puntuación de 1 a 2'),(2, 'Regular', 'Puntuación de 3 a 4'),(3, 'Buenon', 'puntuación de 5 a 6'),(4, 'Muy bueno', 'Puntuación de 7 a 8'),(5, 'Excelente', 'Puntuación de 9 a 10');

/* Carlos -creacion tabla clients*/

CREATE TABLE `clients` ( `idCliente` INT(11) NOT NULL AUTO_INCREMENT , `idUser` INT(11) NOT NULL , `name` VARCHAR(60) NOT NULL , `lastname` VARCHAR(60) NOT NULL , `email` VARCHAR(100) NOT NULL , `areacode` INT(4) UNSIGNED NOT NULL , `telephome` INT(8) UNSIGNED NOT NULL , `dni` INT(8) NOT NULL , `provincia` INT(11) NOT NULL , `ciudad` INT(11) NOT NULL , `calle` VARCHAR(100) NOT NULL , `number` INT(10) UNSIGNED NOT NULL , `piso` INT(2) UNSIGNED NOT NULL , `dpto` VARCHAR(5) NOT NULL , PRIMARY KEY (`idCliente`)) ENGINE = InnoDB;


/* >>>>ver que tiene mal escrito nombre<<<<<

-- >>> /* Carlos - agrego campos nombre apellido y telefon  a la tabla users*/
-- >>> ALTER TABLE `users` ADD `nomnbre` VARCHAR(200) NOT NULL AFTER `email`, ADD `apellido` VARCHAR(200) NOT NULL AFTER `nomnbre`, ADD `telefono` VARCHAR(200) NOT NULL AFTER `apellido`;
-- >>> 
-- >>> 
-- >>> /* agrego un campo is_checkout para saber si el usuario se cargo por medio del checkout, 
-- >>> default 0
-- >>> 0 creado a mano
-- >>> 1 creado por checkout
-- >>> */
-- >>> ALTER TABLE `users` ADD `is_checkout` INT(1) NOT NULL DEFAULT '0' AFTER `telefono`;
-- >>> 
-- >>> /*agrego un capompo id_client ya que al no tener campos PK en users no puedo recuperar el dato del ultimo insertado */
-- >>> 
-- >>> ALTER TABLE `users` ADD `id_clients` INT(11) NOT NULL AFTER `is_checkout`;


# Amicone Agustin - 2019/10/13 - Crear tabla de relacion entre producto y preguentas
-- CREATE TABLE `rel_prod_faqs` (   `idRelProdFaq` INT NOT NULL AUTO_INCREMENT ,   `idProduct` INT NOT NULL ,   `idFaq` INT NOT NULL ,   `createdBy` INT NOT NULL ,   `createdDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ,   `updatedBy` INT NOT NULL ,   `updatedDate` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ,   PRIMARY KEY (`idRelProdFaq`)) ENGINE = InnoDB;

# Amicone Agustin - 2019/10/13 - Crear tabla preguntas frecuentes
CREATE TABLE `faqs` ( `idFaq` INT NOT NULL AUTO_INCREMENT , `question` TEXT NOT NULL , `answer` LONGTEXT NOT NULL , `createdBy` INT NOT NULL , `createdDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updatedBy` INT NOT NULL , `updatedDate` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`idFaq`) ) ENGINE = InnoDB;















