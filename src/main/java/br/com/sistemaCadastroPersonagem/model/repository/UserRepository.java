package br.com.sistemaCadastroPersonagem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistemaCadastroPersonagem.model.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
