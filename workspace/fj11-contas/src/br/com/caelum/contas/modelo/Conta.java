package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public abstract class Conta implements Comparable<Conta> {
	private String agencia;
	private int numero;
	protected double saldo;
	private String titular;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public Conta() {
	}

	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);

	}

	@Override
	public String toString() {
		return "[ag " + agencia + " | cnt " + numero + "] " + titular.toUpperCase();

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Conta outraConta = (Conta) obj;

		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}

	public abstract String getTipo();

	public boolean sacar(double valorSaque) throws SaldoInsuficienteException {
		if (valorSaque < this.saldo) {
			return false;
		} else {
			this.saldo -= valorSaque;
			return true;
		}
	}

	public boolean depositar(double valorDeposito) {
		if (valorDeposito < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valorDeposito;
			return true;
		}
	}

	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
		this.sacar(valor);
		conta.depositar(valor);
	}

	public void recuperaDadosParaImpressao() {
		System.out.println("-------------------------\n    Extrato   \n-------------------------");
		System.out.println("Agencia: " + this.agencia);
		System.out.println("N. Conta: " + this.numero);
		System.out.println("Tipo = " + this.getTipo());
		System.out.println("-------------------------");
		System.out.println("Saldo = " + this.saldo);
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
