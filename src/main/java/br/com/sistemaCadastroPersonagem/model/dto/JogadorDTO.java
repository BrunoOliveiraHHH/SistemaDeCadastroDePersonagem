package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.Jogador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JogadorDTO {
	
    private Integer idJogador;
    private String nome;
    private Integer numeroTelefone;

    private static final ModelMapper mapper = new ModelMapper();

    public static JogadorDTO fromEntity(Jogador entidade) {
        if(entidade != null) {
            return mapper.map(entidade, JogadorDTO.class);
        }
        return null;
    }
}
