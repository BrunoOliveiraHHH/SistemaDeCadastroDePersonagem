package br.com.sistemaCadastroPersonagem.model.services;

import java.util.List;

public interface GenericService<E,D> {
	
	List<D> getAll();

	D create(D dado);

	D update(Integer id, D dado);

	void delete(Integer id);

	D getById(Integer id);

	void delete(Integer id, String usuario);

}
