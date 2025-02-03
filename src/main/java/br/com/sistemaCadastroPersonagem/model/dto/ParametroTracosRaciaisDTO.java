package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.ParametroTracosRaciais;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParametroTracosRaciaisDTO {

    private Integer id;    
    private String nome;
    private String caracteristicas;
    
    public ParametroTracosRaciaisDTO toDTO(ParametroTracosRaciais entidade) {
		ModelMapper mapper = new ModelMapper();
		if(entidade != null) {
			ParametroTracosRaciaisDTO dto = mapper.map(entidade, ParametroTracosRaciaisDTO.class);
			return dto;
		}
		return null;
	}
}