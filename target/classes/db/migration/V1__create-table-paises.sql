CREATE TABLE IF NOT EXISTS paises(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
    nombre VARCHAR(150) NOT NULL UNIQUE
);