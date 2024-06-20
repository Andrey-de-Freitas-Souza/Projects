create database VendasSolon;

use VendasSolon;

create table Produtos(
Id INT PRIMARY KEY auto_increment,
Nome_Produto varchar(100),
Valor_Compra double,
Valor_Venda double,
Estoque int,
Qtd_Comprada int
);

create table Clientes(
cod int primary key auto_increment,
Nome varchar(100)
);

create table Vendas(
id_Venda int primary key auto_increment,
id_Comprador int,
id_Produto int,
qtd_Produto int,
foreign key (id_Comprador) references Clientes(cod),
foreign key (id_Produto) references Produtos(id),
forma_pagamento varchar(100),
data_pagamento DATE,
Falta_pagar double
);
ALTER TABLE Produtos ADD COLUMN COMPRADOS INT;
ALTER TABLE Produtos rename COLUMN Nome to Nome_Produto;
drop table Produtos, Vendas, Clientes;

select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod;

select * from Produtos;

select * from vendas;

select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod

