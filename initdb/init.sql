CREATE DATABASE  IF NOT EXISTS `kangaroo_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `kangaroodb`;
-- MySQL dump 10.13  Distrib 8.0.44, for Win64 (x86_64)
--
-- Host: localhost    Database: kangaroodb
-- ------------------------------------------------------
-- Server version	8.0.43

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
-- Table structure for table `composizione`
--

DROP TABLE IF EXISTS `composizione`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `composizione` (
                                `id_ordine` int NOT NULL,
                                `id_prodotto` int NOT NULL,
                                `prezzo` decimal(10,2) NOT NULL,
                                `quantita` int NOT NULL,
                                `IVA` decimal(5,2) NOT NULL,
                                PRIMARY KEY (`id_ordine`,`id_prodotto`),
                                KEY `idx_comp_prodotto` (`id_prodotto`),
                                CONSTRAINT `fk_comp_ordine` FOREIGN KEY (`id_ordine`) REFERENCES `ordine` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE,
                                CONSTRAINT `fk_comp_prodotto` FOREIGN KEY (`id_prodotto`) REFERENCES `prodotto` (`Id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `composizione`
--

LOCK TABLES `composizione` WRITE;
/*!40000 ALTER TABLE `composizione` DISABLE KEYS */;
INSERT INTO `composizione` VALUES (1,1,10.00,1,22.00);
/*!40000 ALTER TABLE `composizione` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fatturazione`
--

DROP TABLE IF EXISTS `fatturazione`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fatturazione` (
                                `Id` int NOT NULL,
                                `sdi` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
                                `importo` decimal(10,2) NOT NULL,
                                `data_scadenza` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
                                `data_emissione` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
                                `stato_del_pagamento` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
                                `IVA` decimal(5,2) NOT NULL,
                                PRIMARY KEY (`Id`),
                                KEY `idx_fatt_sdi` (`sdi`),
                                CONSTRAINT `fk_fatturazione_ordine` FOREIGN KEY (`Id`) REFERENCES `ordine` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fatturazione`
--

LOCK TABLES `fatturazione` WRITE;
/*!40000 ALTER TABLE `fatturazione` DISABLE KEYS */;
INSERT INTO `fatturazione` VALUES (1,'8590837',10.00,'08-01-2024','08-01-2026','Paid',22.00);
/*!40000 ALTER TABLE `fatturazione` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `indirizzo`
--

DROP TABLE IF EXISTS `indirizzo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `indirizzo` (
                             `id` int NOT NULL AUTO_INCREMENT,
                             `via` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL,
                             `citta` varchar(80) COLLATE utf8mb4_unicode_ci NOT NULL,
                             `cap` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
                             `username` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
                             PRIMARY KEY (`id`),
                             KEY `idx_indirizzo_username` (`username`),
                             CONSTRAINT `fk_indirizzo_utente` FOREIGN KEY (`username`) REFERENCES `utente` (`Username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `indirizzo`
--

LOCK TABLES `indirizzo` WRITE;
/*!40000 ALTER TABLE `indirizzo` DISABLE KEYS */;
INSERT INTO `indirizzo` VALUES (2,'Via Nazionale 52','Franche','80050','renny23'),(3,'via nazionale 52','Pimonte','80050','pietro12_'),(4,'asda 43','Pimont','80050','iosos123');
/*!40000 ALTER TABLE `indirizzo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metodo_di_pagamento`
--

DROP TABLE IF EXISTS `metodo_di_pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `metodo_di_pagamento` (
                                       `id` int NOT NULL AUTO_INCREMENT,
                                       `numero_di_carta` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL,
                                       `cvv` varchar(4) COLLATE utf8mb4_unicode_ci NOT NULL,
                                       `data_scadenza` date DEFAULT NULL,
                                       `circuito` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
                                       `Username` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
                                       PRIMARY KEY (`id`),
                                       KEY `idx_pagamento_username` (`Username`),
                                       KEY `idx_pagamento_carta` (`numero_di_carta`),
                                       CONSTRAINT `fk_pagamento_utente` FOREIGN KEY (`Username`) REFERENCES `utente` (`Username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metodo_di_pagamento`
--

LOCK TABLES `metodo_di_pagamento` WRITE;
/*!40000 ALTER TABLE `metodo_di_pagamento` DISABLE KEYS */;
INSERT INTO `metodo_di_pagamento` VALUES (1,'2323232323223232323','555','2025-12-12','PayPal','renny23');
/*!40000 ALTER TABLE `metodo_di_pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordine`
--

DROP TABLE IF EXISTS `ordine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ordine` (
                          `Id` int NOT NULL,
                          `Username` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `PrezzoTotale` decimal(10,2) NOT NULL,
                          `destinatario` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `metodo_di_pagamento` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `circuito` varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                          `numero_carta` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                          `indirizzo_di_spedizione` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `numero_di_tracking` varchar(60) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                          `data` date NOT NULL,
                          `metodo_di_spedizione` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
                          PRIMARY KEY (`Id`),
                          KEY `idx_ordine_username` (`Username`),
                          KEY `idx_ordine_data` (`data`),
                          KEY `idx_ordine_username_data` (`Username`,`data`),
                          CONSTRAINT `fk_ordine_utente` FOREIGN KEY (`Username`) REFERENCES `utente` (`Username`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordine`
--

LOCK TABLES `ordine` WRITE;
/*!40000 ALTER TABLE `ordine` DISABLE KEYS */;
INSERT INTO `ordine` VALUES (1,'renny23',10.00,'pietro','carta_di_credito','PayPal','2323232323223232323','Via Nazionale 52,Franche','7060964','2026-01-08','Standard');
/*!40000 ALTER TABLE `ordine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prodotto`
--

DROP TABLE IF EXISTS `prodotto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prodotto` (
                            `Id` int NOT NULL AUTO_INCREMENT,
                            `Nome` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL,
                            `Descrizione` text COLLATE utf8mb4_unicode_ci,
                            `Prezzo` decimal(10,2) NOT NULL,
                            `QuantitaDisponibile` int NOT NULL DEFAULT '0',
                            `Tipo` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
                            `IVA` decimal(5,2) NOT NULL DEFAULT '0.00',
                            `immagine` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                            PRIMARY KEY (`Id`),
                            KEY `idx_prodotto_tipo` (`Tipo`),
                            KEY `idx_prodotto_nome` (`Nome`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prodotto`
--

LOCK TABLES `prodotto` WRITE;
/*!40000 ALTER TABLE `prodotto` DISABLE KEYS */;
INSERT INTO `prodotto` VALUES (1,'provolone','provolone del monaco',10.00,100,'cibo',22.00,'provolone.jpg'),(2,'mozzarella','mozzarella di sarno',29.00,10,'cibo',22.00,'mozzarella.jpg');
/*!40000 ALTER TABLE `prodotto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utente`
--

DROP TABLE IF EXISTS `utente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utente` (
                          `Username` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `Password` char(40) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `Cognome` varchar(60) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `Nome` varchar(60) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `Email` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `Tipo` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `via` varchar(120) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                          `citta` varchar(80) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                          `provincia` varchar(2) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                          `telefono` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                          `cap` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                          PRIMARY KEY (`Username`),
                          UNIQUE KEY `uq_utente_email` (`Email`),
                          KEY `idx_utente_email_pwd` (`Email`,`Password`),
                          KEY `idx_utente_tipo` (`Tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utente`
--

LOCK TABLES `utente` WRITE;
/*!40000 ALTER TABLE `utente` DISABLE KEYS */;
INSERT INTO `utente` VALUES ('admin_principale','c3499a091722e1189d20c57170a49687e35b7e28','Rossi','Mario','mario.rossi@esempio.it','admin',NULL,NULL,NULL,NULL,NULL),('iosos123','3d12bb90e3a483f734af6c4eef512c555667a80e','coticella','pietro','provoloni@example.com','admin','asda 43','Pimont','NA','111111111111','80050'),('pietro12_','8331ddce93801681a7ded6e8d30917c320e001fd','coticella','pietro','provola@gmail.com','cliente','via nazionale 52','Pimonte','NA','123455544444','80050'),('renny23','8b5a3a75b981846e3e9aa573114a5f3758ad9b67','mancino','renato','renatomancio@gmail.com','cliente','via nazionale 52','Pimonte','Na','999999999999','80050');
/*!40000 ALTER TABLE `utente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-01-09 18:03:13
