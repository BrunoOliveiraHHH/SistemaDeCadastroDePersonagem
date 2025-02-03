package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.ParametroPericia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParametroPericiaDTO {

    private Integer id;
    private String nome;
    private ParametroHabilidadeDTO habilidade;

    private static final ModelMapper mapper = new ModelMapper();

    public static ParametroPericiaDTO fromEntity(ParametroPericia entidade) {
        if(entidade != null) {
            return mapper.map(entidade, ParametroPericiaDTO.class);
        }
        return null;
    }
}
