package br.com.sistemaCadastroPersonagem.model.entity;

import org.modelmapper.ModelMapper;

import br.com.sistemaCadastroPersonagem.model.dto.StatusPersonagemDTO;
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
@Table(name = "STATUS_PERSONAGEM")
public class StatusPersonagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_STATUS_PERSONAGEM")
	private Integer idStatusPersonagem;

	@Column(name = "PONTOS_VIDA_MAXIMA")
	private Integer pontosVidaMaxima;

	@Column(name = "PONTOS_VIDA_ATUAL")
	private Integer pontosVidaAtual;

	@Column(name = "PONTOS_VIDA_TEMPORARIA")
	private Integer pontosVidaTemporaria;

	@Column(name = "CLASSE_ARMADURA")
	private Integer classeArmadura;

	@Column(name = "BONUS_PROFICIENCIA")
	private Integer bonusProficiencia;

	@Column(name = "PERCEPCAO_PASSIVA")
	private Integer percepcaoPassiva;

	@Column(name = "DESLOCAMENTO")
	private String deslocamento;

	@Column(name = "DADOS_DE_VIDA")
	private Integer dadosDeVida;

	@Column(name = "STATUS_MORTE")
	private Integer statusMorte;

	@Column(name = "TENDENCIA")
	private String tendencia;

	private static final ModelMapper mapper = new ModelMapper();

	public static StatusPersonagem fromDTO(StatusPersonagemDTO dto) {
		if(dto != null) {
			return mapper.map(dto, StatusPersonagem.class);
		}
		return null;
	}
}
