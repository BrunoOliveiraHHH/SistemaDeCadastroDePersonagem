USE SISTEMA_DE_CADASTRO_DE_PERSONAGEM;
ALTER TABLE FICHA_PERSONAGEM
ADD CONSTRAINT FK_04_PERSONAGEM_PERICIAS   FOREIGN KEY (ID_PERICIA) REFERENCES PERICIAS(ID_PERICIA);