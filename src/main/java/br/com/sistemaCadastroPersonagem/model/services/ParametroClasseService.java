package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroClasseDTO;
import br.com.sistemaCadastroPersonagem.model.entity.ParametroClasse;

@Service
public class ParametroClasseService implements GenericService<ParametroClasse, ParametroClasseDTO> {

    @Override
    public List<ParametroClasseDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ParametroClasseDTO create(ParametroClasseDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ParametroClasseDTO update(Long id, ParametroClasseDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ParametroClasseDTO getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id, String usuario) {
        // TODO Auto-generated method stub
        
    }

}
