package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.ClasseSalvaguarda;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClasseSalvaguardaDTO {

    private Integer idClasseSalvaguarda;
    private ParametroClasseDTO parametroClasse;
    private ParametroHabilidadeDTO parametroHabilidade;

    private static final ModelMapper mapper = new ModelMapper();

    public static ClasseSalvaguardaDTO fromEntity(ClasseSalvaguarda entidade) {
        if(entidade != null) {
            return mapper.map(entidade, ClasseSalvaguardaDTO.class);
        }
        return null;
    }
}
