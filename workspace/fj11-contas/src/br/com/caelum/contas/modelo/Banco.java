package br.com.caelum.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;
	
	public Banco(String nome, int numero){
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}
	
	public boolean adiciona(Conta conta) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] == null ){
				contas[i] = conta;
				return true;
			}
		}
		System.out.println("Limite de contas atingido");
		return false;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void mostraContas() {
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Conta na posição " + i + ":");
			contas[i].recuperaDadosParaImpressao();
		}
	}
	
}
