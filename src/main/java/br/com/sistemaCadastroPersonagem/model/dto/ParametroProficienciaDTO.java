package br.com.sistemaCadastroPersonagem.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParametroProficienciaDTO {
	
    private Integer idProficiencia;
    private String nomeProficiencia;
    private Integer tipoProficiencia;
}
