-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: enjoytrips
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `attraction_description`
--
drop database  if exists enjoytrips;
create database enjoytrips;
use enjoytrips;

DROP TABLE IF EXISTS `file_info_board`;
CREATE TABLE `file_info_board` (
  `article_no` int NOT NULL,
  `origin_name` varchar(100) DEFAULT NULL,
  `online_path` varchar(100) DEFAULT NULL,
  `delete_path` varchar(100) DEFAULT NULL
  );
  
  DROP TABLE IF EXISTS `file_info_hotplace`;
CREATE TABLE `file_info_hotplace` (
  `article_no` int NOT NULL,
  `origin_name` varchar(100) DEFAULT NULL,
  `online_path` varchar(100) DEFAULT NULL,
  `delete_path` varchar(100) DEFAULT NULL
  );
  
DROP TABLE IF EXISTS `attraction_description`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attraction_description` (
  `content_id` int NOT NULL,
  `homepage` varchar(100) DEFAULT NULL,
  `overview` varchar(10000) DEFAULT NULL,
  `telname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`content_id`),
  CONSTRAINT `attraction_detail_to_attraciton_id_fk` FOREIGN KEY (`content_id`) REFERENCES `attraction_info` (`content_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attraction_description`
--

LOCK TABLES `attraction_description` WRITE;
/*!40000 ALTER TABLE `attraction_description` DISABLE KEYS */;

/*!40000 ALTER TABLE `attraction_description` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attraction_detail`
--

DROP TABLE IF EXISTS `attraction_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attraction_detail` (
  `content_id` int NOT NULL,
  `cat1` varchar(3) DEFAULT NULL,
  `cat2` varchar(5) DEFAULT NULL,
  `cat3` varchar(9) DEFAULT NULL,
  `created_time` varchar(14) DEFAULT NULL,
  `modified_time` varchar(14) DEFAULT NULL,
  `booktour` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`content_id`),
  CONSTRAINT `attraction_detail_to_basic_content_id_fk` FOREIGN KEY (`content_id`) REFERENCES `attraction_info` (`content_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attraction_detail`
--

LOCK TABLES `attraction_detail` WRITE;
/*!40000 ALTER TABLE `attraction_detail` DISABLE KEYS */;

/*!40000 ALTER TABLE `attraction_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attraction_info`
--

DROP TABLE IF EXISTS `attraction_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attraction_info` (
  `content_id` int NOT NULL,
  `content_type_id` int DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `addr1` varchar(100) DEFAULT NULL,
  `addr2` varchar(50) DEFAULT NULL,
  `zipcode` varchar(50) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `first_image` varchar(200) DEFAULT NULL,
  `first_image2` varchar(200) DEFAULT NULL,
  `readcount` int DEFAULT NULL,
  `sido_code` int DEFAULT NULL,
  `gugun_code` int DEFAULT NULL,
  `latitude` decimal(20,17) DEFAULT NULL,
  `longitude` decimal(20,17) DEFAULT NULL,
  `mlevel` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`content_id`),
  KEY `attraction_to_content_type_id_fk_idx` (`content_type_id`),
  KEY `attraction_to_sido_code_fk_idx` (`sido_code`),
  KEY `attraction_to_gugun_code_fk_idx` (`gugun_code`),
  CONSTRAINT `attraction_to_content_type_id_fk` FOREIGN KEY (`content_type_id`) REFERENCES `content_type` (`content_type_id`),
  CONSTRAINT `attraction_to_gugun_code_fk` FOREIGN KEY (`gugun_code`) REFERENCES `gugun` (`gugun_code`),
  CONSTRAINT `attraction_to_sido_code_fk` FOREIGN KEY (`sido_code`) REFERENCES `sido` (`sido_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attraction_info`
--

LOCK TABLES `attraction_info` WRITE;
/*!40000 ALTER TABLE `attraction_info` DISABLE KEYS */;

/*!40000 ALTER TABLE `attraction_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gugun`
--

DROP TABLE IF EXISTS `gugun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gugun` (
  `gugun_code` int NOT NULL,
  `gugun_name` varchar(30) DEFAULT NULL,
  `sido_code` int NOT NULL,
  PRIMARY KEY (`gugun_code`,`sido_code`),
  KEY `gugun_to_sido_sido_code_fk_idx` (`sido_code`),
  CONSTRAINT `gugun_to_sido_sido_code_fk` FOREIGN KEY (`sido_code`) REFERENCES `sido` (`sido_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gugun`
--

LOCK TABLES `gugun` WRITE;
/*!40000 ALTER TABLE `gugun` DISABLE KEYS */;
INSERT INTO `gugun` VALUES (1,'강남구',1),(1,'강화군',2),(1,'대덕구',3),(1,'남구',4),(1,'광산구',5),(1,'강서구',6),(1,'중구',7),(1,'세종특별자치시',8),(1,'가평군',31),(1,'강릉시',32),(1,'괴산군',33),(1,'공주시',34),(1,'경산시',35),(1,'거제시',36),(1,'고창군',37),(1,'강진군',38),(1,'남제주군',39),(2,'강동구',1),(2,'계양구',2),(2,'동구',3),(2,'달서구',4),(2,'남구',5),(2,'금정구',6),(2,'남구',7),(2,'고양시',31),(2,'고성군',32),(2,'단양군',33),(2,'금산군',34),(2,'경주시',35),(2,'거창군',36),(2,'군산시',37),(2,'고흥군',38),(2,'북제주군',39),(3,'강북구',1),(3,'미추홀구',2),(3,'서구',3),(3,'달성군',4),(3,'동구',5),(3,'기장군',6),(3,'동구',7),(3,'과천시',31),(3,'동해시',32),(3,'보은군',33),(3,'논산시',34),(3,'고령군',35),(3,'고성군',36),(3,'김제시',37),(3,'곡성군',38),(3,'서귀포시',39),(4,'강서구',1),(4,'남동구',2),(4,'유성구',3),(4,'동구',4),(4,'북구',5),(4,'남구',6),(4,'북구',7),(4,'광명시',31),(4,'삼척시',32),(4,'영동군',33),(4,'당진시',34),(4,'구미시',35),(4,'김해시',36),(4,'남원시',37),(4,'광양시',38),(4,'제주시',39),(5,'관악구',1),(5,'동구',2),(5,'중구',3),(5,'북구',4),(5,'서구',5),(5,'동구',6),(5,'울주군',7),(5,'광주시',31),(5,'속초시',32),(5,'옥천군',33),(5,'보령시',34),(5,'군위군',35),(5,'남해군',36),(5,'무주군',37),(5,'구례군',38),(6,'광진구',1),(6,'부평구',2),(6,'서구',4),(6,'동래구',6),(6,'구리시',31),(6,'양구군',32),(6,'음성군',33),(6,'부여군',34),(6,'김천시',35),(6,'마산시',36),(6,'부안군',37),(6,'나주시',38),(7,'구로구',1),(7,'서구',2),(7,'수성구',4),(7,'부산진구',6),(7,'군포시',31),(7,'양양군',32),(7,'제천시',33),(7,'서산시',34),(7,'문경시',35),(7,'밀양시',36),(7,'순창군',37),(7,'담양군',38),(8,'금천구',1),(8,'연수구',2),(8,'중구',4),(8,'북구',6),(8,'김포시',31),(8,'영월군',32),(8,'진천군',33),(8,'서천군',34),(8,'봉화군',35),(8,'사천시',36),(8,'완주군',37),(8,'목포시',38),(9,'노원구',1),(9,'옹진군',2),(9,'사상구',6),(9,'남양주시',31),(9,'원주시',32),(9,'청원군',33),(9,'아산시',34),(9,'상주시',35),(9,'산청군',36),(9,'익산시',37),(9,'무안군',38),(10,'도봉구',1),(10,'중구',2),(10,'사하구',6),(10,'동두천시',31),(10,'인제군',32),(10,'청주시',33),(10,'성주군',35),(10,'양산시',36),(10,'임실군',37),(10,'보성군',38),(11,'동대문구',1),(11,'서구',6),(11,'부천시',31),(11,'정선군',32),(11,'충주시',33),(11,'예산군',34),(11,'안동시',35),(11,'장수군',37),(11,'순천시',38),(12,'동작구',1),(12,'수영구',6),(12,'성남시',31),(12,'철원군',32),(12,'증평군',33),(12,'천안시',34),(12,'영덕군',35),(12,'의령군',36),(12,'전주시',37),(12,'신안군',38),(13,'마포구',1),(13,'연제구',6),(13,'수원시',31),(13,'춘천시',32),(13,'청양군',34),(13,'영양군',35),(13,'진주시',36),(13,'정읍시',37),(13,'여수시',38),(14,'서대문구',1),(14,'영도구',6),(14,'시흥시',31),(14,'태백시',32),(14,'태안군',34),(14,'영주시',35),(14,'진해시',36),(14,'진안군',37),(15,'서초구',1),(15,'중구',6),(15,'안산시',31),(15,'평창군',32),(15,'홍성군',34),(15,'영천시',35),(15,'창녕군',36),(16,'성동구',1),(16,'해운대구',6),(16,'안성시',31),(16,'홍천군',32),(16,'계룡시',34),(16,'예천군',35),(16,'창원시',36),(16,'영광군',38),(17,'성북구',1),(17,'안양시',31),(17,'화천군',32),(17,'울릉군',35),(17,'통영시',36),(17,'영암군',38),(18,'송파구',1),(18,'양주시',31),(18,'횡성군',32),(18,'울진군',35),(18,'하동군',36),(18,'완도군',38),(19,'양천구',1),(19,'양평군',31),(19,'의성군',35),(19,'함안군',36),(19,'장성군',38),(20,'영등포구',1),(20,'여주시',31),(20,'청도군',35),(20,'함양군',36),(20,'장흥군',38),(21,'용산구',1),(21,'연천군',31),(21,'청송군',35),(21,'합천군',36),(21,'진도군',38),(22,'은평구',1),(22,'오산시',31),(22,'칠곡군',35),(22,'함평군',38),(23,'종로구',1),(23,'용인시',31),(23,'포항시',35),(23,'해남군',38),(24,'중구',1),(24,'의왕시',31),(24,'화순군',38),(25,'중랑구',1),(25,'의정부시',31),(26,'이천시',31),(27,'파주시',31),(28,'평택시',31),(29,'포천시',31),(30,'하남시',31),(31,'화성시',31);
/*!40000 ALTER TABLE `gugun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sido`
--

DROP TABLE IF EXISTS `sido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sido` (
  `sido_code` int NOT NULL,
  `sido_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`sido_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sido`
--

LOCK TABLES `sido` WRITE;
/*!40000 ALTER TABLE `sido` DISABLE KEYS */;
INSERT INTO `sido` VALUES (1,'서울'),(2,'인천'),(3,'대전'),(4,'대구'),(5,'광주'),(6,'부산'),(7,'울산'),(8,'세종특별자치시'),(31,'경기도'),(32,'강원도'),(33,'충청북도'),(34,'충청남도'),(35,'경상북도'),(36,'경상남도'),(37,'전라북도'),(38,'전라남도'),(39,'제주도');
/*!40000 ALTER TABLE `sido` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-24 14:39:25

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
		  `id` varchar(20) NOT NULL,
		  `pw` varchar(20) NOT NULL,
		  `email` varchar(20) NOT NULL,
		  `domain` varchar(20) NOT NULL,
		  `token` VARCHAR(1000) NULL DEFAULT NULL,
		  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `board`;
CREATE TABLE IF NOT EXISTS `board` (
  `articleNo` int NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `id` VARCHAR(50) NOT NULL,
  `content` TEXT NULL,
  `regTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `viewCnt` int,
  `likeCnt` int,
  PRIMARY KEY (`articleNo`))
ENGINE = InnoDB;


DROP TABLE IF EXISTS `hotplace`;
CREATE TABLE IF NOT EXISTS `hotplace` (
  `hotplaceNo` int NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `id` VARCHAR(50) NOT NULL,
  `content` TEXT NULL,
  `regTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `viewCnt` int,
  `likeCnt` int,
  PRIMARY KEY (`hotplaceNo`))
ENGINE = InnoDB;

DROP TABLE IF EXISTS `bulletin`;
CREATE TABLE IF NOT EXISTS `bulletin` (
  `bulletinNo` int NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `id` VARCHAR(50) NOT NULL,
  `content` TEXT NULL,
  `regTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `viewCnt` int,
  `likeCnt` int,
  PRIMARY KEY (`bulletinNo`))
ENGINE = InnoDB;

DROP TABLE IF EXISTS `comment_board`;
CREATE TABLE `comment_board` (
  `commentNo` int NOT NULL AUTO_INCREMENT,
  `id` varchar(45) NOT NULL,
  `comment` varchar(500) NOT NULL,
  `commentTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `articleNo` int NOT NULL,
  PRIMARY KEY (`commentNo`),
  KEY `comment_articleNo_idx` (`articleNo`),
  CONSTRAINT `comment_board_articleNo` FOREIGN KEY (`articleNo`) REFERENCES `board` (`articleNo`)
) ENGINE=InnoDB;

DROP TABLE IF EXISTS `comment_hotplace`;
CREATE TABLE `comment_hotplace` (
  `commentNo` int NOT NULL AUTO_INCREMENT,
  `id` varchar(45) NOT NULL,
  `comment` varchar(500) NOT NULL,
  `commentTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `hotplaceNo` int NOT NULL,
  PRIMARY KEY (`commentNo`),
  KEY `comment_hotplaceNo_idx` (`hotplaceNo`),
  CONSTRAINT `comment_hotplace_articleNo` FOREIGN KEY (`hotplaceNo`) REFERENCES `hotplace` (`hotplaceNo`)
) ENGINE=InnoDB;



CREATE TABLE IF NOT EXISTS `mytrip` (
  `mytripNo` int NOT NULL AUTO_INCREMENT,
  `id` VARCHAR(50) NOT NULL,
  `sido_code` int NOT NULL,
  `title` VARCHAR(100) NOT NULL,
  `regTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `startPeriod` VARCHAR(15) NOT NULL,
  `endPeriod` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`mytripNo`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mytrip_list` (
`detailNo` int NOT NULL AUTO_INCREMENT,
`contentId` int NOT NULL,
`contentTypeId` int NOT NULL,
`id` VARCHAR(50) NOT NULL,
`sido_code` int NOT NULL,
`sequence` int not null,
 PRIMARY KEY (`detailNo`)
) ENGINE=InnoDB;

-- sequence를 위한 trigger 추가
DELIMITER $$
CREATE TRIGGER increase_sequence
BEFORE INSERT ON mytrip_list
FOR EACH ROW
BEGIN
    SET NEW.sequence = (
        SELECT IFNULL(MAX(sequence), 0) + 1
        FROM mytrip_list
        WHERE id = NEW.id
    );
END $$
DELIMITER ;

select * from mytrip;
		UPDATE mytrip
		SET
		title = "1234"
		WHERE mytripNo = 2;