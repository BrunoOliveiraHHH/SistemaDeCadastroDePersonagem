package br.com.sistemaCadastroPersonagem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemaCadastroPersonagem.model.entity.ParametroSubRaca;

@Repository
public interface ParametroSubRacaRepository extends JpaRepository<ParametroSubRaca, Integer>, JpaSpecificationExecutor<ParametroSubRaca>, CrudRepository<ParametroSubRaca, Integer> {

}
