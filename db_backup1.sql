-- MySQL dump 10.13  Distrib 5.7.11, for Win64 (x86_64)
--
-- Host: localhost    Database: mohitrawal
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adminlogin` (
  `id` varchar(10) DEFAULT NULL,
  `pass` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminlogin`
--

LOCK TABLES `adminlogin` WRITE;
/*!40000 ALTER TABLE `adminlogin` DISABLE KEYS */;
INSERT INTO `adminlogin` VALUES ('rishabh','jain'),('shubham','bansal'),('mohit','rawal'),('nikhil','rawal'),('1','nnmm'),('2','1');
/*!40000 ALTER TABLE `adminlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendence`
--

DROP TABLE IF EXISTS `attendence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attendence` (
  `sem` varchar(10) DEFAULT NULL,
  `rollno` varchar(10) DEFAULT NULL,
  `subject` varchar(30) DEFAULT NULL,
  `date` varchar(15) DEFAULT NULL,
  `attendence` varchar(10) DEFAULT NULL,
  `deptt` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendence`
--

LOCK TABLES `attendence` WRITE;
/*!40000 ALTER TABLE `attendence` DISABLE KEYS */;
INSERT INTO `attendence` VALUES ('2','CSE-1001','Autocad','22/Dec/2016','1','CSE'),('2','CSE-1002','Autocad','22/Dec/2016','0','CSE'),('2','CSE-1003','Autocad','22/Dec/2016','1','CSE'),('2','CSE-1004','Autocad','22/Dec/2016','1','CSE'),('2','CSE-1005','Autocad','22/Dec/2016','1','CSE'),('2','CSE-1006','Autocad','22/Dec/2016','1','CSE'),('2','CSE-1007','Autocad','22/Dec/2016','1','CSE'),('2','CSE-1008','Autocad','22/Dec/2016','1','CSE'),('2','CSE-1001','Autocad','23/Dec/2016','1','CSE'),('2','CSE-1002','Autocad','23/Dec/2016','1','CSE'),('2','CSE-1003','Autocad','23/Dec/2016','1','CSE'),('2','CSE-1004','Autocad','23/Dec/2016','1','CSE'),('2','CSE-1005','Autocad','23/Dec/2016','1','CSE'),('2','CSE-1006','Autocad','23/Dec/2016','1','CSE'),('2','CSE-1007','Autocad','23/Dec/2016','1','CSE'),('2','CSE-1008','Autocad','23/Dec/2016','1','CSE'),('2','CSE-1001','ITPL','26/Dec/2016','1','CSE'),('2','CSE-1002','ITPL','26/Dec/2016','1','CSE'),('2','CSE-1003','ITPL','26/Dec/2016','1','CSE'),('2','CSE-1004','ITPL','26/Dec/2016','1','CSE'),('2','CSE-1005','ITPL','26/Dec/2016','1','CSE'),('2','CSE-1006','ITPL','26/Dec/2016','1','CSE'),('2','CSE-1007','ITPL','26/Dec/2016','1','CSE'),('2','CSE-1008','ITPL','26/Dec/2016','1','CSE'),('1','CSE-1001','Engg. Physics','26/Dec/2016','1','CSE'),('1','CSE-1002','Engg. Physics','26/Dec/2016','1','CSE'),('1','CSE-1003','Engg. Physics','26/Dec/2016','1','CSE'),('1','CSE-1004','Engg. Physics','26/Dec/2016','1','CSE'),('1','CSE-1005','Engg. Physics','26/Dec/2016','1','CSE'),('1','CSE-1006','Engg. Physics','26/Dec/2016','1','CSE'),('1','CSE-1007','Engg. Physics','26/Dec/2016','1','CSE'),('1','CSE-1008','Engg. Physics','26/Dec/2016','1','CSE'),('2','MECH-1001','ITPL','26/Dec/2016','1','MECH'),('2','MECH-1002','ITPL','26/Dec/2016','1','MECH'),('2','MECH-1003','ITPL','26/Dec/2016','1','MECH'),('2','CSE-1001','OOPS','26/Dec/2016','1','CSE'),('2','CSE-1002','OOPS','26/Dec/2016','1','CSE'),('2','CSE-1003','OOPS','26/Dec/2016','1','CSE'),('2','CSE-1004','OOPS','26/Dec/2016','1','CSE'),('2','CSE-1005','OOPS','26/Dec/2016','1','CSE'),('2','CSE-1006','OOPS','26/Dec/2016','1','CSE'),('2','CSE-1007','OOPS','26/Dec/2016','1','CSE'),('2','CSE-1008','OOPS','26/Dec/2016','1','CSE'),('2','CSE-1001','Autocad','26/Dec/2016','1','CSE'),('2','CSE-1002','Autocad','26/Dec/2016','1','CSE'),('2','CSE-1003','Autocad','26/Dec/2016','1','CSE'),('2','CSE-1004','Autocad','26/Dec/2016','1','CSE'),('2','CSE-1005','Autocad','26/Dec/2016','1','CSE'),('2','CSE-1006','Autocad','26/Dec/2016','1','CSE'),('2','CSE-1007','Autocad','26/Dec/2016','1','CSE'),('2','CSE-1008','Autocad','26/Dec/2016','1','CSE'),('2','CSE-1001','MP Lab','26/Dec/2016','1','CSE'),('2','CSE-1002','MP Lab','26/Dec/2016','1','CSE'),('2','CSE-1003','MP Lab','26/Dec/2016','1','CSE'),('2','CSE-1004','MP Lab','26/Dec/2016','1','CSE'),('2','CSE-1005','MP Lab','26/Dec/2016','1','CSE'),('2','CSE-1006','MP Lab','26/Dec/2016','1','CSE'),('2','CSE-1007','MP Lab','26/Dec/2016','1','CSE'),('2','CSE-1008','MP Lab','26/Dec/2016','1','CSE'),('2','MECH-1001','ITPL','29/Dec/2016','0','MECH'),('2','MECH-1002','ITPL','29/Dec/2016','1','MECH'),('2','MECH-1003','ITPL','29/Dec/2016','1','MECH'),('2','MECH-1001','ITPL','29/Dec/2016','0','MECH'),('2','MECH-1002','ITPL','29/Dec/2016','1','MECH'),('2','MECH-1003','ITPL','29/Dec/2016','1','MECH'),('2','MECH-1001','Autocad','29/Dec/2016','1','MECH'),('2','MECH-1002','Autocad','29/Dec/2016','1','MECH'),('2','MECH-1003','Autocad','29/Dec/2016','1','MECH'),('2','MECH-1001','OOPS','29/Dec/2016','1','MECH'),('2','MECH-1002','OOPS','29/Dec/2016','1','MECH'),('2','MECH-1003','OOPS','29/Dec/2016','1','MECH'),('2','MECH-1001','MP Lab','29/Dec/2016','1','MECH'),('2','MECH-1002','MP Lab','29/Dec/2016','1','MECH'),('2','MECH-1003','MP Lab','29/Dec/2016','1','MECH'),('2','MECH-1001','ITPL','25/Dec/2016','1','MECH'),('2','MECH-1002','ITPL','25/Dec/2016','1','MECH'),('2','MECH-1003','ITPL','25/Dec/2016','1','MECH'),('2','CSE-1001','OOPS','29/Dec/2016','1','CSE'),('2','CSE-1002','OOPS','29/Dec/2016','1','CSE'),('2','CSE-1003','OOPS','29/Dec/2016','1','CSE'),('2','CSE-1004','OOPS','29/Dec/2016','1','CSE'),('2','CSE-1005','OOPS','29/Dec/2016','1','CSE'),('2','CSE-1006','OOPS','29/Dec/2016','1','CSE'),('2','CSE-1007','OOPS','29/Dec/2016','1','CSE'),('2','CSE-1008','OOPS','29/Dec/2016','1','CSE'),('2','CSE-1001','MP Lab','29/Dec/2016','1','CSE'),('2','CSE-1002','MP Lab','29/Dec/2016','1','CSE'),('2','CSE-1003','MP Lab','29/Dec/2016','1','CSE'),('2','CSE-1004','MP Lab','29/Dec/2016','1','CSE'),('2','CSE-1005','MP Lab','29/Dec/2016','1','CSE'),('2','CSE-1006','MP Lab','29/Dec/2016','1','CSE'),('2','CSE-1007','MP Lab','29/Dec/2016','1','CSE'),('2','CSE-1008','MP Lab','29/Dec/2016','1','CSE'),('3','CSE-1001','Data Structures','29/Dec/2016','1','CSE'),('3','CSE-1002','Data Structures','29/Dec/2016','1','CSE'),('3','CSE-1003','Data Structures','29/Dec/2016','1','CSE'),('3','CSE-1004','Data Structures','29/Dec/2016','1','CSE'),('3','CSE-1005','Data Structures','29/Dec/2016','1','CSE'),('3','CSE-1006','Data Structures','29/Dec/2016','1','CSE'),('3','CSE-1007','Data Structures','29/Dec/2016','1','CSE'),('3','CSE-1008','Data Structures','29/Dec/2016','1','CSE'),('3','CSE-1001','Client Side Technologies','29/Dec/2016','1','CSE'),('3','CSE-1002','Client Side Technologies','29/Dec/2016','1','CSE'),('3','CSE-1003','Client Side Technologies','29/Dec/2016','1','CSE'),('3','CSE-1004','Client Side Technologies','29/Dec/2016','1','CSE'),('3','CSE-1005','Client Side Technologies','29/Dec/2016','1','CSE'),('3','CSE-1006','Client Side Technologies','29/Dec/2016','1','CSE'),('3','CSE-1007','Client Side Technologies','29/Dec/2016','1','CSE'),('3','CSE-1008','Client Side Technologies','29/Dec/2016','1','CSE');
/*!40000 ALTER TABLE `attendence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data1`
--

DROP TABLE IF EXISTS `data1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data1` (
  `Adm_no` varchar(10) DEFAULT NULL,
  `Adm_Date` varchar(15) DEFAULT NULL,
  `Dept_code` varchar(10) DEFAULT NULL,
  `Branch_code` varchar(10) DEFAULT NULL,
  `Roll_no` varchar(10) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Fname` varchar(20) DEFAULT NULL,
  `Mname` varchar(20) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `Contact` varchar(10) DEFAULT NULL,
  `address` varchar(40) DEFAULT NULL,
  `hostel` varchar(10) DEFAULT NULL,
  `transport` varchar(20) DEFAULT NULL,
  `sem_fee` varchar(20) DEFAULT NULL,
  `total_fee` varchar(20) DEFAULT NULL,
  `sem` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data1`
--

LOCK TABLES `data1` WRITE;
/*!40000 ALTER TABLE `data1` DISABLE KEYS */;
INSERT INTO `data1` VALUES ('1','07/Jul/2016','CSE','Cse-001','CSE-1001','CSE-1007','','','male','','','null','null','43000','','1'),('2','07/Jul/2016','MECH','Mech-001','MECH-1001','Aman','Amit','rupali','male','8546528546','hisar','yes','yes','43000','94000','1'),('3','07/Jul/2016','CSE','Cse-001','CSE-1002','Piyushi','amit','abc','female','9958665589','hisar','yes','no','43000','79000','1'),('4','07/Jul/2016','IT','It-001','IT-1001','Rajan','abc','xyz','male','7837170005','samana','no','no','43000','43000','1'),('5','07/Jul/2016','CIVIL','Civil-001','CIVIL-1001','hyuj','hjk','jk','male','52656','vcdsx','no','yes','43000','58000','1'),('6','12/Jul/2016','CSE','Cse-001','CSE-1003','','','','null','','','yes','yes','43000','94000','1'),('7','12/Jul/2016','CSE','Cse-001','CSE-1004','','','','null','','','yes','yes','43000','94000','1'),('8','12/Jul/2016','CSE','Cse-001','CSE-1005','','','','null','','','yes','yes','43000','94000','1'),('9','14/Jul/2016','CSE','Cse-001','CSE-1006','','','','null','','','yes','yes','43000','94000','1'),('10','04/Oct/2016','MECH','Mech-001','MECH-1002','MECH-1003','','','male','','','null','null','43000','','1'),('11','04/Oct/2016','CSE','Cse-001','CSE-1007','rajan','abc','xyz','male','7837170005','samana','no','no','43000','43000','1'),('12','09/Dec/2016','CSE','Cse-001','CSE-1008','mohit','devender','rekha','male','778899','abcdddd','no','no','43000','43000','1'),('13','26/Dec/2016','MECH','Mech-001','MECH-1003','Sanju','Mahesh','sunita','male','1234567899','abcdes','no','no','43000','43000','1');
/*!40000 ALTER TABLE `data1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marks1`
--

DROP TABLE IF EXISTS `marks1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marks1` (
  `dept_code` varchar(20) DEFAULT NULL,
  `sem` int(11) DEFAULT NULL,
  `rollno` varchar(10) DEFAULT NULL,
  `sub1` varchar(30) DEFAULT NULL,
  `sub1_marks` int(11) DEFAULT NULL,
  `sub2` varchar(30) DEFAULT NULL,
  `sub2_marks` int(11) DEFAULT NULL,
  `sub3` varchar(30) DEFAULT NULL,
  `sub3_marks` int(10) DEFAULT NULL,
  `sub4` varchar(30) DEFAULT NULL,
  `sub4_marks` int(10) DEFAULT NULL,
  `Sessionals` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marks1`
--

LOCK TABLES `marks1` WRITE;
/*!40000 ALTER TABLE `marks1` DISABLE KEYS */;
INSERT INTO `marks1` VALUES ('CSE',1,'CSE-1001','Engg. Physics',1,'Engg Chemistry',2,'Engg Maths',3,'Engg drawing',4,'ST1'),('CSE',1,'CSE-1002','Engg. Physics',5,'Engg Chemistry',6,'Engg Maths',7,'Engg drawing',8,'ST1'),('CSE',1,'CSE-1003','Engg. Physics',9,'Engg Chemistry',0,'Engg Maths',1,'Engg drawing',2,'ST1'),('CSE',1,'CSE-1004','Engg. Physics',3,'Engg Chemistry',4,'Engg Maths',5,'Engg drawing',6,'ST1'),('CSE',2,'CSE-1001','ITPL',1,'Autocad',2,'OOPS',3,'MP Lab',4,'ST1'),('CSE',2,'CSE-1002','ITPL',4,'Autocad',4,'OOPS',4,'MP Lab',4,'ST1'),('CSE',2,'CSE-1003','ITPL',4,'Autocad',4,'OOPS',4,'MP Lab',4,'ST1'),('CSE',3,'CSE-1001','Data Structures',1,'Computer Networking',2,'Client Side Technologies',3,'MPI',3,'ST1'),('CSE',3,'CSE-1002','Data Structures',3,'Computer Networking',3,'Client Side Technologies',3,'MPI',3,'ST1'),('CSE',3,'CSE-1003','Data Structures',3,'Computer Networking',3,'Client Side Technologies',3,'MPI',3,'ST1'),('CSE',3,'CSE-1004','Data Structures',3,'Computer Networking',3,'Client Side Technologies',3,'MPI',3,'ST1'),('CSE',3,'CSE-1005','Data Structures',3,'Computer Networking',3,'Client Side Technologies',3,'MPI',3,'ST1'),('CSE',3,'CSE-1006','Data Structures',3,'Computer Networking',3,'Client Side Technologies',3,'MPI',3,'ST1'),('CSE',3,'CSE-1007','Data Structures',3,'Computer Networking',3,'Client Side Technologies',3,'MPI',3,'ST1'),('CSE',3,'CSE-1008','Data Structures',3,'Computer Networking',3,'Client Side Technologies',3,'MPI',3,'ST1'),('MECH',1,'MECH-1001','Data Structures',1,'Computer Networking',3,'Client Side Technologies',3,'MPI',3,'ST1'),('MECH',1,'MECH-1001','Data Structures',1,'Computer Networking',3,'Client Side Technologies',3,'MPI',3,'ST1'),('MECH',1,'MECH-1002','Data Structures',3,'Computer Networking',3,'Client Side Technologies',3,'MPI',3,'ST1'),('CSE',1,'CSE-1005','Engg. Physics',11,'Engg Chemistry',12,'Engg Maths',11,'Engg drawing',12,'ST1'),('CSE',1,'CSE-1006','Engg. Physics',21,'Engg Chemistry',21,'Engg Maths',21,'Engg drawing',21,'ST1'),('CSE',1,'CSE-1007','Engg. Physics',22,'Engg Chemistry',22,'Engg Maths',22,'Engg drawing',22,'ST1'),('CSE',1,'CSE-1008','Engg. Physics',23,'Engg Chemistry',23,'Engg Maths',23,'Engg drawing',23,'ST1'),('MECH',2,'MECH-1001','ITPL',45,'Autocad',45,'OOPS',45,'MP Lab',78,'ST1'),('MECH',2,'MECH-1002','ITPL',78,'Autocad',78,'OOPS',78,'MP Lab',78,'ST1'),('MECH',2,'MECH-1003','ITPL',0,'Autocad',0,'OOPS',0,'MP Lab',0,'ST1');
/*!40000 ALTER TABLE `marks1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project3f`
--

DROP TABLE IF EXISTS `project3f`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project3f` (
  `Name` varchar(20) DEFAULT NULL,
  `Userid` varchar(10) DEFAULT NULL,
  `Password` varchar(16) DEFAULT NULL,
  `contact` varchar(10) DEFAULT NULL,
  `Department` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project3f`
--

LOCK TABLES `project3f` WRITE;
/*!40000 ALTER TABLE `project3f` DISABLE KEYS */;
INSERT INTO `project3f` VALUES ('rajesh','1','jain1','9885865662','MECH'),('raman','2','jain','8556062258','CSE');
/*!40000 ALTER TABLE `project3f` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project3s`
--

DROP TABLE IF EXISTS `project3s`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project3s` (
  `Name` varchar(20) DEFAULT NULL,
  `Userid` varchar(10) DEFAULT NULL,
  `Password` varchar(16) DEFAULT NULL,
  `contact` varchar(10) DEFAULT NULL,
  `Department` varchar(10) DEFAULT NULL,
  `rollno` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project3s`
--

LOCK TABLES `project3s` WRITE;
/*!40000 ALTER TABLE `project3s` DISABLE KEYS */;
INSERT INTO `project3s` VALUES ('Aman','aman11','123123','1212121212','MECH','MECH-1001');
/*!40000 ALTER TABLE `project3s` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `readm`
--

DROP TABLE IF EXISTS `readm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `readm` (
  `rollno` varchar(10) DEFAULT NULL,
  `date` varchar(15) DEFAULT NULL,
  `name` varchar(15) DEFAULT NULL,
  `fname` varchar(15) DEFAULT NULL,
  `sem` varchar(10) DEFAULT NULL,
  `deptt` varchar(10) DEFAULT NULL,
  `semfee` varchar(10) DEFAULT NULL,
  `hostel` varchar(10) DEFAULT NULL,
  `transport` varchar(10) DEFAULT NULL,
  `total` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `readm`
--

LOCK TABLES `readm` WRITE;
/*!40000 ALTER TABLE `readm` DISABLE KEYS */;
INSERT INTO `readm` VALUES ('MECH-1003','27/Dec/2016','Sanju','Mahesh','2','MECH','43000','yes','yes','94000');
/*!40000 ALTER TABLE `readm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salary` (
  `Ecode` int(11) DEFAULT NULL,
  `Tid` int(11) DEFAULT NULL,
  `TDate` date DEFAULT NULL,
  `Salary` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (1,2,'1996-02-02',10225);
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject` (
  `Dname` varchar(5) DEFAULT NULL,
  `sem` varchar(5) DEFAULT NULL,
  `sub1` varchar(25) DEFAULT NULL,
  `sub2` varchar(25) DEFAULT NULL,
  `sub3` varchar(25) DEFAULT NULL,
  `sub4` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('CSE','1','Engg. Physics','Engg Chemistry','Engg Maths','Engg drawing'),('MECH','1','Engg. Physics','Engg Chemistry','Engg Maths','Engg drawing'),('ECE','1','Engg. Physics','Engg Chemistry','Engg Maths','Engg drawing'),('CIVIL','1','Engg. Physics','Engg Chemistry','Engg Maths','Engg drawing'),('CSE','2','ITPL','Autocad','OOPS','MP Lab'),('MECH','2','ITPL','Autocad','OOPS','MP Lab'),('ECE','2','ITPL','Autocad','OOPS','MP Lab'),('CIVIL','2','ITPL','Autocad','OOPS','MP Lab'),('CSE','3','Data Structures','Computer Networking','Client Side Technologies','MPI'),('MECH','3','SOM','DOM','Fluid Mechanics','Thermal Engineering'),('ECE','3','Chip Coding','Aurdino','Electronics Engg.','Electrical Shop'),('CIVIL','3','Drawing','SOM','Mapping','Autocad II'),('ECE','1','','','',''),('MECH','3','','','',''),('MECH','2','','','',''),('MECH','2','','','',''),('MECH','2','','','',''),('MECH','2','','','',''),('MECH','1','','','',''),('MECH','2','','','',''),('CSE','1','','','','');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-29 14:26:13
