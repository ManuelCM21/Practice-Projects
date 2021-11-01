-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 01-11-2021 a las 15:35:25
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemaventa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `dni` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(180) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `dni`, `nombre`, `telefono`, `direccion`) VALUES
(1, '77298041', 'Manuel Chunca', '954569153', 'Quillabamba - Perú'),
(2, '25004270', 'Efrain Chunca Laura', '984157086', 'Av. Edgar de la Torre'),
(3, '44708440', 'Reyna Mamani Blanco', '942783463', 'Jr. Vilcabamba'),
(4, '77298040', 'Frank Grimaldy Chunca', '997448946', 'Urpipata Alta'),
(5, '78945612', 'Jose Luis', '996583153', 'Av. La Union'),
(6, '77592648', 'Nilver Salca Aquino', '984153999', 'Jr. Salkantay');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `config`
--

CREATE TABLE `config` (
  `id` int(11) NOT NULL,
  `ruc` int(15) NOT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` int(11) NOT NULL,
  `direccion` text COLLATE utf8_spanish_ci NOT NULL,
  `mensaje` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `config`
--

INSERT INTO `config` (`id`, `ruc`, `nombre`, `telefono`, `direccion`, `mensaje`) VALUES
(1, 485926159, 'Abarrotes \"Chunca\"', 954569153, 'Quillabamba - Perú', 'De todo para todos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

CREATE TABLE `detalle` (
  `id` int(11) NOT NULL,
  `id_pro` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `id_venta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`id`, `id_pro`, `cantidad`, `precio`, `id_venta`) VALUES
(2, 2, 5, '155.60', 1),
(3, 3, 4, '120.00', 2),
(4, 2, 4, '155.60', 2),
(5, 4, 3, '1250.00', 3),
(6, 3, 7, '120.00', 3),
(7, 2, 5, '155.60', 3),
(8, 2, 2, '155.60', 4),
(9, 3, 4, '120.00', 4),
(10, 4, 2, '1250.00', 4),
(11, 3, 5, '120.00', 5),
(12, 4, 2, '1250.00', 5),
(13, 5, 3, '145.50', 5),
(14, 5, 2, '145.50', 6),
(15, 4, 3, '1250.00', 6),
(16, 4, 4, '1250.00', 7),
(17, 5, 5, '145.50', 7),
(18, 2, 7, '155.60', 8),
(19, 1, 4, '3000.00', 8),
(20, 5, 2, '145.50', 8),
(21, 5, 2, '145.50', 9),
(22, 2, 3, '155.60', 9),
(23, 3, 4, '120.00', 9),
(24, 2, 3, '155.60', 10),
(25, 5, 2, '145.50', 10),
(26, 3, 1, '120.00', 10),
(27, 3, 2, '120.00', 11),
(28, 5, 3, '145.50', 11),
(29, 2, 2, '155.60', 11),
(30, 5, 2, '145.50', 12),
(31, 5, 2, '145.50', 13),
(32, 5, 2, '145.50', 14),
(33, 2, 2, '155.60', 14),
(34, 1, 2, '3000.00', 14),
(35, 5, 15, '145.50', 15),
(36, 4, 2, '1250.00', 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `codigo` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` text COLLATE utf8_spanish_ci NOT NULL,
  `proveedor` int(11) NOT NULL,
  `stock` int(11) NOT NULL,
  `precio` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `codigo`, `nombre`, `proveedor`, `stock`, `precio`) VALUES
(1, '79878789', 'Laptop lenovo', 1, 11, '3000.00'),
(2, '14789632', 'Refrigeradora Hive', 1, 192, '155.60'),
(3, '159632', 'IPhone S35', 1, 28, '120.00'),
(4, '159874', 'Lenovo Core I5', 2, 119, '1250.00'),
(5, '159263', 'Celular S10', 1, 116, '145.50'),
(6, '123456', 'Televisor Samsumg', 1, 152, '1895.50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL,
  `ruc` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id`, `ruc`, `nombre`, `telefono`, `direccion`) VALUES
(1, '998787', 'Open Services', '798978879', 'Lima - Perú'),
(2, '485926', 'Pernfesa', '98886523', 'Lima -Perú');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `usuario` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `pass` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `rol` varchar(20) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `usuario`, `pass`, `rol`) VALUES
(1, 'Manuel Chunca', 'chunca', '77298041', 'Administrador'),
(2, 'Frank Grimaldy', 'frank', '12369', 'Asistente'),
(3, 'Dan Elioth', 'dancito', '14789632', 'Administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` int(11) NOT NULL,
  `cliente` int(11) NOT NULL,
  `vendedor` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `total` decimal(10,2) NOT NULL,
  `fecha` varchar(20) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id`, `cliente`, `vendedor`, `total`, `fecha`) VALUES
(1, 2, 'Manuel Chunca', '778.00', '01/10/2021'),
(2, 3, 'Manuel Chunca', '1102.40', '04/10/2021'),
(3, 4, 'Manuel Chunca', '5368.00', '07/10/2021'),
(4, 2, 'Manuel Chunca', '3291.20', '10/10/2021'),
(5, 2, 'Manuel Chunca', '3536.50', '12/10/2021'),
(6, 3, 'Frank Grimaldy', '4041.00', '12/10/2021'),
(7, 2, 'Frank Grimaldy', '5727.50', '12/10/2021'),
(8, 1, 'Manuel Chunca', '13380.20', '12/10/2021'),
(9, 4, 'Manuel Chunca', '1237.80', '12/10/2021'),
(10, 2, 'Manuel Chunca', '877.80', '12/10/2021'),
(11, 3, 'Manuel Chunca', '987.70', '12/10/2021'),
(12, 4, 'Manuel Chunca', '291.00', '12/10/2021'),
(13, 2, 'Sistema de Venta', '291.00', '13/10/2021'),
(14, 4, 'Manuel Chunca', '6602.20', '13/10/2021'),
(15, 4, 'Manuel Chunca', '4682.50', '28/10/2021');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `config`
--
ALTER TABLE `config`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_venta` (`id_venta`),
  ADD KEY `id_pro` (`id_pro`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `proveedor` (`proveedor`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cliente` (`cliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `config`
--
ALTER TABLE `config`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `detalle`
--
ALTER TABLE `detalle`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD CONSTRAINT `detalle_ibfk_1` FOREIGN KEY (`id_pro`) REFERENCES `productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detalle_ibfk_2` FOREIGN KEY (`id_venta`) REFERENCES `ventas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`proveedor`) REFERENCES `proveedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
