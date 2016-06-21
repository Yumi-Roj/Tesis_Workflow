-- Table: "USUARIO"

-- DROP TABLE "USUARIO";
CREATE DATABASE "dbWorkflow"

CREATE TABLE Cargo
(
  id_cargo serial NOT NULL,
  nombre_cargo character(50) NULL,
  CONSTRAINT pk_cargo PRIMARY KEY (id_cargo)
)

CREATE TABLE Persona
(
  id_persona serial NOT NULL,
  nombre character(50) NULL,
  apellidos character(50) NULL,
  dni integer NULL,
  direccion character(50) NULL,
  telefono integer NULL,
  CONSTRAINT pk_persona PRIMARY KEY (id_persona)
)

CREATE TABLE Usuario
(
  id_usuario serial NOT NULL,
  nombre_usuario character(50) NULL,
  clave_usuario character(50) NULL,
  nombre_completo character(50) NULL,
  cargo character(50) NULL,
  CONSTRAINT pk_usuario PRIMARY KEY (id_usuario)
)

CREATE TABLE Estado
(
  id_estado serial NOT NULL,
  descripcion_estado character(50) NULL,
  CONSTRAINT pk_estado PRIMARY KEY (id_estado)
)

CREATE TABLE Area
(
  id_area serial NOT NULL,
  nombre_area character(50) NULL,
  CONSTRAINT pk_area PRIMARY KEY (id_area)
)

CREATE TABLE Procesos
(
  id_procesos serial NOT NULL,
  id_actividad integer NULL,
  nombre_procesos character(100) NULL,
  tipo character(50) NULL,
  estado character(50) NULL,
  CONSTRAINT pk_procesos PRIMARY KEY (id_procesos)
)

CREATE TABLE Restricciones_por_Actividad
(
  id_restriccion serial NOT NULL,
  codigo_restriccion character(50) NULL,
  descripcion character(100) NULL,
  CONSTRAINT pk_restriccion PRIMARY KEY (id_restriccion)
)

CREATE TABLE Encargado_Actividad
(
  id_encargadoActividad integer NOT NULL,
  nombre character(50) NULL,
  nombre_area character(50) NULL,
  cargo character(100) NULL,
  CONSTRAINT pk_encargadoActividad PRIMARY KEY (id_encargadoActividad)
)

CREATE TABLE Actividad_por_Proceso
(
  id_actividad serial NOT NULL,
  id_encargadoActividad integer NULL,
  id_restriccion integer NULL,
  descripcion character(100) NULL,
  area_responsable character(100) NULL,
  tiempo character(50) NULL,
  posicion character(50) NULL,
  responsable character(100),
  CONSTRAINT pk_actividad PRIMARY KEY (id_actividad)
)

CREATE TABLE Documento
(
  id_documento serial NOT NULL,
  id_usuario integer NULL,
  id_persona integer NULL,
  id_estado integer NULL,
  id_procesos integer NULL,
  numero_expediente integer NULL,
  asunto character(100) NULL,
  fecha date NULL,
  destino character(100) NULL,
  remitente character(100) NULL,
  CONSTRAINT pk_documento PRIMARY KEY (id_documento)
)

CREATE TABLE Restricciones
(
  id_restriccion serial NOT NULL,
  codigo_restriccion integer NOT NULL,
  descripcion character(100) NOT NULL,
  CONSTRAINT pk_restricciones PRIMARY KEY (id_restriccion)
)

CREATE TABLE Actividad
(
  id_actividad serial NOT NULL,
  id_documento integer NULL,
  id_restriccion integer NULL,
  estado_actividad character(100) NULL,
  fecha_inicio date NULL,
  fecha_fin date NULL,
  CONSTRAINT pk_actividades PRIMARY KEY (id_actividad)
  )

ALTER TABLE usuario
ADD CONSTRAINT fk_usuario_cargo
FOREIGN KEY (id_cargo) REFERENCES cargo(id_cargo);

ALTER TABLE actividad_por_proceso
ADD CONSTRAINT fk_ActividadProceso_RestriccionActividad
FOREIGN KEY (id_restriccion) REFERENCES restricciones_por_actividad(id_restriccion);

ALTER TABLE actividad_por_proceso
ADD CONSTRAINT fk_ActividadProceso_EncargadoActividad
FOREIGN KEY (id_encargadoactividad) REFERENCES encargado_actividad(id_encargadoactividad);

ALTER TABLE procesos
ADD CONSTRAINT fk_Proceso_ActividadProceso
FOREIGN KEY (id_actividad) REFERENCES actividad_por_proceso(id_actividad);

