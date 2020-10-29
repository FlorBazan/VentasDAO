create table clientes (
	id serial not null,
	documento character varying (10),
	nombre character varying (60),
	apellido character varying (60),
	tipo_cliente_id integer,
	primary key (id)	
)