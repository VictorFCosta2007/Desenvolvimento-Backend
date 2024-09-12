create database db_floricultura;

use db_floricultura;

create table tb_flores (
id int primary key,
especie varchar(255),
preco decimal (5,2)
);

insert into tb_florestb_flores values(
1,
'Rosa',
65.70);

insert into tb_flores values(
2,
'Margarida',
45.90
);

select * from tb_flores;
