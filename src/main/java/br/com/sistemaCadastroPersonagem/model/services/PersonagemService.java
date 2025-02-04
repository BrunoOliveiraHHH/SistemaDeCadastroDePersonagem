package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.PersonagemDTO;
import br.com.sistemaCadastroPersonagem.model.entity.Personagem;

@Service
public class PersonagemService implements GenericService<Personagem, PersonagemDTO> {

    @Override
    public List<PersonagemDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PersonagemDTO create(PersonagemDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PersonagemDTO update(Integer id, PersonagemDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public PersonagemDTO getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id, String usuario) {
        // TODO Auto-generated method stub
        
    }

}
