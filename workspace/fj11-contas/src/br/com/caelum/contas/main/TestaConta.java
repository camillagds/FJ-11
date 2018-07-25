package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.depositar(10.0);
		System.out.println(conta.getSaldo());
		conta.sacar(8.0);
		System.out.println(conta.getSaldo());
		conta.recuperaDadosParaImpressao();
	}
}
