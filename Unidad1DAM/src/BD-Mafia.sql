SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Proporciona;
DROP TABLE IF EXISTS Armamento;
DROP TABLE IF EXISTS Propiedades;
DROP TABLE IF EXISTS Ejecutan;
DROP TABLE IF EXISTS Mano_Derecha;
DROP TABLE IF EXISTS Realizan;
DROP TABLE IF EXISTS Sicarios;
DROP TABLE IF EXISTS Producen;
DROP TABLE IF EXISTS Realizadas_a;
DROP TABLE IF EXISTS Ventas;
DROP TABLE IF EXISTS Capital;
DROP TABLE IF EXISTS Mueven;
DROP TABLE IF EXISTS Distribuidores;
DROP TABLE IF EXISTS Producen1;
DROP TABLE IF EXISTS Fabricantes;
DROP TABLE IF EXISTS Mueven1;
DROP TABLE IF EXISTS Transportes;
DROP TABLE IF EXISTS Capo;
DROP TABLE IF EXISTS Venden_a;
DROP TABLE IF EXISTS Consumidores;
DROP TABLE IF EXISTS Drogas;
DROP TABLE IF EXISTS Peces_Gordos;
DROP TABLE IF EXISTS Personas;
DROP TABLE IF EXISTS Tareas;




/* Create Tables */

CREATE TABLE Armamento
(
	cod_armamento int NOT NULL,
	tipo_armamento varchar(20),
	cant_armamento int,
	municion varchar(20),
	cod_capo int NOT NULL,
	PRIMARY KEY (cod_armamento)
);


CREATE TABLE Capital
(
	cod_capital int NOT NULL,
	tipo_cap varchar(20),
	cod_capo int NOT NULL,
	PRIMARY KEY (cod_capital)
);


CREATE TABLE Capo
(
	cod_capo int NOT NULL,
	nom_capo varchar(20),
	PRIMARY KEY (cod_capo)
);


CREATE TABLE Consumidores
(
	cod_cons int NOT NULL,
	nom_cons varchar(20),
	dir_cons varchar(20),
	PRIMARY KEY (cod_cons)
);


CREATE TABLE Distribuidores
(
	cod_dist int NOT NULL,
	nom_dist varchar(20),
	cod_capo int NOT NULL,
	PRIMARY KEY (cod_dist)
);


CREATE TABLE Drogas
(
	cod_drog int NOT NULL,
	tipo_drog varchar(20),
	cant_drog int,
	desc_drog varchar(20),
	precio_drog int,
	PRIMARY KEY (cod_drog)
);


CREATE TABLE Ejecutan
(
	cod_sicarios int NOT NULL,
	cod_personas int NOT NULL
);


CREATE TABLE Fabricantes
(
	cod_fab int NOT NULL,
	nom_fab varchar(20),
	cod_capo int NOT NULL,
	PRIMARY KEY (cod_fab)
);


CREATE TABLE Mano_Derecha
(
	cod_md int NOT NULL,
	nom_md varchar(20),
	cod_capo int NOT NULL,
	cod_sicarios int NOT NULL,
	PRIMARY KEY (cod_md)
);


CREATE TABLE Mueven
(
	cod_dist int NOT NULL,
	cod_drog int NOT NULL
);


CREATE TABLE Mueven1
(
	cod_drog int NOT NULL,
	cod_trans int NOT NULL,
	fecha_porte date
);


CREATE TABLE Peces_Gordos
(
	cod_pez int NOT NULL,
	dir_pez varchar(20),
	nom_pez varchar(20),
	PRIMARY KEY (cod_pez)
);


CREATE TABLE Personas
(
	cod_personas int NOT NULL,
	nom_personas varchar(20),
	dir_personas varchar(20),
	dni_personas int,
	PRIMARY KEY (cod_personas)
);


CREATE TABLE Producen
(
	cod_vent int NOT NULL,
	cod_drog int NOT NULL
);


CREATE TABLE Producen1
(
	cod_fab int NOT NULL,
	cod_drog int NOT NULL
);


CREATE TABLE Propiedades
(
	cod_prop int NOT NULL,
	lugar_prop varchar(20),
	tipo_prop varchar(20),
	descc_prop varchar(20),
	cod_capo int NOT NULL,
	cod_capital int NOT NULL,
	PRIMARY KEY (cod_prop)
);


CREATE TABLE Proporciona
(
	cod_armamento int NOT NULL,
	cod_sicarios int NOT NULL
);


CREATE TABLE Realizadas_a
(
	cod_vent int NOT NULL,
	cod_pez int NOT NULL
);


CREATE TABLE Realizan
(
	cod_sicarios int NOT NULL,
	cod_tarea int NOT NULL
);


