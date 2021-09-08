/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE DATABASE coffeeexercise;
USE coffeeexercise;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `customerid` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `gender` enum('M','F') NOT NULL,
  `phonenum` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'Chris','Martin','M','01123147789'),(2,'Emma','Law','F','01123439899'),(3,'Mark','Watkins','M','01174592013'),(4,'Daniel','Williams','M',NULL),(5,'Sarah','Taylor','F','01176348290'),(6,'Katie','Armstrong','F','01145787353'),(7,'Michael','Bluth','M','01980289282'),(8,'Kat','Nash','F','01176987789'),(9,'Buster','Bluth','M','01173456782'),(10,'Charlie',NULL,'F','01139287883'),(11,'Lindsay','Bluth','F','01176923804'),(12,'Harry','Johnson','M',NULL),(13,'John','Smith','M','01174987221'),(14,'John','Taylor','M',NULL),(15,'Emma','Smith','F','01176984116'),(16,'Gob','Bluth','M','01176985498'),(17,'George','Bluth','M','01176984303'),(18,'Lucille','Bluth','F','01198773214'),(19,'George','Evans','M','01174502933'),(20,'Emily','Simmonds','F','01899284352'),(21,'John','Smith','M','01144473330'),(22,'Jennifer',NULL,'F',NULL),(23,'Toby','West','M','01176009822'),(24,'Paul','Edmonds','M','01966947113');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `orderid` int NOT NULL AUTO_INCREMENT,
  `productid` int NOT NULL,
  `customerid` int NOT NULL,
  `qty` smallint DEFAULT NULL,
  `orderdttm` datetime DEFAULT NULL,
  PRIMARY KEY (`orderid`),
  KEY `fkorderproduct_idx` (`productid`),
  KEY `fkordercustomer_idx` (`customerid`),
  CONSTRAINT `fkordercustomer` FOREIGN KEY (`customerid`) REFERENCES `customers` (`customerid`),
  CONSTRAINT `fkorderproduct` FOREIGN KEY (`productid`) REFERENCES `products` (`productid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,1,3,2,'2021-09-06 10:50:00'),(2,1,4,3,'2021-09-06 10:51:00'),(3,1,15,31,'2021-09-06 10:52:00'),(4,21,15,31,'2021-09-06 10:52:00');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `productid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `price` decimal(4,2) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`productid`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Cappuchino',32.00,'Columbia'),(2,'Stor sort',27.50,'Bali'),(21,'Latte',38.25,'Sri Lanka'),(22,'Macchiato',12.00,'Kina');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-06 11:20:20

# Initialization of tables ^

# Exercise 01
SELECT orderid, phonenum 
FROM orders o
join customers c 
  on o.customerid = c.customerid;
  
# Exercise 02
SELECT orderdttm, name 
FROM orders o
join products p 
  on o.productid = p.productid
-- No orders on following dates?
WHERE orderdttm >= '2021-02-01 00:00:00' 
AND orderdttm <= '2021-03-01 00:00:00'
AND name = 'Espresso';

# Exercise 03
SELECT orderdttm, name, gender, price
FROM orders o
JOIN products p 
  on o.productid = p.productid
JOIN customers c 
  on o.customerid = c.customerid
WHERE c.gender = "F"
AND orderdttm >= '2021-01-01 00:00:00' 
AND orderdttm <= '2021-01-02 00:00:00';

# Exercise 04
SELECT firstname, lastname ,phonenum
FROM customers
WHERE lastname LIKE "Bluth"
AND gender = "F";

# Exercise 05
SELECT name, price, country
FROM products p
WHERE p.price > 24
OR p.country = "Sri Lanka";

# Exercise 06
SELECT COUNT(*) 
FROM customers c
WHERE c.gender = "M"
AND c.phonenum IS NULL;

# Exercise 07
SELECT name, price, country 
FROM products p
WHERE p.country = "Sri Lanka"
OR p.country = "Columbia"
ORDER BY p.name;

# Exercise 08
SELECT * 
FROM orders o
WHERE o.orderdttm >= '2021-02-01 00:00:00' 
AND o.orderdttm <= '2021-03-01 00:00:00'
AND o.customerid = 2 OR 4 OR 6 OR 8;

# Exercise 09
SELECT firstname, lastname, phonenum
FROM customers c
WHERE c.lastname LIKE "%ar%";

# Exercise 10
SELECT DISTINCT lastname
FROM customers c
ORDER BY c.lastname;

# Exercise 11
SELECT * 
FROM orders o
WHERE o.customerid = 1
AND o.orderdttm >= '2021-02-01 00:00:00' 
AND o.orderdttm <= '2021-03-01 00:00:00';

# Exercise 12
SELECT name, price as retail_price ,country
FROM products



