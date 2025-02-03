package br.com.sistemaCadastroPersonagem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemaCadastroPersonagem.model.entity.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer>, JpaSpecificationExecutor<Personagem>, CrudRepository<Personagem, Integer> {

}
