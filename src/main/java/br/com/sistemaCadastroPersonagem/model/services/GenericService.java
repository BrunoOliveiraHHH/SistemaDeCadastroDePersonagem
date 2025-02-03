package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

public interface GenericService<E,D> {
	
	List<D> getAll();

	D create(D dado);

	D update(Long id, D dado);

	void delete(Long id);

	D getById(Long id);

	void delete(Long id, String usuario);

}
