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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta outraConta = (Conta) obj;
		if (agencia == null) {
			if (outraConta.agencia != null)
				return false;
		} else if (!agencia.equals(outraConta.agencia))
			return false;
		if (numero != outraConta.numero)
			return true;
		if (numero == outraConta.numero && agencia == outraConta.agencia)
			return true;
		return false;
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
