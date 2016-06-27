CREATE DATABASE mpa_db

CREATE TABLE documento
(
  iddocumento int(10) not null AUTO_INCREMENT,
  trabajador int(10) null,
  asunto varchar(100) null,
  fecha date null,
  proceso varchar(100) null,
  numerohojas int(10) null,
  nombrecompleto varchar(100) null,
  dni int(8) null,
  telefono int(10) null,
  correo varchar(20) null,
  PRIMARY KEY(iddocumento)
)

CREATE TABLE detalledocumento
(
  iddetalledocumento int(10) not null AUTO_INCREMENT,
  documento int(10) null,
  imagen blob null,
  PRIMARY KEY(iddetalledocumento)
)

CREATE TABLE persona
(
  idpersona int(10) not null AUTO_INCREMENT,
  nombre varchar(50) null,
  apellido varchar(50) null,
  dni int(8) null,
  telefono int(10) null,
  correo varchar(20) null,
  direccion varchar(50) null,
  PRIMARY KEY(idpersona)
)

CREATE TABLE cargo
(
  idcargo int(10) not null AUTO_INCREMENT,
  nombrecargo varchar(100) null,
  descripcioncargo varchar(100) null,
  PRIMARY KEY(idcargo)
)

CREATE TABLE area
(
  idarea int(10) not null AUTO_INCREMENT,
  nombrearea varchar(100) null,
  PRIMARY KEY(idarea)
)

CREATE TABLE trabajador
(
  idtrabajador int(10) not null AUTO_INCREMENT,
  persona int(10) null,
  area int(10) null,
  cargo int(10) null,
  PRIMARY KEY(idtrabajador)
)

CREATE TABLE procesos
(
  idproceso int(10) not null AUTO_INCREMENT,
  nombreproceso varchar(100) null,
  descripcionproceso varchar(100) null,
  PRIMARY KEY(idproceso)
)

CREATE TABLE actividad
(
  idactividad int(10) not null AUTO_INCREMENT,
  nombreactividad varchar(100) null,
  descripcionactividad varchar(100) null,
  PRIMARY KEY(idactividad)
)

CREATE TABLE procesosporarea
(
  idprocesosporarea int(10) not null AUTO_INCREMENT,
  proceso int(10) null,
  area int(10) null,
  ordenareas int(10) null,
  PRIMARY KEY(idprocesosporarea)
)

CREATE TABLE areaporactividad
(
  idareaporactividad int(10) not null AUTO_INCREMENT,
  actividad int(10) null,
  area int(10) null,
  PRIMARY KEY(idareaporactividad)
)

CREATE TABLE procesoejecucion
(
  idprocesoejecucion int(10) not null AUTO_INCREMENT,
  documento int(10) null,
  proceso int(10) null,
  area int(10) null,
  actividad int(10) null,
  responsable varchar(100) null,
  ordenresponsable varchar(100) null,
  estadoactividad varchar(50) null,
  estadoproceso varchar(50) null,
  PRIMARY KEY(idprocesoejecucion)
)
