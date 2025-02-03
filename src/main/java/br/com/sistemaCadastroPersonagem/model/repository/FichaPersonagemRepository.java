package br.com.sistemaCadastroPersonagem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemaCadastroPersonagem.model.entity.FichaPersonagem;

@Repository
public interface FichaPersonagemRepository extends JpaRepository<FichaPersonagem, Integer>, JpaSpecificationExecutor<FichaPersonagem>, CrudRepository<FichaPersonagem, Integer> {

}
