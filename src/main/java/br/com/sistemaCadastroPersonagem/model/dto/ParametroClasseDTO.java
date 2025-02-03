package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.ParametroClasse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParametroClasseDTO {

	private Integer idClasse;
	private String nomeClasse;
	private Integer dadoDeVida;

	private static final ModelMapper mapper = new ModelMapper();

	public static ParametroClasseDTO fromEntity(ParametroClasse entidade) {
		if(entidade != null) {
			return mapper.map(entidade, ParametroClasseDTO.class);
		}
		return null;
	}
}
