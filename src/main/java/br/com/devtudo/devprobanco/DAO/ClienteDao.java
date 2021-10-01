package br.com.isidrocorp.helloworld.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.helloworld.model.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
	
}