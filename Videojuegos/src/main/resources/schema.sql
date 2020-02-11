drop table if exists videojuegos;
drop table if exists distribuidor;


CREATE table videojuegos (
	id int primary key auto_increment,
	nombre varchar(200) not null,
	descripcion varchar(3000),
	imagen_url varchar(500)
);

INSERT INTO videojuegos (id, nombre, descripcion, imagen_url) 
values (1, "Oracle", "Software", "https://cached.imagescaler.hbpl.co.uk/resize/scaleWidth/743/cached.offlinehbpl.hbpl.co.uk/news/SUC/1-20170427111658168.jpg"), 
(2, "IBM", "Software II", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/IBM_logo.svg/245px-IBM_logo.svg.png"),
(3, "Microsoft", "Software II", "https://www.utn.edu.ar/images/Secretarias/TIC/microsoft.png"),
(4, "Google", "Software III", "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");

create table distribuidor (
	id int primary key auto_increment,
	nombre varchar(300) not null,
	sitio_web varchar(500)
);

insert into distribuidor
(id, nombre, sitio_web) values
(1, "Dist1", "https://dist1.com"),
(2, "Dist2", "https://dist2.com");

alter table videojuegos
add column distribuidor_id int,
add foreign key (distribuidor_id) references distribuidor(id);

update videojuegos set distribuidor_id = 1 where id in(1,3);
update videojuegos set distribuidor_id = 2 where id in(2,4);

alter table videojuegos
modify distribuidor_id int not null;