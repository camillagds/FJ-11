package br.com.caelum.contas.main;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.depositar(i * 100.00);
			contas[i] = conta;
		}
		
		double soma = 0;
		for (Conta conta : contas) {
			soma = soma + conta.getSaldo();
			System.out.println(conta.getSaldo());
		}
		System.out.println(soma/contas.length);
		
		String frase = "Uma mensagem qualquer";
		String[] palavras = frase.split(" ");
		for (int i = palavras.length-1; i >= 0; i--) {
			System.out.println(palavras[i]);
		}
	}
	
	
}
