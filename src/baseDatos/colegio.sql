-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 29-08-2021 a las 21:11:59
-- Versión del servidor: 8.0.18
-- Versión de PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `colegio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acudiente`
--

DROP TABLE IF EXISTS `acudiente`;
CREATE TABLE IF NOT EXISTS `acudiente` (
  `docAcu` varchar(11) COLLATE utf8_bin NOT NULL,
  `nomAcu` varchar(30) COLLATE utf8_bin NOT NULL,
  `apeAcu` varchar(30) COLLATE utf8_bin NOT NULL,
  `dirAcu` varchar(60) COLLATE utf8_bin NOT NULL,
  `telAcu` varchar(11) COLLATE utf8_bin NOT NULL,
  `emaAcu` varchar(30) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`docAcu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `acudiente`
--

INSERT INTO `acudiente` (`docAcu`, `nomAcu`, `apeAcu`, `dirAcu`, `telAcu`, `emaAcu`) VALUES
('1153684957', 'Juan Guillermo', 'Ospina Cordoba', 'cl 34 #41-34', '3025634127', 'juanospina@gmail.com'),
('1684532901', 'Felipe Jose', 'Diaz Lopez', 'cl 97 #21 - 121', '3105426891', 'felipediaz@gmail.com'),
('34965321', 'Andrea Maria', 'Perez Llanos', 'cl 7 #35 - 34 sur', '3157506428', 'andreallanos@gmai.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acudientexestudiante`
--

DROP TABLE IF EXISTS `acudientexestudiante`;
CREATE TABLE IF NOT EXISTS `acudientexestudiante` (
  `consAcuxEst` int(11) NOT NULL AUTO_INCREMENT,
  `docAcuAcuxEst` varchar(11) COLLATE utf8_bin NOT NULL,
  `docEstAcuxEst` varchar(11) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`consAcuxEst`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `acudientexestudiante`
--

INSERT INTO `acudientexestudiante` (`consAcuxEst`, `docAcuAcuxEst`, `docEstAcuxEst`) VALUES
(1001, '1153684957', '1032695481'),
(1002, '1684532901', '1235698741'),
(1003, '34965321', '1325698741');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
CREATE TABLE IF NOT EXISTS `estudiante` (
  `docEst` varchar(11) COLLATE utf8_bin NOT NULL,
  `nomEst` varchar(30) COLLATE utf8_bin NOT NULL,
  `apeEst` varchar(30) COLLATE utf8_bin NOT NULL,
  `dirEst` varchar(60) COLLATE utf8_bin NOT NULL,
  `telEst` varchar(11) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`docEst`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`docEst`, `nomEst`, `apeEst`, `dirEst`, `telEst`) VALUES
('1032695481', 'Camilo Javier', 'Perez Carmona', 'cra 11 #7 - 235', '3112356849'),
('1235698741', 'Marcela Lucia', 'Salgado Monterroza', 'cra 17 #45 - 176', '3035621478'),
('1325698412', 'Adolfo Jose', 'Lizarazo Gomez', 'cl 41 #3 - 65', '3215674102');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

DROP TABLE IF EXISTS `materias`;
CREATE TABLE IF NOT EXISTS `materias` (
  `codMat` int(11) NOT NULL AUTO_INCREMENT,
  `nomMat` varchar(30) COLLATE utf8_bin NOT NULL,
  `graMat` varchar(10) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`codMat`)
) ENGINE=InnoDB AUTO_INCREMENT=2504 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `materias`
--

INSERT INTO `materias` (`codMat`, `nomMat`, `graMat`) VALUES
(2501, 'Matematicas', 'quinto'),
(2502, 'Inglés', 'cuarto'),
(2503, 'Historia', 'tercero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiaxprofesor`
--

DROP TABLE IF EXISTS `materiaxprofesor`;
CREATE TABLE IF NOT EXISTS `materiaxprofesor` (
  `conMatxPro` int(11) NOT NULL AUTO_INCREMENT,
  `codMatMatxPro` int(11) NOT NULL,
  `docProMatxPro` varchar(11) COLLATE utf8_bin NOT NULL,
  `graMatxPro` varchar(10) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`conMatxPro`)
) ENGINE=InnoDB AUTO_INCREMENT=3004 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `materiaxprofesor`
--

INSERT INTO `materiaxprofesor` (`conMatxPro`, `codMatMatxPro`, `docProMatxPro`, `graMatxPro`) VALUES
(3001, 2502, '1032548793', 'cuarto'),
(3002, 2503, '1562976853', 'tercero'),
(3003, 2501, '1263589746', 'quinto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

DROP TABLE IF EXISTS `profesor`;
CREATE TABLE IF NOT EXISTS `profesor` (
  `docPro` varchar(11) COLLATE utf8_bin NOT NULL,
  `nomPro` varchar(30) COLLATE utf8_bin NOT NULL,
  `apePro` varchar(30) COLLATE utf8_bin NOT NULL,
  `dirPro` varchar(60) COLLATE utf8_bin NOT NULL,
  `telPro` varchar(11) COLLATE utf8_bin NOT NULL,
  `emaPro` varchar(30) COLLATE utf8_bin NOT NULL,
  `titPro` varchar(30) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`docPro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`docPro`, `nomPro`, `apePro`, `dirPro`, `telPro`, `emaPro`, `titPro`) VALUES
('1032548793', 'Maria Jose', 'Gutierrez Mejia', 'cra 9 #32 -69', '3025614289', 'mariamejia@gmail.com', 'Licenciada en ingles'),
('1263589746', 'Rafael Jose', 'Alvarez Petro', 'cl 90 #64 - 301', '3205489713', 'rafapetro@gmail.com', 'Licenciado en matematicas'),
('1562976853', 'Silvia Josefa', 'Armanza Velez', 'cra 75 #32 - 123', '3206597002', 'silviavelez@gmail.com', 'Licenciada en historia');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
