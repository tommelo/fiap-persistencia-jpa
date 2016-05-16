create database jpa;
use jpa;


create table clientes
(
	IDCLIENTE INT(11) auto_increment,
    NOME VARCHAR(45),
    EMAIL VARCHAR(254),
    
    CONSTRAINT PK_CLIENTES PRIMARY KEY(IDCLIENTE)
);

create table pedidos
(
	IDPEDIDO INT(11) auto_increment,
    IDCLIENTE INT(11) NOT NULL,
    DATA DATETIME NOT NULL,
    DESCRICAO VARCHAR(45) NOT NULL,
    VALOR DOUBLE NOT NULL,
    
    CONSTRAINT PK_PEDIDOS primary key(IDPEDIDO),
    CONSTRAINT FK_PEDIDOS_CLIENTES FOREIGN KEY (IDCLIENTE) REFERENCES CLIENTES(IDCLIENTE)
);

select * from clientes;
select * from pedidos;




