import java.sql.Date;

/**
 * Conta
 */
public class Conta {

    String agencia;
    String titular;
    int numero;
    double saldo;
    Data dataAbertura;

    boolean sacar(double valorSaque) {
        if (valorSaque > this.saldo) {
            return false;
        } else {
            this.saldo -= valorSaque;
            return true;  
        }
    }

    boolean depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            return false;
        } else {
            this.saldo += valorDeposito; 
            return true; 
        }
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }

    public void recuperaDadosParaImpressao() {
        System.out.println("-------------------------\n    Extrato   \n-------------------------");
        System.out.println(this.titular);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("N. Conta: " + this.numero);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("-------------------------");
        System.out.println("Saldo = " + this.saldo);
        System.out.println("Rendimento = " + this.calculaRendimento());
    }

    void transferir(Conta contaDestino, double valorTransferencia) {
        boolean conseguiuSacar = this.sacar(valorTransferencia);
        if (conseguiuSacar){
            contaDestino.depositar(valorTransferencia);
        }
    }
}

class Data {
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString(){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
    int dia;
    int mes;
    int ano;
}