-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2021 at 02:24 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `flashlaundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `jasa`
--

CREATE TABLE `jasa` (
  `idJasa` int(11) NOT NULL,
  `namaJasa` varchar(255) NOT NULL,
  `deskripsiJasa` text NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jasa`
--

INSERT INTO `jasa` (`idJasa`, `namaJasa`, `deskripsiJasa`, `harga`) VALUES
(1, 'printer', 'da waw daw wad wad aw 1', 100001),
(5, 'printer1', 'da waw daw wad wad aw 11', 1000011);

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `username` varchar(20) NOT NULL,
  `noHP` varchar(20) NOT NULL,
  `alamatPengguna` text NOT NULL,
  `email` varchar(50) NOT NULL,
  `kataSandi` varchar(20) NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`username`, `noHP`, `alamatPengguna`, `email`, `kataSandi`, `create_date`) VALUES
('lovanto', '087823837566', 'Bandung pada saatnya akan pergi untuk mencari sesuap berlian', 'rifkylovanto@gmail.com', 'Inzanami123', '2021-04-21 02:45:55');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `idTransaksi` int(11) NOT NULL,
  `idJasa` int(11) NOT NULL,
  `deskripsiTransaksi` text NOT NULL,
  `berat` int(11) NOT NULL,
  `ongkir` int(11) NOT NULL,
  `totalBayar` varchar(11) NOT NULL,
  `tgl_transaksi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`idTransaksi`, `idJasa`, `deskripsiTransaksi`, `berat`, `ongkir`, `totalBayar`, `tgl_transaksi`) VALUES
(1, 1, 'jyuu', 4, 5, '7', '2021-06-15');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jasa`
--
ALTER TABLE `jasa`
  ADD PRIMARY KEY (`idJasa`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idTransaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jasa`
--
ALTER TABLE `jasa`
  MODIFY `idJasa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `idTransaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
