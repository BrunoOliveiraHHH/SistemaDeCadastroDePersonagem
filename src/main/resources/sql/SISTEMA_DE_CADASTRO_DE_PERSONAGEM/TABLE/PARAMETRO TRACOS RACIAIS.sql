USE SISTEMA_DE_CADASTRO_DE_PERSONAGEM;

CREATE TABLE PARAMETRO_TRACOS_RACIAIS (
    ID_TRACOS_RACIAIS INT AUTO_INCREMENT,
    NOME_TRACOS_RACIAIS VARCHAR(255),
    CARACTERISTICAS_RACIAIS TEXT,
    PRIMARY KEY (ID_TRACOS_RACIAIS)
);