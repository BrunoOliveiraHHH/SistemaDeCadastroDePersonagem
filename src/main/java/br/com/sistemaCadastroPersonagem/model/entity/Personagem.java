package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.PersonagemDTO;
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
@Table(name = "PERSONAGEM")
public class Personagem {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONAGEM")
    private Integer idPersonagem;
    
    @Column(name = "NOME_PERSONAGEM")
    private String nomePersonagem;    
    
    @ManyToOne
    @JoinColumn(name = "ID_RACA", referencedColumnName = "ID_RACA", nullable = false)    
    private ParametroRaca raca;
    
    @ManyToOne
    @JoinColumn(name = "ID_SUB_RACA", referencedColumnName = "ID_SUB_RACA", nullable = false)    
    private ParametroSubRaca subRaca;
    
    @ManyToOne
    @JoinColumn(name = "ID_PARAMETRO_CLASSE", referencedColumnName = "ID_PARAMETRO_CLASSE", nullable = false)
    private ParametroClasse classe;
    
    @Column(name = "ANTECEDENTE")
    private String antecedente;
    
    @Column(name = "NIVEL")
    private Integer nivel;
    
    @Column(name = "XP")
    private Integer xp;
    
    @Column(name = "TIPO_CONJURADOR")
    private Integer tipoConjurador;

    public Personagem toEntity(PersonagemDTO dto) {
        ModelMapper mapper = new ModelMapper();
        if(dto != null) {
            Personagem entidade = mapper.map(dto, Personagem.class);
            return entidade;
        }
        return null;
    }
}
