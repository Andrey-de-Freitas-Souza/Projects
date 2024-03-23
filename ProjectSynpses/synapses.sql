CREATE DATABASE db_pessoas;
USE db_pessoas;
CREATE TABLE tb_usuario (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100),
senha VARCHAR(40),
email VARCHAR(60),
telefone VARCHAR(40),
curso1 VARCHAR(40) DEFAULT " ",
curso2 VARCHAR(40)DEFAULT " ",
curso3 VARCHAR(40)DEFAULT " ",
curso4 VARCHAR(40)DEFAULT " "
);
CREATE TABLE tb_administrador (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100),
senha VARCHAR(40),
email VARCHAR(60)
);
CREATE TABLE tb_cursos (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100),
categoria VARCHAR(40),
qtdAulas INT,
descricao TEXT
);
INSERT INTO tb_administrador(nome, email ,senha) VALUES ("adm","adm@email.com","senha");
INSERT INTO tb_administrador(nome, email ,senha) VALUES ("Andrey","andrey@email.com","senha"),
														("Gustavo","gustavo@email.com","senha"),
                                                        ("Rodrigo","rodrigo@email.com","senha"),
                                                        ("Bruno","bruno@email.com","senha"),
                                                        ("Jonatas","jonatas@email.com","senha");

INSERT INTO tb_cursos(nome, categoria ,qtdAulas,descricao) VALUES ("Java","Básico",13,"Curso de Java para Iniciantes: Um curso introdutório que ensina os conceitos básicos da linguagem de programação Java. Destinado a estudantes e profissionais de TI sem experiência em programação, fornecendo uma base sólida para projetos futuros."),
("JavaScript","Básico",14,"Curso Básico de JavaScript: Este curso destina-se a estudantes e profissionais de TI que já possuem conhecimentos básicos em JavaScript e desejam aprofundar suas habilidades na linguagem."),
("Python","Básico",15,"Curso Básico de Python: Este curso é projetado para iniciantes que desejam aprender a linguagem de programação Python. Os participantes serão introduzidos aos conceitos fundamentais, incluindo variáveis, estruturas de controle, listas, dicionários, funções e manipulação de arquivos."),
("PHP","Básico",13,"Curso Básico de PHP:Este curso é ideal para iniciantes que desejam aprender a linguagem de programação para web. Você aprenderá conceitos fundamentais, como variáveis, estruturas de controle, funções e manipulação do DOM.Nenhum conhecimento prévio de programação é necessário.");

INSERT INTO tb_usuario(id,nome, senha ,email,telefone,curso1,curso2,curso3,curso4) VALUES (DEFAULT,"João","senha","joao@email.com","199733784465",DEFAULT,DEFAULT,DEFAULT,DEFAULT),
												  (DEFAULT,"Maria","senha","maria@email.com","199357738446",DEFAULT,DEFAULT,DEFAULT,DEFAULT),
												  (DEFAULT,"Pedro","senha","pedro@email.com","199946738457",DEFAULT,DEFAULT,DEFAULT,DEFAULT),
												  (DEFAULT,"Ana","senha","ana@email.com","199554677463",DEFAULT,DEFAULT,DEFAULT,DEFAULT),
												  (DEFAULT,"Carlos","senha","carlos@email.com","199637455473",DEFAULT,DEFAULT,DEFAULT,DEFAULT),
                                                  (DEFAULT,"Laura","senha","laura@email.com","199976733854",DEFAULT,DEFAULT,DEFAULT,DEFAULT),
                                                  (DEFAULT,"Miguel","senha","miguel@email.com","199734588769",DEFAULT,DEFAULT,DEFAULT,DEFAULT),
                                                  (DEFAULT,"Sofia","senha","sofia@email.com","199874635789",DEFAULT,DEFAULT,DEFAULT,DEFAULT),
                                                  (DEFAULT,"Francisco","senha","francisco@email.com","199345873746",DEFAULT,DEFAULT,DEFAULT,DEFAULT),
                                                  (DEFAULT,"Gabriela","senha","gabriela@email.com","199679734536",DEFAULT,DEFAULT,DEFAULT,DEFAULT);
                                                  
                                                  
SELECT * FROM tb_usuario;
SELECT * FROM tb_administrador;
SELECT * FROM tb_cursos;
SELECT * FROM tb_usuario WHERE nome LIKE 'm%';
SELECT * FROM tb_usuario WHERE nome LIKE '%A';
SELECT * FROM tb_usuario WHERE nome LIKE '%A%';
DESC tb_usuario;
DESC tb_administrador;
DESC tb_cursos;

DELETE FROM tb_usuario;
DROP TABLE tb_cursos;
DROP TABLE tb_administrador;
