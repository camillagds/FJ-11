package br.com.caelum.contas.main;

import java.io.PrintStream;

import br.com.caelum.contas.exception.SaldoInsuficienteException;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.depositar(100.0);
		System.out.println(conta.getSaldo());
		try {
			conta.sacar(500);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());
		conta.recuperaDadosParaImpressao();
		String aie = "ola oie uhu";
		for (char str : aie.toCharArray()) {
			System.out.print(str);
		}
		System.out.println("\n");
		String frase = "Socorram-me, subi no onibus em Marrocos";
		
		for (int i = frase.length()-1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}
		
		StringBuilder name = new StringBuilder("cachorro");
		name.reverse();
		System.out.println(name);
	}
}
