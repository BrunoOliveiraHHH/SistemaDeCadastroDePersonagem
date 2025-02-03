package br.com.sistemaCadastroPersonagem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemaCadastroPersonagem.model.entity.ParametroTracosRaciais;

@Repository
public interface ParametroTracosRaciaisRepository extends JpaRepository<ParametroTracosRaciais, Integer>, JpaSpecificationExecutor<ParametroTracosRaciais>, CrudRepository<ParametroTracosRaciais, Integer> {

}
