CREATE TABLE IF NOT EXISTS provincias(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
    nombre VARCHAR(150) NOT NULL,
    pais_id BIGINT NOT NULL,
    FOREIGN KEY (pais_id) REFERENCES paises(id)
);