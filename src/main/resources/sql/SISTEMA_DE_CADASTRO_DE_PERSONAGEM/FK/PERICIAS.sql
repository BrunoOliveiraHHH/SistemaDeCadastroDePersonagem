USE SISTEMA_DE_CADASTRO_DE_PERSONAGEM;


ALTER TABLE PERICIAS 
ADD CONSTRAINT FK_PERICIAS01 FOREIGN KEY (ID_PARAMETRO_PERICIA) REFERENCES PARAMETRO_PERICIA(ID_PARAMETRO_PERICIA);