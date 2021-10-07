# Criação do Banco de Dados
CREATE DATABASE db_javacina;

# Seleção do Banco de Dados
USE db_javacina;

USE db_pessoas;

# Criação da Entidade Usuarios 
CREATE TABLE tb_usuarios(
codigo INT PRIMARY KEY auto_increment,
primeiro_acesso VARCHAR(1),
nome VARCHAR(200),
email VARCHAR(200),
usuario VARCHAR (50),
senha VARCHAR (6),
permissao VARCHAR(13)
);

# Criação da Entidade Pessoas
CREATE TABLE tb_pessoas(
codigo INT PRIMARY KEY auto_increment,
nome VARCHAR(200),
data_nasc date,
profissao VARCHAR(3),
endereco VARCHAR(200),
data_vacinacao date,
prioridade int
);

# SELECTs
SELECT * from tb_pessoas;
SELECT * from tb_usuarios;

# Inserts
INSERT INTO `db_javacina`.`tb_usuarios` (nome, primeiro_acesso, email, usuario, senha, administrador) VALUES ('admin', true, 'admin', 'admin', 'admin', true);

UPDATE tb_usuarios SET senha = 'admin', primeiro_acesso = 0 WHERE codigo = 1;

SELECT * from tb_pessoas order by nome;

#DROP TABLE tb_pessoas;
#DROP TABLE tb_usuarios;

## Alter Table
ALTER TABLE `db_javacina`.`tb_usuarios` 
CHANGE COLUMN `administrador` `permissao` VARCHAR(1) NULL DEFAULT NULL ;


DELETE from tb_usuarios WHERE codigo = 10;

Select usuario_admin, senha_admin from db_javacina.tb_administrador WHERE usuario_admin = "admin";



SELECT * FROM tb_pessoas WHERE data_vacinacao BETWEEN '2020-01-01' AND '2021-12-31';

SELECT count(*) FROM tb_pessoas;






