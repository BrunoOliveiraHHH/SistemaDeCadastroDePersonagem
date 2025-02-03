package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.Habilidade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HabilidadeDTO {

    private Integer idHabilidade;
    private ParametroHabilidadeDTO parametroHabilidade;
    private Integer valor;
    private Integer modificador;
    private Integer possuiSalvaguarda;

    private static final ModelMapper mapper = new ModelMapper();

    public static HabilidadeDTO fromEntity(Habilidade entidade) {
        if(entidade != null) {
            return mapper.map(entidade, HabilidadeDTO.class);
        }
        return null;
    }
}
