package br.com.sistemaCadastroPersonagem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemaCadastroPersonagem.model.entity.ClasseSalvaguarda;

@Repository
public interface ClasseSalvaguardaRepository extends JpaRepository<ClasseSalvaguarda, Integer>, JpaSpecificationExecutor<ClasseSalvaguarda>, CrudRepository<ClasseSalvaguarda, Integer> {

}
