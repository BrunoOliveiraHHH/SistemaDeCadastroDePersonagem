USE SISTEMA_DE_CADASTRO_DE_PERSONAGEM;

ALTER TABLE PERSONAGEM
ADD CONSTRAINT FK_01_ID_RACA FOREIGN KEY (ID_RACA) REFERENCES PARAMETRO_RACA(ID_RACA);