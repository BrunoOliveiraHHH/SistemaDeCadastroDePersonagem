package br.com.sistemaCadastroPersonagem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemaCadastroPersonagem.model.entity.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer>, JpaSpecificationExecutor<Jogador>, CrudRepository<Jogador, Integer> {

}
