# Bodega_Backend

Backend del repositorio bodega para integrar
Antes de:
instalar Visual studio code para visualizar front end
Instalar intelijIDEA para sistema operativo propio
Instalar xampp para levantar front-end
instalar mysqlWorckbench para base de datos




1.instalar el jdk 17 de java para INTELIJ IDEA desde el programa y abrir la carpeta de Bodega_Backend



2.al tener instalado xampp para levantar el front end:
ir a la carpeta donde se instalo xampp
llevar la carpeta del front-end(repositorio llamado Bodega) a la carpeta llamada htdocs generada por defecto al instalar xampp



3.Base de datos en mySqlWorkbench:
Despues de tener instalado y configurado el servidor mySqlWorkbench con la contraseña propia, Cambiar apartado de aplication properties el pasword de mySqlWorkbench al password elegido en mySqlWorkbench



4.una vez iniciado el local host en intelij spring boot ejecutar lo siguiente en mySqlWorkbench para visualizar los datos:

Ejecutar este script en mysqlWorkbench al iniciar la api con spring boot
Scritpt para base de datos
------------------------------------------------------------------------------------------
INSERT INTO tbl_product VALUES (1,"LTD-4943","Guitarra cuerpo solido","Guitarras","100");
INSERT INTO tbl_product VALUES (2,"LTD-4944","Guitarra acustica","Guitarras","100");
INSERT INTO tbl_product VALUES (3,"LTD-4945","Guitarra electrica","Guitarras","100");
INSERT INTO tbl_product VALUES (5,"LTD-5943","Bajo cuatro cuerdas","Bajos","100");
INSERT INTO tbl_product VALUES (6,"LTD-5944","Bajo cinco cuerdas","Bajos","100");
INSERT INTO tbl_product VALUES (7,"LTD-5945","Bajo activos","Bajos","100");
INSERT INTO tbl_product VALUES (8,"LTD-5946","Bajo pasivos","Bajos","100");
INSERT INTO tbl_product VALUES (9,"LTD-6943","Piano media cola","Pianos","100");
INSERT INTO tbl_product VALUES (10,"LTD-6944","Piano cola entera","Pianos","100");
INSERT INTO tbl_product VALUES (11,"LTD-6945","Pianola","Pianos","100");
INSERT INTO tbl_product VALUES (12,"LTD-7943","Tama","Baterías Acústicas","100");
INSERT INTO tbl_product VALUES (13,"LTD-7944","Pearl","Baterías Acústicas","100");
INSERT INTO tbl_product VALUES (14,"LTD-7945","Sonor","Baterías Acústicas","100");
INSERT INTO tbl_product VALUES (15,"LTD-7946","Mapex","Baterías Acústicas","100");
INSERT INTO tbl_product VALUES (16,"LTD-7947","Roland","Baterías electronicas","100");
INSERT INTO tbl_product VALUES (17,"LTD-7948","Alesis","Baterías electronicas","100");
INSERT INTO tbl_product VALUES (18,"LTD-8943","ENGL","Amplificadores cabezales","100");
INSERT INTO tbl_product VALUES (19,"LTD-8944","Marshall","Amplificadores cabezales","100");
INSERT INTO tbl_product VALUES (20,"LTD-8945","Pavey","Amplificadores cabezales","100");
INSERT INTO tbl_product VALUES (21,"LTD-8946","EVH","Amplificadores cabezales","100");
INSERT INTO tbl_product VALUES (22,"LTD-9943","ENGL","Amplificadores cajas","100");
INSERT INTO tbl_product VALUES (23,"LTD-9944","Marshall","Amplificadores cajas","100");
INSERT INTO tbl_product VALUES (24,"LTD-9945","Pavey","Amplificadores cajas","100");
INSERT INTO tbl_product VALUES (25,"LTD-9946","EVH","Amplificadores cajas","100");
--------------------------------------------------------------------------------------

Hasta aqui se deberian poder visualizar los datos en el localhost:8080.


6.Para levantar la pagina en xampp.
iniciar el servicio de apache de xampp, ingresar al admin y saldra este link: http://localhost/dashboard/.
Debe cambiar la ruta para orientarla hacia la carpeta del repositorio bodega por ejemplo: http://localhost/Bodega/login.html#, ya que al dejar la carpeta dentro de htdocs, xampp reconocera la carpeta dentro del servidor
asi deberian quedar las rutas para levantar el front end en xampp. Si se realizaron correctamente los pasosa anteriores el front-end deberia mostrar los datos traidos desde localhost:8080 hacia el localhost levantado con xampp


