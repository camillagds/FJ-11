package br.com.caelum.contas;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class RepositorioDeContas {
	public void salva(List<Conta> contas) {
		PrintStream stream = null;
		try {
			stream = new PrintStream("contas.csv");
			for (Conta conta : contas) {
				stream.println(conta.getTipo() + "," + conta.getNumero() + "," + conta.getAgencia() + ","
						+ conta.getTitular() + "," + conta.getSaldo());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel salar o arquivo. Verifique as permissões da pasta");
		} finally {
			stream.close();
		}
	}
	
	public List<Conta> carrega() {
		Scanner scanner = null;
		String[] valores = null;
		Conta conta = null;
		
		List<Conta> contas = new ArrayList<>();
		scanner = new Scanner("contas.csv");
		String linha = scanner.nextLine();
		valores = linha.split(",");
		scanner.close();
		
		if (valores[0] == "Conta Corrente"){
			conta = new ContaCorrente();
		}
		if (valores[0] == "Conta Poupança"){
			conta = new ContaPoupanca();
		}
		conta.setNumero(Integer.parseInt(valores[1]));
		conta.setAgencia(valores[2]);
		conta.setTitular(valores[3]);
		conta.depositar(Integer.parseInt(valores[3]));
		contas.add(conta);
		return contas;
	}
}
