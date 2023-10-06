 CREATE DATABASE IF NOT EXISTS pruebadela_uni CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
 drop database pruebadela_uni;
 
 use paises;
 
 select * from provincia;
 
 SELECT constraint_name, constraint_type FROM information_schema.table_constraints WHERE table_name = "provincias";
 ALTER TABLE provincias DROP INDEX pais_id;
 CREATE TABLE IF NOT EXISTS paises(
    id bigint PRIMARY KEY AUTO_INCREMENT UNIQUE,
    nombre VARCHAR(150) UNIQUE
);
use apipaises;
SELECT * FROM flyway_schema_history;
DELETE FROM flyway_schema_history WHERE installed_rank = 2;

ALTER TABLE provincias MODIFY pais_id bigint;
DROP TABLE paises;
DROP TABLE provincias;
DELETE FROM paises WHERE id = 1;
SELECT * FROM paises;



#INSERT UUSS
INSERT INTO provincias (nombre, pais_id) VALUES
    ('Alabama', 2),
    ('Alaska', 2),
    ('Arizona', 2),
    ('Arkansas', 2),
    ('California', 2),
    ('Colorado', 2),
    ('Connecticut', 2),
    ('Delaware', 2),
    ('Florida', 2),
    ('Georgia', 2),
    ('Hawái', 2),
    ('Idaho', 2),
    ('Illinois', 2),
    ('Indiana', 2),
    ('Iowa', 2),
    ('Kansas', 2),
    ('Kentucky', 2),
    ('Luisiana', 2),
    ('Maine', 2),
    ('Maryland', 2),
    ('Massachusetts', 2),
    ('Míchigan', 2),
    ('Minnesota', 2),
    ('Misisipi', 2),
    ('Misuri', 2),
    ('Montana', 2),
    ('Nebraska', 2),
    ('Nevada', 2),
    ('Nuevo Hampshire', 2),
    ('Nueva Jersey', 2),
    ('Nuevo México', 2),
    ('Nueva York', 2),
    ('Carolina del Norte', 2),
    ('Dakota del Norte', 2),
    ('Ohio', 2),
    ('Oklahoma', 2),
    ('Oregón', 2),
    ('Pensilvania', 2),
    ('Rhode Island', 2),
    ('Carolina del Sur', 2),
    ('Dakota del Sur', 2),
    ('Tennessee', 2),
    ('Texas', 2),
    ('Utah', 2),
    ('Vermont', 2),
    ('Virginia', 2),
    ('Washington', 2),
    ('Virginia Occidental', 2),
    ('Wisconsin', 2),
    ('Wyoming', 2);
    
    INSERT INTO paises (nombre) VALUES
    ('Canadá'),
    ('Estados Unidos'),
    ('México'),
    ('Belice'),
    ('Costa Rica'),
    ('El Salvador'),
    ('Guatemala'),
    ('Honduras'),
    ('Nicaragua'),
    ('Panamá'),
    ('Antigua y Barbuda'),
    ('Bahamas'),
    ('Barbados'),
    ('Cuba'),
    ('Dominica'),
    ('Granada'),
    ('Haití'),
    ('Jamaica'),
    ('Puerto Rico'),
    ('República Dominicana'),
    ('San Cristóbal y Nieves'),
    ('Santa Lucía'),
    ('San Vicente y las Granadinas'),
    ('Trinidad y Tobago'),
    ('Argentina'),
    ('Bolivia'),
    ('Brasil'),
    ('Chile'),
    ('Colombia'),
    ('Ecuador'),
    ('Guyana'),
    ('Paraguay'),
    ('Perú'),
    ('Surinam'),
    ('Uruguay');