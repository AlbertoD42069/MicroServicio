CREATE DATABASE automovil;
CREATE TABLE tabla_general_marca_auto(
	id  SERIAL NOT NULL  PRIMARY KEY, 
	nombre VARCHAR(50) UNIQUE,
	pais_Origen VARCHAR(50) NOT NULL,
	calificacion VARCHAR(50) NOT NULL,
	descripcion VARCHAR(50) NOT NULL,
	detalles VARCHAR(50) NOT NULL	);
	
CREATE TABLE tabla_detalles_modelo_auto(
 	id SERIAL NOT NULL PRIMARY KEY,
 	marca VARCHAR(50) UNIQUE,
 	modelo VARCHAR(50) UNIQUE,
 	calificacion VARCHAR(50) NOT NULL,
 	precio VARCHAR(50) NOT NULL,
 	estatus VARCHAR(50) NOT NULL
 	);


-- SELECT * FROM tabla_general_marca_auto
	-- ORDER BY nombre ASC 
	-- LIMIT 10;

-- SELECT * FROM tabla_detalles_modelo_auto
	-- WHERE estatus = 'inactivo' 
	-- ORDER BY marca ASC 
	-- LIMIT 10;
	
-- UPDATE tabla_general_marca_auto SET nombre = 'Chevrolet' WHERE id = 1;
-- UPDATE tabla_detalles_modelo_auto SET marca = '' WHERE id = 1; 
	
-- DELETE FROM tabla_general_marca_auto WHERE id = '1';
-- DELETE FROM tabla_detalles_modelo_auto WHERE id = '1';

