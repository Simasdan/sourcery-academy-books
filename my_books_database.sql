-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mybooks
-- ------------------------------------------------------
-- Server version	9.0.1

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

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `year` int unsigned NOT NULL,
  `author` varchar(255) NOT NULL,
  `rating` double unsigned NOT NULL,
  `rating_count` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `Title_UNIQUE` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (1,'Harry Potter and the Chambers of Secrets',1998,'J.K.Rowling',4.9,1),(2,'Harry Potter and the Goblet of Fire',2000,'J.K.Rowling',4.7,1),(3,'Harry Potter and the Deathly Hallows',2007,'J.K.Rowling',4.75,2),(5,'Harry Potter and the Philosopher\'s Stone',1997,'J.K.Rowling',4.8,1),(6,'Harry Potter and the Half-Blood Prince',2005,'J.K.Rowling',4.5,1),(7,'Harry Potter and the Prisoner of Azkaban',1999,'J.K.Rowling',4.8,1),(8,'Harry Potter and the Order of the Phoenix',2003,'J.K.Rowling',5,1),(9,'Harry Potter and the Cursed Child',2016,'J.K.Rowling',4,1),(10,'The Lord of the Rings: The Fellowship of the Ring',1954,'J.R.R. Tolkien',5,1),(11,'The Lord of the Rings: The Two Towers',1954,'J.R.R. Tolkien',4.9,1),(12,'The Lord of the Rings: The Return of the King',1955,'J.R.R. Tolkien',4.8,1),(13,'The Hobbit',1937,'J.R.R. Tolkien',4.8,1),(14,'Fantastic Beasts and Where to Find Them',2001,'J.K. Rowling',4.7,1),(15,'A Study in Scarlet',1887,'Arthur Conan Doyle',4.6,1),(16,'The Sign of the Four',1890,'Arthur Conan Doyle',4.5,1),(17,'The Hound of the Baskervilles',1902,'Arthur Conan Doyle',4.7,1),(18,'The Valley of Fear',1915,'Arthur Conan Doyle',4.4,1),(19,'The Maze Runner',2009,'James Dashner',4.4,2),(20,'The Scorch Trials',2010,'James Dashner',4.2,1),(21,'The Death Cure',2011,'James Dashner',4.1,1),(22,'The Kill Order',2012,'James Dashner',4,1),(23,'The Fever Code',2016,'James Dashner',4.1,1);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-30 15:45:44
