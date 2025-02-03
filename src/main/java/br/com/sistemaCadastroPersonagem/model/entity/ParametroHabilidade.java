package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroHabilidadeDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PARAMETRO_HABILIDADE")
public class ParametroHabilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PARAMETRO_HABILIDADE")
    private Integer id;

    @Column(name = "NOME_HABILIDADE", length = 255)
    private String nome;

    private static final ModelMapper mapper = new ModelMapper();

    public static ParametroHabilidade fromDTO(ParametroHabilidadeDTO dto) {
        if(dto != null) {
            return mapper.map(dto, ParametroHabilidade.class);
        }
        return null;
    }
}
