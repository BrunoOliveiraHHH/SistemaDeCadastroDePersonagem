package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroClasseDTO;
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
@Table(name = "PARAMETRO_CLASSE")
public class ParametroClasse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PARAMETRO_CLASSE")
	private Integer idClasse;

	@Column(name = "NOME_CLASSE")
	private String nomeClasse;

	@Column(name = "DADO_DE_VIDA")
	private Integer dadoDeVida;

	private static final ModelMapper mapper = new ModelMapper();

	public static ParametroClasse fromDTO(ParametroClasseDTO dto) {
		if(dto != null) {
			return mapper.map(dto, ParametroClasse.class);
		}
		return null;
	}
}
