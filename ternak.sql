-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2020 at 01:00 PM
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
-- Table structure for table `riwayat_bobot`
--

CREATE TABLE `riwayat_bobot` (
  `no` int(11) NOT NULL,
  `nomer_ternak` int(10) NOT NULL,
  `tanggal_penimbangan` date NOT NULL,
  `bobot` varchar(10) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `riwayat_bobot`
--

INSERT INTO `riwayat_bobot` (`no`, `nomer_ternak`, `tanggal_penimbangan`, `bobot`, `keterangan`) VALUES
(1, 1, '2020-12-01', '55', 'sakit'),
(2, 1, '2020-12-08', '60', 'sehat'),
(3, 2, '2020-12-08', '70', '-'),
(4, 3, '2020-12-15', '45', 's'),
(5, 2, '2020-12-01', '75', 's');

-- --------------------------------------------------------

--
-- Table structure for table `riwayat_kesehatan`
--

CREATE TABLE `riwayat_kesehatan` (
  `no` int(11) NOT NULL,
  `nomer_ternak` int(10) NOT NULL,
  `tanggal` date NOT NULL,
  `gejala` varchar(30) NOT NULL,
  `diagnosa` varchar(30) NOT NULL,
  `tindakan` text NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `riwayat_kesehatan`
--

INSERT INTO `riwayat_kesehatan` (`no`, `nomer_ternak`, `tanggal`, `gejala`, `diagnosa`, `tindakan`, `keterangan`) VALUES
(1, 1, '2020-12-01', '-', '-', '-', '-'),
(2, 1, '2020-12-06', 'batuk', 'sakit', 'suntik', '-'),
(3, 2, '2020-12-08', 'pilek', 'tipes', 'suntik', '-'),
(4, 3, '2020-12-15', 'g', 'd', 't', 'k'),
(5, 2, '2020-12-01', 'k', 'k', 'k', 'k');

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
(1, '07-12-2020', '09-12-2020 / P', 'Kambing', 2, 'Remaja', '55', 's'),
(2, '17-12-2020', '15-12-2020 / P', 'Domba', 3, 'Remaja', '66', 's'),
(3, '12-12-2020', '17-12-2020 / L', 'Domba', 4, 'Dewasa', '76', 's'),
(4, '25-12-2020', '14-10-2020 / L', 'Kambing', 5, 'Anakan', '54', 'p'),
(5, '13-12-2020', '12-12-2020', 'Sapi', 6, 'Anakan', '66', 'd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `riwayat_bobot`
--
ALTER TABLE `riwayat_bobot`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `riwayat_kesehatan`
--
ALTER TABLE `riwayat_kesehatan`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `ternak`
--
ALTER TABLE `ternak`
  ADD PRIMARY KEY (`nomer_ternak`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `riwayat_bobot`
--
ALTER TABLE `riwayat_bobot`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `riwayat_kesehatan`
--
ALTER TABLE `riwayat_kesehatan`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
