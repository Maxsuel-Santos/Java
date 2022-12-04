CREATE SCHEMA agenda;
USE agenda;

CREATE TABLE contato(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NULL,
    telefone VARCHAR(20) NULL
);

INSERT INTO contato (nome, telefone) 
VALUES ("Maxsuel Santos", "(77) 91544684"), 
	   ("Marcos Vinícius", "(77) 91430930"),
	   ("Gabriel Santos", "(77) 91506689"),
       ("Déborah Letícia", "(77) 92146152"),
       ("Kayllane Santos", "(77) 92024277");

SELECT * FROM contato;

#TRUNCATE contato;

#DELETE FROM contato WHERE id = 7;