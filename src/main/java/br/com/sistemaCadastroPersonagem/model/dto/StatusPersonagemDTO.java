package br.com.sistemaCadastroPersonagem.model.dto;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.entity.StatusPersonagem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusPersonagemDTO {

	private Integer idStatusPersonagem;
	private Integer pontosVidaMaxima;
	private Integer pontosVidaAtual;
	private Integer pontosVidaTemporaria;
	private Integer classeArmadura;
	private Integer bonusProficiencia;
	private Integer percepcaoPassiva;
	private String deslocamento;
	private Integer dadosDeVida;
	private Integer statusMorte;
	private String tendencia;

	private static final ModelMapper mapper = new ModelMapper();

	public static StatusPersonagemDTO fromEntity(StatusPersonagem entidade) {
		if(entidade != null) {
			return mapper.map(entidade, StatusPersonagemDTO.class);
		}
		return null;
	}
}
