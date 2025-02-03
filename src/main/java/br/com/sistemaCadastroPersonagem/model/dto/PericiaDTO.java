package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.Pericia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PericiaDTO {

    private Integer id;
    private ParametroPericiaDTO parametroPericia;
    private Integer valor;
    private Integer possuiPericia;
    
    public PericiaDTO toDTO(Pericia entidade) {
		ModelMapper mapper = new ModelMapper();
		if(entidade != null) {
			PericiaDTO dto = mapper.map(entidade, PericiaDTO.class);
			return dto;
		}
		return null;
	}
}

