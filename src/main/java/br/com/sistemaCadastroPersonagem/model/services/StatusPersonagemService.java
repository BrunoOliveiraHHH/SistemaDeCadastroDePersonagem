package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.StatusPersonagemDTO;
import br.com.sistemaCadastroPersonagem.model.entity.StatusPersonagem;

@Service
public class StatusPersonagemService implements GenericService<StatusPersonagem, StatusPersonagemDTO> {

	@Override
	public List<StatusPersonagemDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusPersonagemDTO create(StatusPersonagemDTO dado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusPersonagemDTO update(Long id, StatusPersonagemDTO dado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StatusPersonagemDTO getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id, String usuario) {
		// TODO Auto-generated method stub
		
	}

    
}
