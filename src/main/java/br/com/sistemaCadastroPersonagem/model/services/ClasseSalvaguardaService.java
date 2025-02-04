package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.ClasseSalvaguardaDTO;
import br.com.sistemaCadastroPersonagem.model.entity.ClasseSalvaguarda;

@Service
public class ClasseSalvaguardaService implements GenericService<ClasseSalvaguarda, ClasseSalvaguardaDTO> {

    @Override
    public List<ClasseSalvaguardaDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ClasseSalvaguardaDTO create(ClasseSalvaguardaDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ClasseSalvaguardaDTO update(Integer id, ClasseSalvaguardaDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ClasseSalvaguardaDTO getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id, String usuario) {
        // TODO Auto-generated method stub
        
    }

}
