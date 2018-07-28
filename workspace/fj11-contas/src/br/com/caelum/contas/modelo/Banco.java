package br.com.caelum.contas.modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Banco {
	private String nome;
	private int numero;
	private Map<String, Conta> contas;
	
	public Banco(String nome, int numero){
		this.nome = nome;
		this.numero = numero;
		this.contas = new HashMap<>();
	}
	
	public boolean adiciona(Conta conta) {
		if (contas.containsValue(conta)){
			System.out.println("Conta ja existe!");
			return false;
		}
		contas.put(conta.getTitular(), conta);
		return true;
	}
	
	public int pegaQuantidadeDeContas() {
		return contas.size();
	}
	
	public Conta buscaPorTitular(String nome) {
		return contas.get(nome);
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void mostraContas() {
		for (Conta conta : contas.values()) {
	        conta.recuperaDadosParaImpressao();
	    }
	}
	
}
