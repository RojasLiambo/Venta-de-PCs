drop database if exists ventapcs;
create database ventapcs;
Use ventapcs;

create table cliente(
	nombre varchar(50),
	dni integer,
	mail varchar(50),
	telefono int,
	primary key (dni)
);

create table empleado(
	nombre varchar(50),
	legajoemple integer,
	turno time,
	primary key(legajoemple)
);

create table categoria(
	idcategoria integer,
	nombrecategoria varchar(50)
	primary key(idcategoria)
);


create table factura(
	nFactura integer,
	fecha time,
	dni int,
	legajoemple int,
	primary key(nFactura),
	foreign key (dni) references cliente (dni),
	foreign key (legajoemple) references empleado (legajoemple)
);
create table linea(
	nLinea integer,
	cant integer,
	nFactura integer,
	codigodecompoente integer,
	primary key (nLinea),
	foreign key (nFactura) references factura (nFactura),
	foreign key (codigodecompoente) references componentes(codigodecompoente)
);

create table computadora(
	numerodeserie integer,
	nLinea integer,
	modelo varchar(50),
	descripcion varchar(250),
	precio double,
	primary key (numerodeserie),
	foreign key (nLinea) references linea (nLinea)
);

create table componentes(
	codigodecompoente integer,
	idcategoria integer,
	modelo varchar(100),
	fabricante varchar(50),
	descripcion varchar(1000),
	precio double,
	primary key (codigodecompoente),
	foreign key (idcategoria) references categoria (idcategoria)
);

create table compc(
	numerodeserie integer,
	codigocomponente integer,
	foreign key (numerodeserie) references computadora (numerodeserie),
	foreign key (codigocomponentes) references componentes (codigocomponentes)
);




insert into categoria values(1, "Procesador");
insert into categoria values(2,"MemoriaRam");
insert into categoria values(3,"TarjetaGrafica");
insert into categoria values(4,"Fuente");
insert into categoria values(5,"Teclado");
insert into categoria values(6,"Mouse");
insert into categoria values(7,"Monitor");
insert into categoria values(8,"Auriculares");
insert into categoria values(9,"TabletaGrafica");
insert into categoria values(10,"WebCam");
insert into categoria values(11,"Mother");

insert into computadora(numerodeserie, modelo, descripcion) values(1,"HP","Computadora para Trabajo");
insert into computadora(numerodeserie, modelo, descripcion) values(2,"HP","Computadora Gamer");
insert into computadora(numerodeserie, modelo, descripcion) values(3,"HP","Computadora para Trabajo");
insert into computadora(numerodeserie, modelo, descripcion) values(4,"HP","Computadora Gamer");
insert into computadora(numerodeserie, modelo, descripcion) values(5,"HP","Computadora para Trabajo");
insert into computadora(numerodeserie, modelo, descripcion) values(6,"HP","Computadora Gamer");
insert into computadora(numerodeserie, modelo, descripcion) values(7,"HP","Computadora para Trabajo");
insert into computadora(numerodeserie, modelo, descripcion) values(8,"HP","Computadora Gamer");
insert into computadora(numerodeserie, modelo, descripcion) values(9,"HP","Computadora RESTRINGIDA A USO MILITAR");
insert into computadora(numerodeserie, modelo, descripcion) values(10,"HP","Computadora perfil bajo");

