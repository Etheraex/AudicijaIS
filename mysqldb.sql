-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 23, 2019 at 08:17 AM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mysqldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `audition`
--

DROP TABLE IF EXISTS `audition`;
CREATE TABLE IF NOT EXISTS `audition` (
  `IdAudition` int(11) NOT NULL AUTO_INCREMENT,
  `Date` varchar(25) NOT NULL,
  `CompetitionFK` int(11) NOT NULL,
  `GroupFK` int(11) NOT NULL,
  PRIMARY KEY (`IdAudition`),
  KEY `CompetitionFK` (`CompetitionFK`),
  KEY `GroupFK` (`GroupFK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `candidate`
--

DROP TABLE IF EXISTS `candidate`;
CREATE TABLE IF NOT EXISTS `candidate` (
  `IdCandidate` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Surname` varchar(45) NOT NULL,
  `Age` int(11) NOT NULL,
  `CompetitionFK` int(11) DEFAULT NULL,
  `Email` varchar(45) NOT NULL,
  `Round` int(11) NOT NULL,
  PRIMARY KEY (`IdCandidate`),
  KEY `CompetitionFK` (`CompetitionFK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `competition`
--

DROP TABLE IF EXISTS `competition`;
CREATE TABLE IF NOT EXISTS `competition` (
  `IdCompetition` int(11) NOT NULL AUTO_INCREMENT,
  `DeadlineForApplication` varchar(25) NOT NULL,
  PRIMARY KEY (`IdCompetition`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `group`
--

DROP TABLE IF EXISTS `group`;
CREATE TABLE IF NOT EXISTS `group` (
  `IdGroup` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdGroup`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `group_has_candidate`
--

DROP TABLE IF EXISTS `group_has_candidate`;
CREATE TABLE IF NOT EXISTS `group_has_candidate` (
  `IdG_C` int(11) NOT NULL AUTO_INCREMENT,
  `CandidateFK` int(11) DEFAULT NULL,
  `GroupFK` int(11) DEFAULT NULL,
  PRIMARY KEY (`IdG_C`),
  KEY `CandidateFK` (`CandidateFK`),
  KEY `GroupFK` (`GroupFK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `judge`
--

DROP TABLE IF EXISTS `judge`;
CREATE TABLE IF NOT EXISTS `judge` (
  `IdJudge` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Surname` varchar(45) NOT NULL,
  `Age` int(11) NOT NULL,
  `CompetitionFK` int(11) DEFAULT NULL,
  PRIMARY KEY (`IdJudge`),
  KEY `CompetitionFK` (`CompetitionFK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `venue`
--

DROP TABLE IF EXISTS `venue`;
CREATE TABLE IF NOT EXISTS `venue` (
  `IdVenue` int(11) NOT NULL AUTO_INCREMENT,
  `City` varchar(25) NOT NULL,
  `Capacity` int(15) NOT NULL,
  `AuditionFK` int(11) DEFAULT NULL,
  PRIMARY KEY (`IdVenue`),
  KEY `AuditionFK` (`AuditionFK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `group_has_candidate`
--
ALTER TABLE `group_has_candidate`
  ADD CONSTRAINT `group_has_candidate_ibfk_1` FOREIGN KEY (`CandidateFK`) REFERENCES `candidate` (`IdCandidate`),
  ADD CONSTRAINT `group_has_candidate_ibfk_2` FOREIGN KEY (`GroupFK`) REFERENCES `group` (`IdGroup`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
