create database VENTA_AUTOS CHARACTER set utf8 COLLATE utf8_spanish_ci;

USE VENTA_AUTOS;

create table autos
(
	placa char(7) primary key check(placa like('[A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9]')),
    CONSTRAINT noHayProvincias check(placa not like('F%') 
AND placa not like('Q%') AND placa not like('S%') AND placa not like('W%') AND placa not like('Y%')),

	marca VARCHAR(20),
	tipo VARCHAR(20),
	añoFabricacion INT,
	precioPedido INT,
	mensaje VARCHAR(50)
)

create table comprador
(
	ci char (10) primary key,
    nombreComprador varchar (20),
    apellidoComprador varchar(20),
	telefComprador char(10)
)


create table venta(
	codigoVenta int primary key,
	fechaventa date,
	precioVenta int,
	placa char(7) references autos(placa),
	ci char (10) references comprador(ci)
)



insert into AUTOS values('PRE0987','KIA','CAMIONETA',2000,5000, 'Perfectas condiciones')
insert into AUTOS values('IBA0945','FORD','AUTO',1990,10000,'Devuleto')
insert into AUTOS values('GRE0987','KIA','CAMIONETA',2005,15000, 'Fallo de fabricacion')


insert into comprador values('1700345678','Paul','Guamani','0998462578')
insert into comprador values('1700345688','Demian','Marley','1234567894')
insert into COMPRADOR values('1000345001','ANA','PAREDES','0997698765')


insert into VENTA values(1,'03-05-21',5000,'PRE0987','1700345678')
insert into VENTA values(2,'02-05-21',8000,'IBA0945','1700345688')
insert into VENTA values(3,'01-01-30',8000,'GRE0987','1000345001')

select * from venta 
select * from comprador
select * from autos

 --Datos del auto que se vendió a menor precio.
 
select a.placa, marca, tipo, añoFabricacion, precioPedido, precioVenta 
from AUTOS a inner join VENTA v on a.placa=v.placa  
where  precioVenta=(select MIN(precioVenta) from VENTA)
