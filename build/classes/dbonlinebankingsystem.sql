-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2023 at 02:53 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbonlinebankingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `accountID` varchar(20) NOT NULL,
  `userID` bigint(11) NOT NULL,
  `accountType` int(11) NOT NULL DEFAULT 0,
  `status` int(11) NOT NULL DEFAULT 0,
  `accountBalance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`accountID`, `userID`, `accountType`, `status`, `accountBalance`) VALUES
('123-123-123', 1, 0, 0, 450),
('123-123-124', 1, 1, 0, 1000),
('589-789-456', 2, 0, 0, 998),
('696-696-696', 1, 2, 0, 40);

-- --------------------------------------------------------

--
-- Table structure for table `card`
--

CREATE TABLE `card` (
  `cardID` int(11) NOT NULL,
  `accountID` varchar(20) DEFAULT NULL,
  `cardType` int(11) NOT NULL DEFAULT 0,
  `cardNumber` varchar(20) NOT NULL,
  `expiryDate` date NOT NULL,
  `cvv` int(11) NOT NULL,
  `cardStatus` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `loanapplication`
--

CREATE TABLE `loanapplication` (
  `loanID` bigint(20) UNSIGNED NOT NULL,
  `interestRate` double NOT NULL,
  `paymentDueDate` date NOT NULL,
  `paymentAmount` double NOT NULL,
  `loanApproval` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `loanapproval`
--

CREATE TABLE `loanapproval` (
  `loanId` bigint(20) UNSIGNED NOT NULL,
  `userID` bigint(11) NOT NULL,
  `loanAmount` double NOT NULL,
  `interestRate` float NOT NULL,
  `loanTerm` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `transactionID` bigint(20) UNSIGNED NOT NULL,
  `accountID` varchar(20) DEFAULT NULL,
  `toaccountID` varchar(50) DEFAULT NULL,
  `transactionType` varchar(50) NOT NULL DEFAULT '0',
  `transactionAmount` double NOT NULL,
  `transactionStatus` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`transactionID`, `accountID`, `toaccountID`, `transactionType`, `transactionAmount`, `transactionStatus`) VALUES
(1, '123-123-123', '123-123-123', 'Transfer Funds', 10, 1),
(2, '123-123-123', '123-123-123', 'Transfer Funds', 10, 1),
(3, '123-123-123', '589-789-456', 'Transfer Funds', 10, 1),
(4, '123-123-123', '589-789-456', 'Transfer Funds', 10, 1),
(5, '123-123-123', '123-123-123 ', 'Transfer Funds', 10, 1),
(6, '123-123-123', '589-789-456', 'Transfer Funds', 10, 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userID` bigint(20) UNSIGNED NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `firstName` varchar(20) NOT NULL,
  `middleName` varchar(20) DEFAULT NULL,
  `lastName` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `userType` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `username`, `password`, `firstName`, `middleName`, `lastName`, `email`, `phone`, `address`, `userType`) VALUES
(1, 'jreid22', '123456', 'James', 'Pogi', 'Reid', 'jreid22@gmail.com', '09054839283', '123 Pogi Street Fuente Cebu City', 0),
(2, 'nlustre22', 'employee', 'Nadine', 'Imy', 'Lustre', 'nlustre22@bankosentralngf2.com', '09493869432', '111 Liko Sa Skina Rd Manila', 1);

-- --------------------------------------------------------

--
-- Table structure for table `verification`
--

CREATE TABLE `verification` (
  `customerID` int(11) DEFAULT NULL,
  `accountID` varchar(20) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `typeoftransaction` varchar(20) DEFAULT NULL,
  `status` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `verification`
--

INSERT INTO `verification` (`customerID`, `accountID`, `amount`, `typeoftransaction`, `status`) VALUES
(1, '123-123-134', 0, 'close', 1),
(1, '123-123-134', 0, 'close', 1),
(1, '696-696-696', 0, 'close', 0),
(1, '696-696-696', 0, 'close', 0),
(1, '696-696-696', 0, 'close', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`accountID`);

--
-- Indexes for table `card`
--
ALTER TABLE `card`
  ADD PRIMARY KEY (`cardID`),
  ADD KEY `fk_accountID` (`accountID`);

--
-- Indexes for table `loanapplication`
--
ALTER TABLE `loanapplication`
  ADD PRIMARY KEY (`loanID`),
  ADD UNIQUE KEY `loanID` (`loanID`);

--
-- Indexes for table `loanapproval`
--
ALTER TABLE `loanapproval`
  ADD PRIMARY KEY (`loanId`),
  ADD UNIQUE KEY `loanId` (`loanId`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`transactionID`),
  ADD UNIQUE KEY `transactionID` (`transactionID`),
  ADD KEY `fk_accountID2` (`accountID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userID`),
  ADD UNIQUE KEY `userID` (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `loanapplication`
--
ALTER TABLE `loanapplication`
  MODIFY `loanID` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `loanapproval`
--
ALTER TABLE `loanapproval`
  MODIFY `loanId` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `transactionID` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userID` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `card`
--
ALTER TABLE `card`
  ADD CONSTRAINT `fk_accountID` FOREIGN KEY (`accountID`) REFERENCES `account` (`accountID`);

--
-- Constraints for table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `fk_accountID2` FOREIGN KEY (`accountID`) REFERENCES `account` (`accountID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
