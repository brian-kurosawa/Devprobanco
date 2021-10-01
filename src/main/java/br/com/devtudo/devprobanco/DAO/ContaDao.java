package br.com.isidrocorp.helloworld.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.helloworld.model.Conta;

public interface ContaDao extends CrudRepository<Conta, Integer> {

}
