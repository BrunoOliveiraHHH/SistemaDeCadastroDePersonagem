package br.com.sistemaCadastroPersonagem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sistemaCadastroPersonagem.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
