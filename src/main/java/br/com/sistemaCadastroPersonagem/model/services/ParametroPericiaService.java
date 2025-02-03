package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroPericiaDTO;
import br.com.sistemaCadastroPersonagem.model.entity.ParametroPericia;

@Service
public class ParametroPericiaService implements GenericService<ParametroPericia, ParametroPericiaDTO> {

    @Override
    public List<ParametroPericiaDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ParametroPericiaDTO create(ParametroPericiaDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ParametroPericiaDTO update(Long id, ParametroPericiaDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ParametroPericiaDTO getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id, String usuario) {
        // TODO Auto-generated method stub
        
    }

}
