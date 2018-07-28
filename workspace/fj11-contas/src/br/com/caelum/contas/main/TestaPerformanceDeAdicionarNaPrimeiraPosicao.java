package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		List<Integer> teste = new LinkedList<>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(0, i);
		}
		long fim = System.currentTimeMillis();

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}
}
