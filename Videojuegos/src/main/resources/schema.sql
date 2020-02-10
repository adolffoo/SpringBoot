drop table if exists videojuegos;

CREATE table videojuegos (
	id int primary key auto_increment,
	nombre varchar(200) not null,
	descripcion varchar(3000),
	imagen_url varchar(500)
);

INSERT INTO videojuegos (nombre, descripcion, imagen_url) 
values ("Oracle", "Herramienta mundial", "https://cached.imagescaler.hbpl.co.uk/resize/scaleWidth/743/cached.offlinehbpl.hbpl.co.uk/news/SUC/1-20170427111658168.jpg"), ("IBM", "Herramienta mundial II", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/IBM_logo.svg/245px-IBM_logo.svg.png");