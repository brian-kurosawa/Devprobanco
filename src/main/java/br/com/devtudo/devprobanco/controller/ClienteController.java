package br.com.devtudo.devprobanco.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devtudo.devprobanco.DAO.ClienteDao;
import br.com.devtudo.devprobanco.model.Cliente;

@RestController
@CrossOrigin(origins = "*")
public class ClienteController {
	@Autowired
	ClienteDao dao;
	@GetMapping("/clientes")
	public ArrayList<Cliente> recuperaTodos() {
		return (ArrayList<Cliente>) dao.findAll();
	}
}