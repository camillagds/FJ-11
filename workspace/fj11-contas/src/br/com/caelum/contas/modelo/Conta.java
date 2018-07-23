package br.com.caelum.contas.modelo;

public class Conta {
	private String agencia;
	private int numero;
	private double saldo;
	private String titular;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
