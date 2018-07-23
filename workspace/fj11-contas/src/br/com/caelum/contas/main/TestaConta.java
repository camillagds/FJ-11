package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(10.0);
		System.out.println(conta.getSaldo());
		conta.sacar(8.0);
		System.out.println(conta.getSaldo());
	}
}
