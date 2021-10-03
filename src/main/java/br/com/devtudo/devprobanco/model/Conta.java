package br.com.devtudo.devprobanco.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_conta")
public class Conta {
	@Id
	@Column(name="numero")
	private int numero;
	@Column(name="digito")
	private int digito;
	@Column(name="agencia")
	private int agencia;
	@Column(name="data_abertura")
	private LocalDate dataAbertura;
	@Column(name="saldo")
	private Double saldo;
	@Column(name="tipo")
	private int tipo;
	@ManyToOne
	@JoinColumn(name = "codigo_cliente")
	private Cliente titular;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public LocalDate getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(LocalDate abertura) {
		this.dataAbertura = abertura;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}