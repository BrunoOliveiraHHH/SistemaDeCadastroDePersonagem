package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.JogadorDTO;
import br.com.sistemaCadastroPersonagem.model.entity.Jogador;

@Service
public class JogadorService implements GenericService<Jogador, JogadorDTO> {

    @Override
    public List<JogadorDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public JogadorDTO create(JogadorDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public JogadorDTO update(Integer id, JogadorDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public JogadorDTO getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id, String usuario) {
        // TODO Auto-generated method stub
        
    }
}
