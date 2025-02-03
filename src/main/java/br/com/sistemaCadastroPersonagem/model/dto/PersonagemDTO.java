package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.Personagem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonagemDTO {
	
    private Integer idPersonagem;
    private String nomePersonagem;    
    private ParametroRacaDTO raca;
    private ParametroSubRacaDTO subRaca;
    private ParametroClasseDTO classe;
    private String antecedente;
    private Integer nivel;
    private Integer xp;
    private Integer tipoConjurador;
    
    public PersonagemDTO toDTO(Personagem entidade) {
		ModelMapper mapper = new ModelMapper();
		if(entidade != null) {
			PersonagemDTO dto = mapper.map(entidade, PersonagemDTO.class);
			return dto;
		}
		return null;
	}
}
