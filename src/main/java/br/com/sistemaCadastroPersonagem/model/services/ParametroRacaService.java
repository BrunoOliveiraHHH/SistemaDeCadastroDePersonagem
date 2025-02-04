package br.com.sistemaCadastroPersonagem.model.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import br.com.sistemaCadastroPersonagem.model.dto.ParametroRacaDTO;
import br.com.sistemaCadastroPersonagem.model.entity.ParametroRaca;
import br.com.sistemaCadastroPersonagem.model.exceptions.AplicacaoException;
import br.com.sistemaCadastroPersonagem.model.filter.ParametroRacaFilter;
import br.com.sistemaCadastroPersonagem.model.repository.ParametroRacaRepository;
import br.com.sistemaCadastroPersonagem.model.repository.specifications.ParametroRacaSpecification;

@Service
public class ParametroRacaService implements GenericService<ParametroRaca, ParametroRacaDTO> {

    private static final Logger logger = LoggerFactory.getLogger(ParametroRacaService.class);

    @Autowired
    private ParametroRacaRepository repository;

    @Override
    public List<ParametroRacaDTO> getAll() {
        List<ParametroRacaDTO> list = new ArrayList<>();
        List<ParametroRaca> listEntity = repository.findAll();

        if (listEntity != null) {
            for (ParametroRaca entity : listEntity) {
                list.add(ParametroRacaDTO.fromEntity(entity));
            }
        }

        logger.info("Retrieved {} ParametroRaca entities", list.size());
        return list;
    }

    public List<ParametroRacaDTO> getAll(ParametroRacaFilter filter) {
        List<ParametroRacaDTO> list = new ArrayList<>();
        Specification<ParametroRaca> spec = ParametroRacaSpecification.createSpecification(filter);
        List<ParametroRaca> listEntity = repository.findAll(spec);

        if (listEntity != null) {
            for (ParametroRaca entity : listEntity) {
                list.add(ParametroRacaDTO.fromEntity(entity));
            }
        }

        logger.info("Retrieved {} ParametroRaca entities", list.size());
        return list;
    }

    @Override
    public ParametroRacaDTO create(ParametroRacaDTO dado) {
        validateParametroRacaDTO(dado);
        logger.info("Creating ParametroRaca with name: {}", dado.getNome());
        ParametroRaca raca = repository.findByNome(dado.getNome());

        if (raca != null) {
            throw new AplicacaoException("ParametroRaca with this name already exists.");
        }

        raca = ParametroRaca.fromDTO(dado);
        return ParametroRacaDTO.fromEntity(this.save(raca));
    }

    @Override
    public ParametroRacaDTO update(Integer id, ParametroRacaDTO dado) {
        validateParametroRacaDTO(dado);
        logger.info("Updating ParametroRaca with ID: {}", id);
        ParametroRaca raca = repository.findByNome(dado.getNome());

        if (raca == null) {
            throw new AplicacaoException("ParametroRaca not found.");
        }

        raca = ParametroRaca.fromDTO(dado);
        return ParametroRacaDTO.fromEntity(this.save(raca));
    }

    private ParametroRaca save(ParametroRaca entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
        logger.info("Deleting ParametroRaca with ID: {}", id);
        repository.deleteById(id);
    }

    @Override
    public ParametroRacaDTO getById(Integer id) {
        logger.info("Retrieving ParametroRaca with ID: {}", id);
        ParametroRaca raca = repository.findById(id)
                .orElseThrow(() -> new AplicacaoException("ParametroRaca not found."));
        return ParametroRacaDTO.fromEntity(raca);
    }

    @Override
    public void delete(Integer id, String usuario) {
        logger.info("User {} is deleting ParametroRaca with ID: {}", usuario, id);
        repository.deleteById(id);
    }

    private void validateParametroRacaDTO(ParametroRacaDTO dado) {
        if (dado == null || dado.getNome() == null || dado.getNome().isEmpty()) {
            throw new AplicacaoException("ParametroRaca name cannot be null or empty.");
        }
    }
}
