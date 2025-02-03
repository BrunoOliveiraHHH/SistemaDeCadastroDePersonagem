package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.RacaTracosRaciais;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RacaTracosRaciaisDTO {

    private Integer id;
    private ParametroRacaDTO raca;
    private ParametroTracosRaciaisDTO tracosRaciais;
    
    public RacaTracosRaciaisDTO toDTO(RacaTracosRaciais entidade) {
		ModelMapper mapper = new ModelMapper();
		if(entidade != null) {
			RacaTracosRaciaisDTO dto = mapper.map(entidade, RacaTracosRaciaisDTO.class);
			return dto;
		}
		return null;
	}
}
