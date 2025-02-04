package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.RacaTracosRaciaisDTO;
import br.com.sistemaCadastroPersonagem.model.entity.RacaTracosRaciais;

@Service
public class RacaTracosRaciaisService implements GenericService<RacaTracosRaciais, RacaTracosRaciaisDTO> {

    @Override
    public List<RacaTracosRaciaisDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RacaTracosRaciaisDTO create(RacaTracosRaciaisDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RacaTracosRaciaisDTO update(Integer id, RacaTracosRaciaisDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public RacaTracosRaciaisDTO getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id, String usuario) {
        // TODO Auto-generated method stub
        
    }

}
