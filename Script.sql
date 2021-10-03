use banco;

drop table tb_conta;
drop table tb_cliente;

create table tb_cliente (
	codigo int not null auto_increment primary key,
	nome varchar(50) not null,
	telefone varchar(15) not null,
	email varchar(50) unique not null,
	cpf varchar(11) unique not null,
	data_nascimento date unique not null
);

create table tb_conta (
	numero int not null,
	agencia int not null,
	digito int not null,
	data_abertura date not null,
	tipo int not null,
	saldo double not null,
	codigo_cliente int not null,
	primary key (numero),
	constraint fk foreign key (codigo_cliente) references tb_cliente (codigo)
);

insert into tb_cliente (nome, telefone, email, cpf, data_nascimento) values
	('Orival', '31992840931', 'orival@gmail.com', '20291023192', '1935-02-25'),
	('Joscriuderson', '11984421583', 'joscriuderson@gmail.com', '33409286933', '1980-04-12'),
	('Covalsque', '21943222398', 'covalsque.silva@gmail.com', '09598322186', '1990-03-05')
;

insert into tb_conta values
	(1, 1, 1, '2020-05-19', 0, 193.25, 1),
	(2, 1, 2, '2021-03-03', 1, 4000, 2)
;