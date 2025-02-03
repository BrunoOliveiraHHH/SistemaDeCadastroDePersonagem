package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.ParametroRaca;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParametroRacaDTO {

    private Integer id;
    private String nome;

    private static final ModelMapper mapper = new ModelMapper();

    public static ParametroRacaDTO fromEntity(ParametroRaca entidade) {
        if(entidade != null) {
            return mapper.map(entidade, ParametroRacaDTO.class);
        }
        return null;
    }
}
