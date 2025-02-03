package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.PericiaDTO;
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
@Table(name = "PERICIAS")
public class Pericia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERICIA")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_PARAMETRO_PERICIA", referencedColumnName = "ID_PARAMETRO_PERICIA", nullable = false)
    private ParametroPericia parametroPericia;

    @Column(name = "VALOR_PERICIA")
    private Integer valor;

    @Column(name = "POSSUI_PERICIA")
    private Integer possuiPericia;

    public Pericia toEntity(PericiaDTO dto) {
        ModelMapper mapper = new ModelMapper();
        if(dto != null) {
            Pericia entidade = mapper.map(dto, Pericia.class);
            return entidade;
        }
        return null;
    }
}