insert into componentes values(0001, 1, "I Series", "Intel co.", "Es un procesador Intel Core I9 de decima generacion con una velocidad de 3,65 Ghz de 10 nucleos", 100000.00 );
insert into componentes values(0002, 1, "Ryzen Series", "AMD Inc.", "Es un procesador Ryzen 9 5900X 4.8 Ghz de 12 nucleos", 100000.00 );
insert into componentes values(0003, 1, "A Series", "AMD Inc.", "Es un procesador A10 7800 con una velocidad de 3,50 Ghz", 3000.00);
insert into componentes values(0004, 1, "Athlon Series", "AMD Inc.","Es un procesador Athlon li x4 640 de 4 nucleos con una velocidad de 3,00 Ghz", 6000.00);
insert into componentes values(0005, 1, "Pentium Series", "Intel co.","Es un procesador Intel Pentium G2030 de 2 nucleos con una velocidad de 3,00 Ghz de frecuencia", 9000.00);
insert into componentes values(0006, 1, "I Series", "Intel co.", "Es un procesador Intel Core I5 de cuarta generacion con una velocidad de 3,65 Ghz de 4 nucleos", 18000.00);
insert into componentes values(0007, 1, "I series", "Intel Co.", "Es un procesador Intel Core I3 de decima generacion con una velocidad de 4,30 Ghz de 4 nucleos", 18500.00);
insert into componentes values(0008, 1, "Ryzen Series", "AMD Inc.", "Es un procesador Ryzen 5 3600 de 6 nucleos con una velocidad de 4,20 Ghz", 39799.00);
insert into componentes values(0009, 1, "i Series", "Dead Inside Sociedad Anonima", "Es un procesador Dead Inside core i420 de 244 nucleos con una velocidad de 550 km/h", 283.00);
insert into componentes values(0010, 1, "Sempron Series", "AMD Inc.", "Es un procesador Sempron 3200 Am2 con una velocidad de 2100 Mhz y tiene 1 solo nucleo", 200.00);
insert into componentes values(0011, 2, "CMW32GX4M2A2666C16", "Corsair", "Es una memoria ram de Corsair DDR4 con 16 gb de capacidad individual", 32000.00);
insert into componentes values(0012, 2, "KVR1333D3N9/4G","Kingston", "Es una memoria ram de Kingston DDR3 con 4 gb de capacidad individual" 5000.00);
insert into componentes values(0013, 2, "AD4S2666716G19-SGN","Adata","Es una memora ram de Adata DDR4 con 16 gb de capacidad individual", 15900.00);
insert into componentes values(0014, 2, "KF432C16BB/8","Kingston","Es una memoria ram de Kingston DDR4 con 8 gb de capacidad individual", 13270.00);
insert into componentes values(0015, 2, "KVR32S22S8/16","Kingston","Es una memoria ram de Kingston DDDR4 con 16 gb de capacidad individual",  22.299.00);
insert into componentes values(0016, 2, "MVD34096MSD-A6","Markvision","Es una memoria ram de Markvision DDR3 con 4 gb de capacidad individual", 5.498.00);
insert into componentes values(0017, 2, "MD8GD4320016XRGB","PNY","Es una memoria ram de PNY DDR4 con 8 gb de capacidad individual", 12799.00);
insert into componentes values(0018, 2, " CMSO8GX4M1A2133C15","Corsair","Es una memoria ram  de Corsair DDR4 con con 8 gb de capacidad individual", 12459.00 );
insert into componentes values(0019, 2, "CMSA4GX3M1A1066C7","Doxair","Es una memoria ram de Doxair DDR6 con 750 gb de capacidad individual", 1.00);
insert into componentes values(0020, 2, "AD4S2666716G19-SGN","Adata","Es una memoria ram de Adata DDR3 con 16 gb de capacidad individual", 10995.00);
insert into componentes values(0021, 3, "Geforce GTX 10 Series","Nvidia Co.","Es una tarjeta grafica GTX 1050 Ti con 4 gb de memoria con conectividad DL-DVI-D, HDMI 2.0b, DisplayPort 1.4", 94248.00);
insert into componentes values(0022, 3, "Geforce RTX 20 Series","Nvidia Co.","Es una tarjeta grafica RTX 2060 con 6 gb de memoria con conectividad DL-DVI-D, 2 HDMI 2.0b, DisplayPort 1.4", 144999.00);
insert into componentes values(0023, 3, "Geforce RTX 30 Series","Nvidia Co.","Es una tarjeta  grafica RTX 3070 con 8 gb de memoria con conectividad DisplayPort, HDMI", 245569,68);
insert into componentes values(0024, 3, "Radeon HD 7000 Series","AMD Inc.","Es una tarjeta grafica Radeon Hd745 con 1 gb de memoria con conectividad  DisplayPort,DL-DVI-I",8989.00);
insert into componentes values(0025, 3, "Geforce GT 700 Series","Nvidia Co.","Es una  tarjeta grafica GT 710 con 1 gb de memoria con conectividad VGA, DL-DVI-D, HDMI",18639.00);
insert into componentes values(0026, 3, "GeForce RTX 30 Series","Nvidia Co.","Es una tarjeta  grafica RTX 3090 con 24 gb de memoria con conectividad 3 DisplayPort 1.4a, HDMI 2.1",537990.00);
insert into componentes values(0027, 3, "Radeon RX 6000 Series","AMD Inc.","Es una tarjeta  grafica Radeon 6900 con 16 gb de memoria con conectividad HDMI 2.1, 3 DisplayPort 1.4",1299999.00);
insert into componentes values(0028, 3, "GeForce GTX 16 Series","Nvidia Co.","Es una tarjeta grafica GTX 1660 con 6 gb de memoria con conectividad HDMI 2.1, 3 DisplayPort 1.4",299999.00);
insert into componentes values(0029, 3, "GeForce MTX 40 Series","Nvidia Co.","Es una tarjeta grafica MTX 4050 con 244 gb de memoria con conectividad HDMI 2.1, 3 DisplayPort 1.4, VGA, NASA MONITOR", 3.00 );
insert into componentes values(0030, 3, "GeForce GT 10 Series","Nvidia Co.","Es una tarjeta grafica GT 1030 con 2 gb de memoria con conectividad HDMI 2.1, 3 DisplayPort 1.4, VGA", 35000.00);
insert into componentes values(0031, 4, "1000 G2","Evga","Es una Fuente de 1000w reales con 4 satas", 106059.00);
insert into componentes values(0032, 4, "250 G2","Evga","Es una Fuente de 250w reales con 4 satas", 2569.00);
insert into componentes values(0033, 4, "750 G2","Evga","Es una Fuente de 750w inestables con 2 satas", 3420.00);
insert into componentes values(0034, 4, "750 G2","Evga","Es una Fuente de 750w reales con 4 satas", 6567.00);
insert into componentes values(0035, 4, "2000 G2","Evga","Es una Fuente de 2000w reales con 4 satas", 212118.00);
insert into componentes values(0036, 4, "1000 G2","Evga","Es una Fuente de 150w reales con 4 satas", 1000.00);
insert into componentes values(0037, 4, "5000 G2","Evga","Es una Fuente de 5000w reales con 4 satas", 678932.00);
insert into componentes values(0038, 4, "4444 44","SUBLIME 4","Es una Fuente de 4w reales con 4 sata", 4.00);
insert into componentes values(0039, 4, "1500000 G12","Evga","Es una Fuente de 1545323w reales con 560 satas", 0.32);
insert into componentes values(0040, 4, "800 G2","Evga","Es una Fuente de 800w reales con 4 satas", 23450.00);
insert into componentes values(0041, 5, "K550","Redragon","Teclado Mecanico K550 Redragon RGB GAMER", 15999.00);
insert into componentes values(0042, 5, "MK235","Logitech","Es un teclado membrana MK235 Logitech", 5165.00);
insert into componentes values(0043, 5, "Magic","Apple","Es  un teclado gracioso de color blanco no es gamer pero es de membrana y se la re banca", 18000.00);
insert into componentes values(0044, 5, "K580RGB-PRO","Redragon","Es un teclado mas o menos mecanico GAMER K580RGB-PRO de Redragon",13999.99);
insert into componentes values(0045, 5, "K552","Redragon","Es un teclado mecanico GAMER K552 Redragon", 11050.00);
insert into componentes values(0046, 5, "Origins 60","HyperX","Es un teclado GAMER Origins 60 de HyperX",15099.00);
insert into componentes values(0047, 5, "Xk700","Soul","Es un teclado GAMER SEMI mecanico XK700 de la marca Soul",1969.00);
insert into componentes values(0048, 5, "Prodigy G213","Logitech","Teclado GAMER SEMI mecanico G213 de Logitech", 9499.00);
insert into componentes values(0049, 5, "BlackWidow v3","RAZER","Teclado Gamer Mecanico BlackWidow de RAZER", 0.69);
insert into componentes values(0050, 5, "LuxeMate100","Genius","Es un teclado comun Genius LuxeMate100",1678.00);
insert into componentes values(0051, 6, "G Series","Logitech","Es un mouse g203 de logitech con 8000 DPI", 4399.00);
insert into componentes values(0052, 6, "G Series","Logitech","Es un mouse g503 de logitech con 16000 DPI",);
insert into componentes values(0053, 6, "M280","Logitech","Es un mouse M280 de logitech con 1000 dpi", 9000.00);
insert into componentes values(0054, 6, "Viper","Razer","Es un mouse Viper de Razer con 8500 dpi", 8999.00);
insert into componentes values(0055, 6, "M350","Logitech","Es un mouse M350 Logitech con 1000 dpi", 5434.00);
insert into componentes values(0056, 6, "G Series","Logitech","Es un mouse G305 Logitech con 12000 dpi", 8000.00);
insert into componentes values(0057, 6, "M988","Redragon","Es un mouse M988 Redragon con 16000 dpi", 6150.00);
insert into componentes values(0058, 6, "KEM 248","Kolke","Es un mouse vertical KEM 248 Kolke con 1000 dpi", 3466.00);
insert into componentes values(0059, 6, "GRX Series","LOGITECHxNVIDIA","ES UN MOUSE GAMER MECANICO CON GRAFICA INTEGRADA TAMBIEN TIRA RASHOS LAZER POR SU OPTICA TIENE 255000 DE DPI Y ESTA RE LOKO", 0.01);
insert into componentes values(0060, 6, "M04","Exxtra Tech","Es un mouse de oficina M04 Exxtra Tech",200.00);
insert into componentes values(0061, 7, "F22TX1","Samsung","Es un monitor Samsung F22TX1 de 16´",54679.00);
insert into componentes values(0062, 7, "F22TX2","Samsung","Es un monitor Samsung F22TX2 de 18´",56589.00);
insert into componentes values(0063, 7, "F22TX3","Samsung","Es un monitor Samsung F22TX3 de 20´",53649.00);
insert into componentes values(0064, 7, "F22TX4","Samsung","Es un monitor Samsung F22TX4 de 22´",52639.00);
insert into componentes values(0065, 7, "F22TX5","Samsung","Es un monitor Samsung F22TX5 de 24´",59999.00);
insert into componentes values(0066, 7, "20MKRSXR1","LG","Es un monitor LG 20MKRSXR1 de 16´",55679.00);
insert into componentes values(0067, 7, "20MKRSXR2","LG","Es un monitor LG 20MKRSXR2 de 18´",53679.00);
insert into componentes values(0068, 7, "20MKRSXR3","LG","Es un monitor LG 20MKRSXR3 de 20´",54671.00);
insert into componentes values(0069, 7, "NASA MONITOR","NASA","Es un monitor NASA NASA MONITOR de 548´",5.00);
insert into componentes values(0070, 7, "20MKRSXR5","LG","Es un monitor LG 20MKRSXR5 de 24´",51379.00);
insert into componentes values(0071, 8, "G Series","Logitech","Son unos auriculares G733 Gamer Logitech y son virrgo", 32799.00);
insert into componentes values(0072, 8, "Cloud","HyperX","Son unos auriculares gamer HyperX Cloud Flight",24899.00);
insert into componentes values(0073, 8, "G9000","Kotion","Son unos auriculares KOTION G9000",3082.00);
insert into componentes values(0074, 8, "Lamia 2","Redragon","Son unos auriculares Lamia 2 de Redragon",10000.00);
insert into componentes values(0075, 8, "JBR","Harman","Son unos auriculares JBR HARMAN", 6969.69);
insert into componentes values(0076, 8, "Flight","RedragonHyperX","Son unos auriculares gamer HyperX Redragon Flight",10223.00);
insert into componentes values(0077, 8, "69 Series","xes","Son unos auriculares Xes 69 Series", 234.00);
insert into componentes values(0078, 8, "Galletita Series","Oreo","Son unos auriculares Oreo Galletita 234X", 5678.00);
insert into componentes values(0079, 8, "JP","Soul","Son unos auriculares JP1954z SON BUENARDOS CoMPrAlOs MARADONA LOS APRUEBA",0.39);
insert into componentes values(0080, 8, "Only","Only","Auriculares Only, son only injunables completamente",200.00);
insert into componentes values(0081, 9, "Small","Wacom","Tableta grafica sin pantalla con lapiz",10990.00);
insert into componentes values(0082, 9, "01","XP-PEN","Tableta grafica sin pantalla con lapiz", 16990.00);
insert into componentes values(0083, 9, "Star","XP-PEN","Tableta grafica sin pantalla con lapiz",20000.00);
insert into componentes values(0084, 9, "Deco","XP-PEN","Tableta grafica con pantalla sin lapiz",15000.00);
insert into componentes values(0085, 9, "Rainbow","Wacom","Tableta grafica con pantalla con lapiz",15230.00);
insert into componentes values(0086, 9, "Light","Wacom","Tableta grafica sin pantalla sin lapiz",14567.00);
insert into componentes values(0087, 9, "Sharpy","Fancy","Tableta grafica con pantalla con lapiz",50555.00);
insert into componentes values(0088, 9, "Calm","Wacon","Tableta grafica sin pantalla con lapiz",20.00);
insert into componentes values(0089, 9, "EPICATABLETAGRAFICA","TABLETITAEPICAMARCA","Tableta grafica con pantalla con lapiz, dibuja solo",0.01);
insert into componentes values(0090, 9, "Star","Wacom","Tableta grafica sin pantalla con lapiz",16789.00);
insert into componentes values(0091, 10, "C925e","Logitech","Camara full HD logitech resolucion 1920x1080 30FPS", 15000.00);
insert into componentes values(0092, 10, "C920s","Logitech","Camara full HD logitech resolucion 1920x1080 30FPS",17000.00);
insert into componentes values(0093, 10, "C270","Logitech","Camara HD logitech resolucion 1280x720 30FPS",6500.00);
insert into componentes values(0094, 10, "Hitman","Redragon","Camara full HD redragon Hitman 1920x1080 30FPS", 8500.00);
insert into componentes values(0095, 10, "RF-WEB03","Ruffo","Camara full HD ruffo RF-WEB03 1920x1080 30FPS",1950.00);
insert into componentes values(0096, 10, "NGW-120","Noga","Camara 4K Noga NGW-120 2048x1546 30FPS tiene foco",7000.00);
insert into componentes values(0097, 10, "Imilab","Xiaomi","Camara Full HD Imilab Xiaomi 1920x1080 30FPS", 6400.00);
insert into componentes values(0098, 10, "C505e","Logitech","Camara C50Se de Logitech Full HD 1920x1080 15FPS",1300.00);
insert into componentes values(0099, 10, "PR0","Redtech","Camara full 16K 11520x7680 se te ven las moleculas de celula de tu cara",2.00);
insert into componentes values(0100, 10, "Intrepid","Zoom","Camara HD Zoom 1280x720 intrepid",999.00);
insert into componentes values(0101, 11, "PRIME B460M-A","Asus","Mother asus PRIME B460M-A cantidad maxima para sockets ram 128 gb",18650.00);
insert into componentes values(0102, 11, "B450M-Plus","MSI","Mother MSI B450M-PLUS Cantidad maxima para sockets ram 32gb",);
insert into componentes values(0103, 11, "B250m","Msi","Mother MSI  B250m Cantidad maxima para sockets ram 32gb",30500.00);
insert into componentes values(0104, 11, "GA-H110N","Gigabyte","Mother Gigabyte GA-H110N Cantidad maxima para sockets ram 32gb",27378.00);
insert into componentes values(0105, 11, "H670-PRO WIFI","ASUS","Mother ASUS H670-PRO WIFI Cantidad maxima para sockets RAM 128 GB",66780.00);
insert into componentes values(0106, 11, "ROG STRIX Z690-G","ASUS","Mother ROG STRIX Z690-G GAMING WIFI ASUS Cantidad maxima para sockets RAM 128",114390.00);
insert into componentes values(0107, 11, "Z690-p","Intel","Mother Z690-p INTEL Cantidad maxima para sockets RAM 128 GB",76890.00);
insert into componentes values(0108, 11, "B550-plus","ASUS","Mother ASUS B550-plus Cantidad maxima para sockets RAM 128 Gb",44580.00);
insert into componentes values(0109, 11, "8250M","MSI","UNA MOTHER 8250 M TERRIBLE MOTHER APROBADA POR SanTiAgo doRRegO de TNTECNO",0.27);
insert into componentes values(0110, 11, "Gb-ask","Gigabyte","Mother gb-ask Gygabyte capacidad sockets ram 16 gb",500.00);

