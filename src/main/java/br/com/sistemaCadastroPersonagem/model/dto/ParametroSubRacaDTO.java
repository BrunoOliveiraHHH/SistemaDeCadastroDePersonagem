package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.ParametroSubRaca;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParametroSubRacaDTO {

	private Integer id;
	private String nome;
	private ParametroRacaDTO raca;

	private static final ModelMapper mapper = new ModelMapper();

	public static ParametroSubRacaDTO fromEntity(ParametroSubRaca entidade) {
		if(entidade != null) {
			return mapper.map(entidade, ParametroSubRacaDTO.class);
		}
		return null;
	}
}
