--first table test
CREATE TABLE test (
    id int primary key,
    nombre int
);
--INSERTION
INSERT INTO test (id, nombre) (
    SELECT i,i FROM generate_series(1, 1000000) as i);

CREATE INDEX idx_test_nombre ON test(nombre);

--second table
CREATE TABLE test_texte (
    id int primary key,
    nombre int,
    texte text
);

--INSERTION
EXPLAIN ANALYSE INSERT INTO test_texte (id, nombre, texte) (
    SELECT i,i, 'data for test_text' FROM generate_series(1000000, 1000000) as i);

-- CREATION d'un index sur le nombre
CREATE INDEX idx_test_texte_nombre ON test_texte(nombre);
CREATE INDEX idx_test_texte_nombre ON test_texte(texte);

--CREATION d'un index multi-colonne
CREATE INDEX idx_test_texte_nombre_text ON test_texte(nombre, texte);

SELECT * FROM test_texte WHERE nombre = 10000 AND texte = "data for test_text";

SELECT * FROM test_texte WHERE texte = "data for test_text";