insert into compc values(1,0001);
insert into compc values(1,0011);
insert into compc values(1,0021);
insert into compc values(1,0031);
insert into compc values(1,0041);
insert into compc values(1,0051);
insert into compc values(1,0061);
insert into compc values(1,0071);
insert into compc values(1,0081);
insert into compc values(1,0091);
insert into compc values(1,0101);
insert into compc values(2,0002);
insert into compc values(2,0012);
insert into compc values(2,0022);
insert into compc values(2,0032);
insert into compc values(2,0042);
insert into compc values(2,0052);
insert into compc values(2,0062);
insert into compc values(2,0072);
insert into compc values(2,0082);
insert into compc values(2,0092);
insert into compc values(2,0102);
insert into compc values(3,0003);
insert into compc values(3,0013);
insert into compc values(3,0023);
insert into compc values(3,0033);
insert into compc values(3,0043);
insert into compc values(3,0053);
insert into compc values(3,0063);
insert into compc values(3,0073);
insert into compc values(3,0083);
insert into compc values(3,0093);
insert into compc values(3,0103);
insert into compc values(4,0004);
insert into compc values(4,0014);
insert into compc values(4,0024);
insert into compc values(4,0034);
insert into compc values(4,0044);
insert into compc values(4,0054);
insert into compc values(4,0064);
insert into compc values(4,0074);
insert into compc values(4,0084);
insert into compc values(4,0094);
insert into compc values(4,0104);
insert into compc values(5,0005);
insert into compc values(5,0015);
insert into compc values(5,0025);
insert into compc values(5,0035);
insert into compc values(5,0045);
insert into compc values(5,0055);
insert into compc values(5,0065);
insert into compc values(5,0075);
insert into compc values(5,0085);
insert into compc values(5,0095);
insert into compc values(5,0105);
insert into compc values(6,0006);
insert into compc values(6,0016);
insert into compc values(6,0026);
insert into compc values(6,0036);
insert into compc values(6,0046);
insert into compc values(6,0056);
insert into compc values(6,0066);
insert into compc values(6,0076);
insert into compc values(6,0086);
insert into compc values(6,0096);
insert into compc values(6,0106);
insert into compc values(7,0007);
insert into compc values(7,0017);
insert into compc values(7,0027);
insert into compc values(7,0037);
insert into compc values(7,0047);
insert into compc values(7,0057);
insert into compc values(7,0067);
insert into compc values(7,0077);
insert into compc values(7,0087);
insert into compc values(7,0097);
insert into compc values(7,0107);
insert into compc values(8,0008);
insert into compc values(8,0018);
insert into compc values(8,0028);
insert into compc values(8,0038);
insert into compc values(8,0048);
insert into compc values(8,0058);
insert into compc values(8,0068);
insert into compc values(8,0078);
insert into compc values(8,0088);
insert into compc values(8,0098);
insert into compc values(8,0108);
insert into compc values(9,0009);
insert into compc values(9,0019);
insert into compc values(9,0029);
insert into compc values(9,0039);
insert into compc values(9,0049);
insert into compc values(9,0059);
insert into compc values(9,0069);
insert into compc values(9,0079);
insert into compc values(9,0089);
insert into compc values(9,0099);
insert into compc values(9,0109);
insert into compc values(10,0010);
insert into compc values(10,0020);
insert into compc values(10,0030);
insert into compc values(10,0040);
insert into compc values(10,0050);
insert into compc values(10,0060);
insert into compc values(10,0070);
insert into compc values(10,0080);
insert into compc values(10,0090);
insert into compc values(10,0110);








