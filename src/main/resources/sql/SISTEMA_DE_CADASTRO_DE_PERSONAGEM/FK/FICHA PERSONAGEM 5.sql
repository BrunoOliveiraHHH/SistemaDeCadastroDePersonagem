USE SISTEMA_DE_CADASTRO_DE_PERSONAGEM;


ALTER TABLE FICHA_PERSONAGEM
ADD CONSTRAINT FK_05_STATUS_PERSONAGEM  FOREIGN KEY (ID_STATUS_PERSONAGEM) REFERENCES STATUS_PERSONAGEM(ID_STATUS_PERSONAGEM);