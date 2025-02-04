package br.com.sistemaCadastroPersonagem.model.repository.specifications;

import br.com.sistemaCadastroPersonagem.model.entity.ParametroRaca;
import br.com.sistemaCadastroPersonagem.model.filter.ParametroRacaFilter;
import org.springframework.data.jpa.domain.Specification;

public class ParametroRacaSpecification {

    public static Specification<ParametroRaca> createSpecification(ParametroRacaFilter filter) {
        return (root, query, criteriaBuilder) -> {
            query.distinct(true);
            if (filter.getNome() != null && !filter.getNome().isEmpty()) {
                return criteriaBuilder.like(root.get("nome"), "%" + filter.getNome() + "%");
            }
            return criteriaBuilder.conjunction();
        };
    }
}
