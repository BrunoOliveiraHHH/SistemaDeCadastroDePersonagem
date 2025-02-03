package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.ParametroHabilidade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParametroHabilidadeDTO {

    private Integer id;
    private String nome;

    private static final ModelMapper mapper = new ModelMapper();

    public static ParametroHabilidadeDTO fromEntity(ParametroHabilidade entidade) {
        if(entidade != null) {
            return mapper.map(entidade, ParametroHabilidadeDTO.class);
        }
        return null;
    }
}
