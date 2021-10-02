package br.com.devtudo.devprobanco.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.devtudo.devprobanco.model.Conta;

public interface ContaDao extends CrudRepository<Conta, Integer> {

}
