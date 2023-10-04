CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `productId` int NOT NULL,
  `units` int DEFAULT NULL,
  `total` double DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin