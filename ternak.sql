-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 19, 2020 at 06:29 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ternak`
--

-- --------------------------------------------------------

--
-- Table structure for table `ternak`
--

CREATE TABLE `ternak` (
  `nomer_ternak` int(10) NOT NULL,
  `tanggal_sapih` text NOT NULL,
  `tanggal_lahir_kelamin` text NOT NULL,
  `jenis_hewan` varchar(20) NOT NULL,
  `nomer_induk_jantan` int(20) NOT NULL,
  `status` varchar(20) NOT NULL,
  `bobot` varchar(10) NOT NULL,
  `kondisi_badan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ternak`
--

INSERT INTO `ternak` (`nomer_ternak`, `tanggal_sapih`, `tanggal_lahir_kelamin`, `jenis_hewan`, `nomer_induk_jantan`, `status`, `bobot`, `kondisi_badan`) VALUES
(121, '20-10-2020', '10-12-2020 , laki-laki', 'kambing', 12221, 'anakan', 'anakan', 'sehat');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ternak`
--
ALTER TABLE `ternak`
  ADD PRIMARY KEY (`nomer_ternak`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ternak`
--
ALTER TABLE `ternak`
  MODIFY `nomer_ternak` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101011;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