ALTER TABLE documento
ADD CONSTRAINT fk_Documento_Usuario
FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario);

ALTER TABLE documento
ADD CONSTRAINT fk_Documento_Persona
FOREIGN KEY (id_persona) REFERENCES persona(id_persona);

ALTER TABLE documento
ADD CONSTRAINT fk_Documento_Estado
FOREIGN KEY (id_estado) REFERENCES estado(id_estado);

ALTER TABLE documento
ADD CONSTRAINT fk_Documento_Procesos
FOREIGN KEY (id_procesos) REFERENCES procesos(id_procesos);




INSERT INTO Cargo(nombre_cargo)
    VALUES ('Encargado Mesa Partes'),
    ('Modelador'),
    ('Gerente');

  INSERT INTO Usuario(nombre_usuario, clave_usuario, nombre_completo)
    VALUES ('admin', 'admin', 'Mariano Torres'),
  ('vgonzalo', 'gonzalo', 'Gonzalo Valderrama'),
  ('cmaria', 'maria',  'Maria Chavez');


INSERT INTO Persona(nombre, apellidos, dni, direccion, telefono)
    VALUES ('Jose', 'Perez Martinez', '45698712', 'Av. jesus 12', 255511),
    ('MArcos', 'Sanchez Bengoa', '42698212', 'Av. Jiron 2', 256987);
INSERT INTO estado(descripcion_estado)
    VALUES ('Registrado'),
    ('En Tramite'),
    ('Recibido'),
    ('Aprobado'),
    ('Notificar'),
    ('Archivado'),
    ('Anulado');

INSERT INTO area(nombre_area)
    VALUES ('Oficina Secretaria General', 'Jefe de Registro Civil'),
    ('Gerencia de Administracion Tributaria', 'Gerente de Administracion Tributaria'),
    ('SubGerencia Logistica'),
    ('SubGerencia Tesoreria'),
    ('SubGerencia Contabilidad'),
    ('SubGerencia Informatica y Estadistica'),
    ('SubGerencia Estudios y Proyectos'),
    ('SubGerencia Recursos Humanos'),
    ('SubGerencia Gestion Riesgos de Desastres'),
    ('Gerencia Asesoria Juridica'),
    ('Gerencia Planificacion y Presupuesto'),
    ('Gerencia Desarrollo Urbano'),
    ('Gerencia Servicio Ciudadano'),
    ('Gerencia Desarrollo Social'),
    ('Gerencia Transporte Urbano'),
    ('Gerencia Administracion Tributaria'),
    ('SubGerencia Fiscalizacion Administracion'),
    ('Gerencia Seguridad Ciudadana'),
    ('Gerencia Centro Historico');

CREATE TABLE Actividad
(
  id_actividad serial NOT NULL,
  id_documento integer NULL,
  id_restriccion integer NULL,
  estado_actividad character(100) NULL,
  fecha_inicio date NULL,
  fecha_fin date NULL,
  CONSTRAINT pk_actividades PRIMARY KEY (id_actividad)
  )
INSERT INTO actividad(nombre_area)
    VALUES ('Recibo de pago de derechos al administrado', '2016-06-09','2016-06-09'),

Recibe solicitud y documentos
Entrega de formulario al administrado
Registra boletaje, sella
Recibe expediente
Se califica expediente
Se emite informe tecnico y Resolucion
Envia copia de Resolucion a fiscalizacion para la respectiva inspeccion
Termino del Proceso


INSERT INTO area(
            id_area, nombre_area, encargado)
    VALUES (1, 'Gerencia de Administracion Tributaria', 'Gerente de Administracion Tributaria');
    (2, 'Gerencia de Informatica', 'susan flores');
    (3, 'contabilidad', 'susan flores');

INSERT INTO Restricciones_por_Actividad(id_restriccion, codigo_restriccion, descripcion)
    VALUES (1, 01, 'dodo');

INSERT INTO Encargado_Actividad(id_encargadoactividad, nombre, nombre_area, cargo)
    VALUES (1, 'alan', 'dd', 'area');

INSERT INTO Actividad_por_Proceso(id_actividad, id_encargadoactividad, descripcion, area_responsable, tiempo, posicion)
    VALUES (1, 1, 'kjhgfd', 'asa','1 dia', 1);

INSERT INTO Procesos(id_procesos, id_actividad, id_restriccion, nombre_procesos, responsable)
    VALUES (1, 1, 1, 'hhh', 'ggg');

 INSERT INTO Documento(id_usuario, id_persona, id_estado,numero_expediente, asunto, fecha, destino, remitente)
    VALUES (1, 1, 1,01, 'tramite', '05/05/2016', 'mm', 'kkk');



