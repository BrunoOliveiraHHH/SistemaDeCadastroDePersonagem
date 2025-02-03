package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroTracosRaciaisDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PARAMETRO_TRACOS_RACIAIS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParametroTracosRaciais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRACOS_RACIAIS")
    private Integer id;
    
    @Column(name = "NOME_TRACOS_RACIAIS")
    private String nome;
    
    @Column(name = "CARACTERISTICAS_RACIAIS", columnDefinition = "TEXT")
    private String caracteristicas;

    public ParametroTracosRaciais toEntity(ParametroTracosRaciaisDTO dto) {
        ModelMapper mapper = new ModelMapper();
        if(dto != null) {
            ParametroTracosRaciais entidade = mapper.map(dto, ParametroTracosRaciais.class);
            return entidade;
        }
        return null;
    }
}