CREATE TABLE Sicarios
(
	cod_sicarios int NOT NULL,
	nom_sicarios varchar(20),
	cod_capital int NOT NULL,
	cod_sicario_jefe int NOT NULL,
	PRIMARY KEY (cod_sicarios)
);


CREATE TABLE Tareas
(
	cod_tarea int NOT NULL,
	nom_tarea varchar(20),
	desc_tarea varchar(20),
	PRIMARY KEY (cod_tarea)
);


CREATE TABLE Transportes
(
	cod_trans int NOT NULL,
	tipo_trans varchar(20),
	desc_trans varchar(20),
	cod_capo int NOT NULL,
	PRIMARY KEY (cod_trans)
);


CREATE TABLE Venden_a
(
	cod_pez int NOT NULL,
	cod_cons int NOT NULL
);


CREATE TABLE Ventas
(
	cod_vent int NOT NULL,
	desc_vent varchar(20),
	lugar_vent varchar(20),
	fecha_vent varchar(20),
	cod_capital int NOT NULL,
	PRIMARY KEY (cod_vent)
);



/* Create Foreign Keys */

ALTER TABLE Proporciona
	ADD FOREIGN KEY (cod_armamento)
	REFERENCES Armamento (cod_armamento)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Propiedades
	ADD FOREIGN KEY (cod_capital)
	REFERENCES Capital (cod_capital)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Sicarios
	ADD FOREIGN KEY (cod_capital)
	REFERENCES Capital (cod_capital)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Ventas
	ADD FOREIGN KEY (cod_capital)
	REFERENCES Capital (cod_capital)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Armamento
	ADD FOREIGN KEY (cod_capo)
	REFERENCES Capo (cod_capo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Capital
	ADD FOREIGN KEY (cod_capo)
	REFERENCES Capo (cod_capo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Distribuidores
	ADD FOREIGN KEY (cod_capo)
	REFERENCES Capo (cod_capo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Fabricantes
	ADD FOREIGN KEY (cod_capo)
	REFERENCES Capo (cod_capo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Mano_Derecha
	ADD FOREIGN KEY (cod_capo)
	REFERENCES Capo (cod_capo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Propiedades
	ADD FOREIGN KEY (cod_capo)
	REFERENCES Capo (cod_capo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Transportes
	ADD FOREIGN KEY (cod_capo)
	REFERENCES Capo (cod_capo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Venden_a
	ADD FOREIGN KEY (cod_cons)
	REFERENCES Consumidores (cod_cons)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Mueven
	ADD FOREIGN KEY (cod_dist)
	REFERENCES Distribuidores (cod_dist)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Mueven
	ADD FOREIGN KEY (cod_drog)
	REFERENCES Drogas (cod_drog)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Mueven1
	ADD FOREIGN KEY (cod_drog)
	REFERENCES Drogas (cod_drog)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Producen
	ADD FOREIGN KEY (cod_drog)
	REFERENCES Drogas (cod_drog)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Producen1
	ADD FOREIGN KEY (cod_drog)
	REFERENCES Drogas (cod_drog)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Producen1
	ADD FOREIGN KEY (cod_fab)
	REFERENCES Fabricantes (cod_fab)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizadas_a
	ADD FOREIGN KEY (cod_pez)
	REFERENCES Peces_Gordos (cod_pez)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Venden_a
	ADD FOREIGN KEY (cod_pez)
	REFERENCES Peces_Gordos (cod_pez)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Ejecutan
	ADD FOREIGN KEY (cod_personas)
	REFERENCES Personas (cod_personas)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Ejecutan
	ADD FOREIGN KEY (cod_sicarios)
	REFERENCES Sicarios (cod_sicarios)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Mano_Derecha
	ADD FOREIGN KEY (cod_sicarios)
	REFERENCES Sicarios (cod_sicarios)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Proporciona
	ADD FOREIGN KEY (cod_sicarios)
	REFERENCES Sicarios (cod_sicarios)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (cod_sicarios)
	REFERENCES Sicarios (cod_sicarios)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Sicarios
	ADD CONSTRAINT Jefe_de FOREIGN KEY (cod_sicario_jefe)
	REFERENCES Sicarios (cod_sicarios)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (cod_tarea)
	REFERENCES Tareas (cod_tarea)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Mueven1
	ADD FOREIGN KEY (cod_trans)
	REFERENCES Transportes (cod_trans)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Producen
	ADD FOREIGN KEY (cod_vent)
	REFERENCES Ventas (cod_vent)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizadas_a
	ADD FOREIGN KEY (cod_vent)
	REFERENCES Ventas (cod_vent)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



