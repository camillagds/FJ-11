package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {
	public String getTipo(){
		return "Conta Corrente";
	}
	
	@Override
    public boolean sacar(double valorSaque) throws SaldoInsuficienteException {
        if (valorSaque <= 0 ) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        } 
        if (valorSaque > this.saldo) {
			throw new SaldoInsuficienteException(valorSaque);
		}
        {
            this.saldo -= (valorSaque + 0.10);
            return true;  
        }
    }

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}
