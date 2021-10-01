package br.com.isidrocorp.helloworld.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_conta")
public class Conta {
	@Id
	@Column(name="numero")
	private int numero;
	@Column(name="dv")
	private int dv;
	@Column(name="agencia")
	private int agencia;
	@Column(name="data_abertura")
	private LocalDate abertura;
	@Column(name="saldo")
	private Double saldo;
	@Column(name="tipo")
	private int tipo;
	@ManyToOne
	@JoinColumn(name = "cod_cliente")
	private Cliente titular;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDv() {
		return dv;
	}
	public void setDv(int dv) {
		this.dv = dv;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public LocalDate getAbertura() {
		return abertura;
	}
	public void setAbertura(LocalDate abertura) {
		this.abertura = abertura;
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