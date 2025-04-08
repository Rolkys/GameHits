-- Tabla Empleado
CREATE TABLE Empleado (
	DNI VARCHAR(9) PRIMARY KEY,
    idEmpleado INT AUTO_INCREMENT UNIQUE,
    Nombre VARCHAR(20) NOT NULL,
    idJefe INT,
    FOREIGN KEY (idJefe) REFERENCES Empleado(idEmpleado)
);

-- Tabla Cliente
CREATE TABLE Cliente (
	dni VARCHAR(9) PRIMARY KEY,
    idCliente INT AUTO_INCREMENT UNIQUE,
    nombre VARCHAR(100) NOT NULL,
    puntos INT DEFAULT 0
);

-- Tabla VideoJuego
CREATE TABLE VideoJuego (
    idJuego INT AUTO_INCREMENT PRIMARY KEY,
    Titulo VARCHAR(100) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    tipoJuego VARCHAR(50),
    categoria VARCHAR(50),
    stock INT DEFAULT 10
);

-- Tabla Factura
CREATE TABLE Factura (
    idFactura INT AUTO_INCREMENT PRIMARY KEY,
    total DECIMAL(6,2) NOT NULL,
    puntos INT DEFAULT 0,
    idEmpleado INT NOT NULL,
    idCliente INT NOT NULL,
    FOREIGN KEY (idEmpleado) REFERENCES Empleado(idEmpleado),
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
);

-- Tabla intermedia Factura_Contiene_VideoJuego
CREATE TABLE Factura_Contiene_VideoJuego (
    idFactura INT,
    idJuego INT,
    cantidad INT DEFAULT 1,
    PRIMARY KEY (idFactura, idJuego),
    FOREIGN KEY (idFactura) REFERENCES Factura(idFactura),
    FOREIGN KEY (idJuego) REFERENCES VideoJuego(idJuego)
);
