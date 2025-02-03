package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.RacaTracosRaciaisDTO;
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
@Table(name = "RACA_TRACOS_RACIAIS")
public class RacaTracosRaciais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RACA_TRACOS_RACIAIS")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_RACA", referencedColumnName = "ID_RACA", nullable = false)
    private ParametroRaca raca;

    @ManyToOne
    @JoinColumn(name = "ID_TRACOS_RACIAIS", referencedColumnName = "ID_TRACOS_RACIAIS", nullable = false)
    private ParametroTracosRaciais tracosRaciais;

    public RacaTracosRaciais toEntity(RacaTracosRaciaisDTO dto) {
        ModelMapper mapper = new ModelMapper();
        if(dto != null) {
            RacaTracosRaciais entidade = mapper.map(dto, RacaTracosRaciais.class);
            return entidade;
        }
        return null;
    }
}
