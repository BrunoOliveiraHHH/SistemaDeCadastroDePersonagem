package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.FichaPersonagem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FichaPersonagemDTO {

	private Integer id;
	private JogadorDTO jogador;
	private PersonagemDTO personagem;
	private HabilidadeDTO habilidade;
	private PericiaDTO pericia;
	private StatusPersonagemDTO statusPersonagem;

	private static final ModelMapper mapper = new ModelMapper();

	public static FichaPersonagemDTO fromEntity(FichaPersonagem entidade) {
		if(entidade != null) {
			return mapper.map(entidade, FichaPersonagemDTO.class);
		}
		return null;
	}
}
