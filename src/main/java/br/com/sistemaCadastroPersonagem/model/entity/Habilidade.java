package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.HabilidadeDTO;
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
@Table(name = "HABILIDADES")
public class Habilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HABILIDADE")
    private Integer idHabilidade;

    @ManyToOne
    @JoinColumn(name = "ID_PARAMETRO_HABILIDADE", referencedColumnName = "ID_PARAMETRO_HABILIDADE", nullable = false)
    private ParametroHabilidade parametroHabilidade;

    @Column(name = "VALOR_HABILIDADE")
    private Integer valor;

    @Column(name = "MODIFICADOR_HABILIDADE")
    private Integer modificador;

    @Column(name = "POSSUI_SALVAGUARDA")
    private Integer possuiSalvaguarda;

    private static final ModelMapper mapper = new ModelMapper();

    public static Habilidade fromDTO(HabilidadeDTO dto) {
        if(dto != null) {
            return mapper.map(dto, Habilidade.class);
        }
        return null;
    }
}
