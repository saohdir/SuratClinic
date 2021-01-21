-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2019 at 09:45 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `surat_klinik`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_admin`
--

CREATE TABLE `tbl_admin` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_admin`
--

INSERT INTO `tbl_admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_dokter`
--

CREATE TABLE `tbl_dokter` (
  `Count` int(11) NOT NULL,
  `Tanggal` date NOT NULL,
  `id_dokter` char(6) NOT NULL,
  `Nama_Dokter` varchar(45) NOT NULL,
  `Usia` varchar(45) NOT NULL,
  `Jenis_Kelamin` varchar(45) NOT NULL,
  `Spesialis` varchar(45) NOT NULL,
  `Nomor_Telepon` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Alamat` longtext NOT NULL,
  `Ruangan` varchar(6) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_dokter`
--

INSERT INTO `tbl_dokter` (`Count`, `Tanggal`, `id_dokter`, `Nama_Dokter`, `Usia`, `Jenis_Kelamin`, `Spesialis`, `Nomor_Telepon`, `Email`, `Alamat`, `Ruangan`, `username`, `password`) VALUES
(1, '2019-04-04', 'D0001', 'Jeano', '19', 'Pria', 'Jantung', '081976764536', 'jeano@gmail.com', 'Bekasi', 'J001', 'jeano', 'jeano'),
(2, '2019-04-11', 'D0002', 'Ridho', '20', 'Pria', 'Gigi', '082766648267', 'ridho@gmail.com', 'Jakarta', 'G001', 'ridho', 'ridho');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kasir`
--

CREATE TABLE `tbl_kasir` (
  `Count` int(11) NOT NULL,
  `id_kasir` varchar(45) NOT NULL,
  `Nama_Kasir` varchar(45) NOT NULL,
  `Usia` varchar(45) NOT NULL,
  `Jenis_Kelamin` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Alamat` varchar(45) NOT NULL,
  `Tanggal` varchar(45) NOT NULL,
  `Nomor_Telepon` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_kasir`
--

INSERT INTO `tbl_kasir` (`Count`, `id_kasir`, `Nama_Kasir`, `Usia`, `Jenis_Kelamin`, `Email`, `Alamat`, `Tanggal`, `Nomor_Telepon`, `username`, `password`) VALUES
(1, '', '', '', '', '', '', '', '', 'ayu', 'ayu');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_obatobatan`
--

CREATE TABLE `tbl_obatobatan` (
  `Id_obat` char(6) NOT NULL,
  `Nama_Obat` varchar(45) NOT NULL,
  `Tipe_Obat` varchar(45) NOT NULL,
  `Harga_Obat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_obatobatan`
--

INSERT INTO `tbl_obatobatan` (`Id_obat`, `Nama_Obat`, `Tipe_Obat`, `Harga_Obat`) VALUES
('OB001', 'Rhinofed Tablet', 'THT', 33000),
('OB002', 'IMBOOST FORCE syrp 60ml', 'THT', 65000),
('OB003', 'Toplexil syrp 60ml', 'THT', 56000),
('OB004', 'Lapifed Tablet ', 'THT', 37000),
('OB005', 'Trifed Tablet', 'THT', 42000),
('OB006', 'Vital Ear Oil 10ml', 'THT', 15000),
('OB007', 'Tarivid Otic 3mg/ml tetes 5ml', 'THT', 110200),
('OB008', 'Telfast Plust Tablet', 'THT', 68000),
('OB009', 'Trifedrin Tablet', 'THT', 51000),
('OB010', 'Earlymicetin', 'THT', 7000),
('OB011', 'Cataflam Tablet 50mg', 'Gigi', 65000),
('OB012', 'Mycostatin Drop 12ml', 'Gigi', 70000),
('OB013', 'Listerine Green Tea 80ml', 'Gigi', 11000),
('OB014', 'Listerine Natural Green Tea', 'Gigi', 43500),
('OB015', 'Orodin 0,45 mg/ml semprot 15ml', 'Gigi', 20000),
('OB016', 'Dolos 500mg kaplet', 'Gigi', 12500),
('OB017', 'Nichostan 500mg kaplet', 'Gigi', 5500),
('OB018', 'Cataflam Fast', 'Gigi', 10300),
('OB019', 'Benostan 500mg Tablet', 'Gigi', 12000),
('OB020', 'Aloclair Plus Obat Kumur 60ml', 'Gigi', 121500),
('OB021', 'Normofat 10mg tablet', 'Jantung & Pembuluh darah', 65000),
('OB022', 'Co-Aprovel 150/12.5 mg tablet', 'Jantung & Pembuluh darah', 231000),
('OB023', 'Aptor 100mg Tablet', 'Jantung & Pembuluh Darah', 5000),
('OB024', 'Simvastatin Kimia Farma 20mg', 'Jantung & Pembuluh Darah', 12500),
('OB025', 'Concor 5mg Tablet', 'Jantung & Pembuluh Darah', 108000),
('OB026', 'Concor 2.5mg Tablet', 'Jantung & Pembuluh Darah', 78500),
('OB027', 'Corsel Kaplet', 'Jantung & Pembuluh Darah', 70000),
('OB028', 'Clopidogrel Hexpharm 75mg tablet', 'Jantung & Pembuluh Darah', 130000),
('OB029', 'Citen Kapsul', 'Jantung & Pembuluh Darah', 48000),
('OB030', 'Plavos 75mg Tablet', 'Jantung & Pembuluh Darah', 165000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pasien`
--

CREATE TABLE `tbl_pasien` (
  `Count` int(11) NOT NULL,
  `Tanggal` date NOT NULL,
  `id_pasien` char(6) NOT NULL,
  `Nama_Pasien` varchar(45) NOT NULL,
  `Usia` varchar(45) NOT NULL,
  `Jenis_Kelamin` varchar(45) NOT NULL,
  `Alamat` longtext NOT NULL,
  `Nomor_Telepon` varchar(45) NOT NULL,
  `Penyakit` varchar(45) NOT NULL,
  `Ruangan` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_pasien`
--

INSERT INTO `tbl_pasien` (`Count`, `Tanggal`, `id_pasien`, `Nama_Pasien`, `Usia`, `Jenis_Kelamin`, `Alamat`, `Nomor_Telepon`, `Penyakit`, `Ruangan`) VALUES
(1, '2019-04-06', 'PS001', 'Roland', '19', 'Pria', 'Jakarta', '08197776475', 'Sakit Gigi', '213'),
(2, '2019-04-06', 'PS002', 'asd', '2', 'Pria', 'asd', '12312', 'asd', 'asd'),
(3, '2019-04-05', 'PS003', 'kesi', '12', 'Pria', 'ad', '232', 'asdsa', '3213'),
(4, '2019-04-12', 'PS004', 'ffsad', '23', 'Pria', 'dsa', 'dsa', 'dsada', 'dsaa'),
(5, '2019-04-04', 'PS005', 'ewqe', '13', 'Pria', '2313', 'wqeqw', 'eqweqw', 'ewqeq'),
(6, '2019-04-13', 'PS006', 'lko', '34', 'Pria', 'dsdw', '42356', 'dw', '546');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_perjanjian`
--

CREATE TABLE `tbl_perjanjian` (
  `dName` varchar(45) NOT NULL,
  `pName` varchar(45) NOT NULL,
  `Ruangan` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_perjanjian`
--

INSERT INTO `tbl_perjanjian` (`dName`, `pName`, `Ruangan`) VALUES
('Ridho', 'Roland', 'G001'),
('Jeano', 'Roland', 'J001'),
('Jeano', 'Roland', 'J001'),
('Jeano', 'Roland', 'J001'),
('Jeano', 'Roland', 'J001'),
('Ridho', 'Roland', 'G001');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_resepsionis`
--

CREATE TABLE `tbl_resepsionis` (
  `Count` int(11) NOT NULL,
  `Tanggal` date NOT NULL,
  `id_resepsionis` char(6) NOT NULL,
  `Nama_Resepsionis` varchar(45) NOT NULL,
  `Usia` varchar(45) NOT NULL,
  `Jenis_Kelamin` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Nomor_Telepon` varchar(45) NOT NULL,
  `Alamat` longtext NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_resepsionis`
--

INSERT INTO `tbl_resepsionis` (`Count`, `Tanggal`, `id_resepsionis`, `Nama_Resepsionis`, `Usia`, `Jenis_Kelamin`, `Email`, `Nomor_Telepon`, `Alamat`, `username`, `password`) VALUES
(1, '2019-04-05', 'R0001', 'Udin', '20', 'Pria', 'udin@gmail.com', '081787882646', 'bekasi', 'udin', 'udin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_dokter`
--
ALTER TABLE `tbl_dokter`
  ADD PRIMARY KEY (`Count`);

--
-- Indexes for table `tbl_kasir`
--
ALTER TABLE `tbl_kasir`
  ADD PRIMARY KEY (`Count`);

--
-- Indexes for table `tbl_pasien`
--
ALTER TABLE `tbl_pasien`
  ADD PRIMARY KEY (`Count`);

--
-- Indexes for table `tbl_resepsionis`
--
ALTER TABLE `tbl_resepsionis`
  ADD PRIMARY KEY (`Count`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_dokter`
--
ALTER TABLE `tbl_dokter`
  MODIFY `Count` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_kasir`
--
ALTER TABLE `tbl_kasir`
  MODIFY `Count` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_pasien`
--
ALTER TABLE `tbl_pasien`
  MODIFY `Count` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_resepsionis`
--
ALTER TABLE `tbl_resepsionis`
  MODIFY `Count` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
