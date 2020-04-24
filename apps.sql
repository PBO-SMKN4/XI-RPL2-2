-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2020 at 01:29 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apps`
--

-- --------------------------------------------------------

--
-- Table structure for table `datasiswa`
--

CREATE TABLE `datasiswa` (
  `NIS` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `id_komentar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `data_mm`
--

CREATE TABLE `data_mm` (
  `cinematography` longblob NOT NULL,
  `2d desain` longblob NOT NULL,
  `3d desain` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `data_rpl`
--

CREATE TABLE `data_rpl` (
  `Desktop` longblob NOT NULL,
  `web` longblob NOT NULL,
  `android` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `data_tkj`
--

CREATE TABLE `data_tkj` (
  `network learning` longblob NOT NULL,
  `hardware learning` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `komentar`
--

CREATE TABLE `komentar` (
  `id_komentar` int(11) NOT NULL,
  `NIS` int(11) NOT NULL,
  `komentar` text NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `materi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `table_data`
--

CREATE TABLE `table_data` (
  `title` varchar(255) NOT NULL,
  `simbol` blob NOT NULL,
  `deskripsi` varchar(255) NOT NULL,
  `jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `table_data`
--

INSERT INTO `table_data` (`title`, `simbol`, `deskripsi`, `jurusan`) VALUES
('MM', '', 'Ini adalah modul pembelajaran MM (Multimedia)', 'MM'),
('RPL', '', 'Ini adalah modul pembalajaran RPL (rekayasa Perangkat Lunak) ', 'RPL'),
('TKJ', '', 'Ini adalah modul pembelajaran TKJ (Tehnik Komputer dan Jaringan) ', 'TKJ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datasiswa`
--
ALTER TABLE `datasiswa`
  ADD PRIMARY KEY (`NIS`),
  ADD KEY `id_komentar` (`id_komentar`),
  ADD KEY `jurusan` (`jurusan`);

--
-- Indexes for table `komentar`
--
ALTER TABLE `komentar`
  ADD PRIMARY KEY (`id_komentar`),
  ADD KEY `NIS` (`NIS`),
  ADD KEY `jurusan` (`jurusan`);

--
-- Indexes for table `table_data`
--
ALTER TABLE `table_data`
  ADD PRIMARY KEY (`jurusan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datasiswa`
--
ALTER TABLE `datasiswa`
  MODIFY `NIS` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `komentar`
--
ALTER TABLE `komentar`
  MODIFY `id_komentar` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `datasiswa`
--
ALTER TABLE `datasiswa`
  ADD CONSTRAINT `datasiswa_ibfk_1` FOREIGN KEY (`id_komentar`) REFERENCES `komentar` (`id_komentar`),
  ADD CONSTRAINT `datasiswa_ibfk_2` FOREIGN KEY (`jurusan`) REFERENCES `table_data` (`jurusan`);

--
-- Constraints for table `komentar`
--
ALTER TABLE `komentar`
  ADD CONSTRAINT `komentar_ibfk_1` FOREIGN KEY (`NIS`) REFERENCES `datasiswa` (`NIS`),
  ADD CONSTRAINT `komentar_ibfk_2` FOREIGN KEY (`jurusan`) REFERENCES `table_data` (`jurusan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
