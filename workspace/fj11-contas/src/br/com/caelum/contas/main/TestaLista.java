package br.com.caelum.contas.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {
	public static void main(String[] args) {
		Random rd = new Random();
		List<Conta> contas = new LinkedList<Conta>();
		contas.add(new ContaCorrente());
		contas.add(new ContaCorrente());
		contas.add(new ContaCorrente());
		contas.get(0).setTitular("Thais");
		contas.get(1).setTitular("Breno");
		contas.get(2).setTitular("1111");
		
		for (Iterator iterator = contas.iterator(); iterator.hasNext();) {
			Conta conta = (Conta) iterator.next();
			conta.depositar(rd.nextInt(1000));
			System.out.println(conta.getSaldo());
		}
	}
	
}
