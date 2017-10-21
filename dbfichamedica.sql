-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 21-10-2017 a las 02:29:52
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `dbfichamedica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fichamedica`
--

CREATE TABLE IF NOT EXISTS `fichamedica` (
  `rut` varchar(10) NOT NULL,
  `nombres` varchar(90) NOT NULL,
  `apellidoP` varchar(60) NOT NULL,
  `apellidoM` varchar(60) NOT NULL,
  `genero` varchar(1) NOT NULL,
  `edad` int(11) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `profesion` varchar(80) NOT NULL,
  `tipocontrato` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `fichamedica`
--

INSERT INTO `fichamedica` (`rut`, `nombres`, `apellidoP`, `apellidoM`, `genero`, `edad`, `direccion`, `profesion`, `tipocontrato`) VALUES
('1', 'Ayane', 'Soto', 'Munoz', 'F', 16, 'Luis Munoz de guzman 01019', 'Estudiante', 'Dependiente'),
('2', 'Ricardo', 'Soto', 'Gomez', 'M', 23, 'Luis Munoz de guzman 01019', 'Tecnico', 'Dependiente');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
