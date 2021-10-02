package br.com.devtudo.devprobanco.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigo")
	private int codigo;
	@Column(name="nome",length = 50)
	private String nome;
	@Column(name="cpf",length=15, unique = true)
	private String cpf;
	@Column(name="telefone",length=15,unique = true)
	private String telefone;
	@Column(name="email", length=50,unique=true)
	private String email;
	@Column(name="data_nascimento")
	private LocalDate data_nascimento;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
}