USE SISTEMA_DE_CADASTRO_DE_PERSONAGEM;
CREATE TABLE PARAMETRO_PROFICIENCIA (
    ID_PROFICIENCIA INT AUTO_INCREMENT, 
    NOME_PROFICIENCIA VARCHAR(255),
    TIPO_PROFICIENCIA INT, -- 1 Arma, 2 Armadura, 3 Idioma e 4 Ferramenta
    PRIMARY KEY (ID_PROFICIENCIA)
);