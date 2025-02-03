package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.JogadorDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JOGADOR")
public class Jogador {
    @Id
    @Column(name = "ID_JOGADOR")
    private Integer idJogador;
    
    @Column(name = "NOME")
    private String nome;
    
    @Column(name = "NUMERO_TELEFONE", length = 15)
    private Integer numeroTelefone;

    private static final ModelMapper mapper = new ModelMapper();

    public static Jogador fromDTO(JogadorDTO dto) {
        if(dto != null) {
            return mapper.map(dto, Jogador.class);
        }
        return null;
    }
}
