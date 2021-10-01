package br.com.isidrocorp.helloworld.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.helloworld.DAO.ClienteDao;
import br.com.isidrocorp.helloworld.model.Cliente;

@RestController
public class ClienteController {
	@Autowired
	ClienteDao dao;
	@GetMapping("/clientes")
	public ArrayList<Cliente> recuperaTodos() {
		return (ArrayList<Cliente>) dao.findAll();
	}
}