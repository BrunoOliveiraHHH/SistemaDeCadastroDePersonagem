package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.HabilidadeDTO;
import br.com.sistemaCadastroPersonagem.model.entity.Habilidade;

@Service
public class HabilidadeService implements GenericService<Habilidade, HabilidadeDTO> {

    @Override
    public List<HabilidadeDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HabilidadeDTO create(HabilidadeDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HabilidadeDTO update(Integer id, HabilidadeDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public HabilidadeDTO getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id, String usuario) {
        // TODO Auto-generated method stub
        
    }
}
