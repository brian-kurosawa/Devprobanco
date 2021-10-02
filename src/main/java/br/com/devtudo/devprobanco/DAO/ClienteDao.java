package br.com.devtudo.devprobanco.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.devtudo.devprobanco.model.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
	
}