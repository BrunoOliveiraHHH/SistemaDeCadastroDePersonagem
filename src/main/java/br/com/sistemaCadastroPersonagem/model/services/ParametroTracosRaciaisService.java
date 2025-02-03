
package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroTracosRaciaisDTO;
import br.com.sistemaCadastroPersonagem.model.entity.ParametroTracosRaciais;

@Service
public class ParametroTracosRaciaisService implements GenericService<ParametroTracosRaciais, ParametroTracosRaciaisDTO> {

    @Override
    public List<ParametroTracosRaciaisDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ParametroTracosRaciaisDTO create(ParametroTracosRaciaisDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ParametroTracosRaciaisDTO update(Long id, ParametroTracosRaciaisDTO dado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ParametroTracosRaciaisDTO getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id, String usuario) {
        // TODO Auto-generated method stub
        
    }

}
