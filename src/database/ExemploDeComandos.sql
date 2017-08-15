# Seleciona todas as colunas da tabela de carros
SELECT * FROM carros;

# Seleciona a coluna nome, fabricante, cor e quantidade de portas colocando um apelido
# para apresentar para o usuario de uma forma melhor
SELECT 
    id as 'Codigo', 
    nome as 'Nome', 
    fabricante as 'Fabricante', 
    cor as 'Cor          ', 
    quantidade_portas AS 'Quantidada de portas' 
FROM carros;

SELECT id as 'Codigo', nome as 'Nome', fabricante as 'Fabricante', cor as 'Cor          ',
 quantidade_portas AS 'Quantidada de portas', potencia FROM carros;

# Exemplo de insert
INSERT INTO carros
(id,nome,cor,fabricante,placa,chassi,quilometragem,potencia,data_compra,esta_funcionando,
permitida_circulacao,quantidade_portas,quantidade_batidas,ano_fabricacao,ano_lancamento,tipo_pneu,renavam,descricao)
 VALUE
(1, "GOL", "AZUL BEBE", "WOLKSVAGEM", "ABC-2000","2AB578ROepaso8231", 29134741, 85, '2017-08-07', TRUE, 
FALSE, 4, 0, 2017, 2016, 175, 847516874, "");

# somente alguns campos
INSERT INTO carros
(nome,cor,fabricante,potencia,data_compra)
 VALUE
("GOL", "AZUL BEBE", "WOLKSVAGEM", 85, '2017-08-07');

INSERT INTO carros
(nome,cor,fabricante,quantidade_portas,potencia,data_compra)
 VALUES
("Fox", "Purple", "Wolksvagem",4, 120, '2017-06-01'), ("Cross Fox", "Red",  "Wolksvagem", 4, 100, '2015-04-29');

# limpar a tabela de carros por completo
TRUNCATE carros;

# Retorna a quantidade de registro
SELECT COUNT(*) FROM carros;


USE minha_garagem
UPDATE carros SET
nome = "batmovel"
WHERE nome  = "fox";

INSERT INTO carros (fabricante,cor,nome)
values
("VW","Roxo", "Golf"),
("VW","Vermelho", "Jetta"),
("VW","Preto", "Gol"),
("VW","Preto", "Saveiro"),
("VW","Azul", "New Beetle"),
("VW","Branco", "Fusca"),
("VW","Amarelo", "Up"),
("VW","Cinza", "Saveiro");

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id > 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id < 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id >= 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id <= 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id <> 4;


UPDATE carros SET
cor = "Branco"
WHERE cor  = "Vermelho";

UPDATE carros SET
ano_fabricacao = 2017, ano_lancamento = 2016
WHERE cor  = "Branco";
SELECT nome, cor, ano_fabricacao,ano_lancamento FROM carros;


SELECT nome FROM carros ORDER BY nome DESC;
SELECT nome FROM carros ORDER BY fabricante ASC, nome ASC, cor ASC;


SELECT cor, COUNT(cor) FROM carros
GROUP BY cor
ORDER BY COUNT(cor) DESC