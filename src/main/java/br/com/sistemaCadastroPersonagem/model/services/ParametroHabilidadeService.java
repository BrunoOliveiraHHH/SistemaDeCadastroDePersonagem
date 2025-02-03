package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroHabilidadeDTO;
import br.com.sistemaCadastroPersonagem.model.entity.ParametroHabilidade;

@Service
public class ParametroHabilidadeService implements GenericService<ParametroHabilidade, ParametroHabilidadeDTO> {

    @Override
    public List<ParametroHabilidadeDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ParametroHabilidadeDTO create(ParametroHabilidadeDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ParametroHabilidadeDTO update(Long id, ParametroHabilidadeDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ParametroHabilidadeDTO getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id, String usuario) {
        // TODO Auto-generated method stub
        
    }

}
