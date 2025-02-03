package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroPericiaDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PARAMETRO_PERICIA")
public class ParametroPericia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PARAMETRO_PERICIA")
    private Integer id;

    @Column(name = "NOME_PERICIA", length = 255, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "ID_PARAMETRO_HABILIDADE", referencedColumnName = "ID_PARAMETRO_HABILIDADE", nullable = false)
    private ParametroHabilidade habilidade;

    private static final ModelMapper mapper = new ModelMapper();

    public static ParametroPericia fromDTO(ParametroPericiaDTO dto) {
        if(dto != null) {
            return mapper.map(dto, ParametroPericia.class);
        }
        return null;
    }
}
