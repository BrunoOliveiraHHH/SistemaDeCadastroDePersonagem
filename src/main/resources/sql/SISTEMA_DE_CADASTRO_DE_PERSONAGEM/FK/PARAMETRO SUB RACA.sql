USE SISTEMA_DE_CADASTRO_DE_PERSONAGEM;

ALTER TABLE PARAMETRO_SUB_RACA
ADD CONSTRAINT FK_RACA_SUBRACA FOREIGN KEY (ID_RACA) REFERENCES PARAMETRO_RACA(ID_RACA);
