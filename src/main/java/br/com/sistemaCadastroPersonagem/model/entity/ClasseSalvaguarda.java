package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.ClasseSalvaguardaDTO;
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

@Entity
@Table(name = "CLASSE_SALVAGUARDA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClasseSalvaguarda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLASSE_SALVAGUARDA")
    private Integer idClasseSalvaguarda;

    @ManyToOne
    @JoinColumn(name = "ID_CLASSE", referencedColumnName = "ID_PARAMETRO_CLASSE", nullable = false)
    private ParametroClasse parametroClasse;

    @ManyToOne
    @JoinColumn(name = "ID_HABILIDADE", referencedColumnName = "ID_PARAMETRO_HABILIDADE", nullable = false)
    private ParametroHabilidade parametroHabilidade;

    private static final ModelMapper mapper = new ModelMapper();

    public static ClasseSalvaguarda fromDTO(ClasseSalvaguardaDTO dto) {
        if(dto != null) {
            return mapper.map(dto, ClasseSalvaguarda.class);
        }
        return null;
    }
}
