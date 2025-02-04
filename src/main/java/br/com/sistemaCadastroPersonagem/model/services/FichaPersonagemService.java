package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.FichaPersonagemDTO;
import br.com.sistemaCadastroPersonagem.model.entity.FichaPersonagem;

@Service
public class FichaPersonagemService implements GenericService<FichaPersonagem, FichaPersonagemDTO> {

    @Override
    public List<FichaPersonagemDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FichaPersonagemDTO create(FichaPersonagemDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FichaPersonagemDTO update(Integer id, FichaPersonagemDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public FichaPersonagemDTO getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id, String usuario) {
        // TODO Auto-generated method stub
        
    }
}
