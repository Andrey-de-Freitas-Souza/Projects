CREATE DATABASE MyBanK;

USE MyBanK ;

-- TABELAS
CREATE TABLE Users(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(60),
CPF VARCHAR(14),
CEP VARCHAR(9),
email VARCHAR(70),
telefone VARCHAR(19),
nascimento VARCHAR(10),
nacionalidade VARCHAR(20),
senha VARCHAR(20),
codConta INT,
FOREIGN KEY(codConta) REFERENCES Conta(id)
);

CREATE TABLE Conta(
id INT PRIMARY KEY,
Saldo DECIMAL(12,2) DEFAULT 0,
Limite DECIMAL(12,2) DEFAULT 300,
Investido DOUBLE DEFAULT 0,
ChavePix VARCHAR(50) DEFAULT " "
);

CREATE TABLE RegistroTrasnferencia(
id INT PRIMARY KEY AUTO_INCREMENT,
dia VARCHAR(15),
valor DOUBLE,
tipo VARCHAR(25),
descricao TEXT,
destinatario INT,
FOREIGN KEY(codConta) REFERENCES Users(codConta)
);


-- SELECTS
SELECT * FROM registroTransferencia WHERE CodConta = 1 OR destinatario = 1 ORDER BY dia;
SELECT * FROM Users WHERE codConta = 1 AND Senha = " ";
SELECT * FROM Users JOIN Conta ON Users.codConta = Conta.id;
SELECT u.id, u.nome, u.codConta, c.Saldo, c.Limite, c.Fatura, c.Investido FROM Users AS u JOIN transferencia AS c ON u.codConta = c.id WHERE u.codConta = 1;
SELECT * FROM Conta ;
SELECT * FROM Users ;
SELECT  ChavePix FROM Conta;
SELECT * FROM transferencia;
SELECT * FROM registroTransferencia;
SELECT nome FROM Users WHERE codConta = 1;
SELECT * FROM registroTransferencia WHERE CodConta = 1 OR destinatario = 1 ORDER BY dia desc,id desc;
SELECT u.nome, c.Saldo FROM Users as u INNER JOIN Conta as c ON c.id = u.codConta;
SELECT u.nome, c.Saldo FROM Users as u JOIN Conta as c ON c.id = u.codConta;
SELECT u.nome, c.Saldo FROM Users as u LEFT OUTER JOIN Conta as c ON c.id = u.codConta;
SELECT u.nome, c.Saldo FROM Users as u RIGHT OUTER JOIN Conta as c ON c.id = u.codConta;
SELECT * FROM registroTransferencia WHERE CodConta = 1 OR destinatario = 1 ORDER BY dia;
Alter table Conta add column dataInvestimento varchar(15);
-- DESCS
desc Users;
desc conta;
desc registrotransferencia;
