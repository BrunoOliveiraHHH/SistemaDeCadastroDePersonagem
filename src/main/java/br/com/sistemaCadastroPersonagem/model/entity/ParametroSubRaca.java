package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroSubRacaDTO;
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
@Table(name = "PARAMETRO_SUB_RACA")
public class ParametroSubRaca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SUB_RACA")
	private Integer id;

	@Column(name = "NOME_SUB_RACA", length = 255)
	private String nome;

	@ManyToOne
	@JoinColumn(name = "ID_RACA", referencedColumnName = "ID_RACA", nullable = false)
	private ParametroRaca raca;

	private static final ModelMapper mapper = new ModelMapper();

	public static ParametroSubRaca fromDTO(ParametroSubRacaDTO dto) {
		if(dto != null) {
			return mapper.map(dto, ParametroSubRaca.class);
		}
		return null;
	}
}
