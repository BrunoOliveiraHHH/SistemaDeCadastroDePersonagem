package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroProficienciaDTO;
import br.com.sistemaCadastroPersonagem.model.entity.ParametroProficiencia;

@Service
public class ParametroProficienciaService implements GenericService<ParametroProficiencia, ParametroProficienciaDTO> {

    @Override
    public List<ParametroProficienciaDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ParametroProficienciaDTO create(ParametroProficienciaDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ParametroProficienciaDTO update(Integer id, ParametroProficienciaDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ParametroProficienciaDTO getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id, String usuario) {
        // TODO Auto-generated method stub
        
    }

}
