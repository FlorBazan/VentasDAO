CREATE TABLE productos (
	id serial not null,
	nombre character varying (60),
	descripcion character varying (80),
	precio float, 
	categorias_id integer,
	PRIMARY KEY (id)
)