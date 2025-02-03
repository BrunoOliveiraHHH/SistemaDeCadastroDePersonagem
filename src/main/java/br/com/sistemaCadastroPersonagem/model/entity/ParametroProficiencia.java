package br.com.sistemaCadastroPersonagem.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PARAMETRO_PROFICIENCIA")
public class ParametroProficiencia {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROFICIENCIA")
    private Integer idProficiencia;
    
    @Column(name = "NOME_PROFICIENCIA")
    private String nomeProficiencia;
    
    @Column(name = "TIPO_PROFICIENCIA")
    private Integer tipoProficiencia;
}
