--Creacion de Tablas --
CREATE TABLE categorias (
	id serial not null,
	denominacion character varying (80),
	descripcion character varying (100),
	PRIMARY KEY (id)
)