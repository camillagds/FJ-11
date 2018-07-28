package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco("CaelumBank", 999);
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			ContaCorrente c1 = new ContaCorrente();
			c1.setAgencia("1");
			c1.setNumero(1234);
			c1.setTitular("Pessoa" + i);
			c1.depositar(random.nextInt(1000));
			banco.adiciona(c1);
		}
		
		banco.mostraContas();
		
		List<Conta> contas = new ArrayList<>();
		contas.add(new ContaCorrente());
		contas.add(new ContaCorrente());
		contas.add(new ContaCorrente());
		contas.get(0).setTitular("Thais");
		contas.get(1).setTitular("Breno");
		contas.get(2).setTitular("1111");
		Collections.sort((List<Conta>) contas);
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
}
