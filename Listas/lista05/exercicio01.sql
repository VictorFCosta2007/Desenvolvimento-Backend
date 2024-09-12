CREATE DATABASE db_empresa_eventos;

create table tb_eventos(
id int primary key,
nome varchar(255),
localizacao varchar(255),
preco_ingresso decimal (6,2)
);

insert into tb_eventos values(
1,
'Carnaval',
'Arujá',
2500.00
);

insert into tb_eventos values(
2,
'Natal',
'Itaquaquecetuba',
4000.50
);

select * from tb_eventos;