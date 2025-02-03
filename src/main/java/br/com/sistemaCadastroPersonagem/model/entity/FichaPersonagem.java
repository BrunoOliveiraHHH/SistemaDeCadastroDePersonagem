package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.FichaPersonagemDTO;
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
@Table(name = "FICHA_PERSONAGEM")
public class FichaPersonagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FICHA_PERSONAGEM")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "ID_JOGADOR", referencedColumnName = "ID_JOGADOR", nullable = false)
	private Jogador jogador;

	@ManyToOne
	@JoinColumn(name = "ID_PERSONAGEM", referencedColumnName = "ID_PERSONAGEM", nullable = false)
	private Personagem personagem;

	@ManyToOne
	@JoinColumn(name = "ID_HABILIDADE", referencedColumnName = "ID_HABILIDADE", nullable = false)
	private Habilidade habilidade;

	@ManyToOne
	@JoinColumn(name = "ID_PERICIA", referencedColumnName = "ID_PERICIA", nullable = false)
	private Pericia pericia;

	@ManyToOne
	@JoinColumn(name = "ID_STATUS_PERSONAGEM", referencedColumnName = "ID_STATUS_PERSONAGEM", nullable = false)
	private StatusPersonagem statusPersonagem;

	private static final ModelMapper mapper = new ModelMapper();

	public static FichaPersonagem fromDTO(FichaPersonagemDTO dto) {
		if(dto != null) {
			return mapper.map(dto, FichaPersonagem.class);
		}
		return null;
	}
}
