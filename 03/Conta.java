import java.sql.Date;

/**
 * Conta
 */
public class Conta {

    private String agencia;
    private String titular;
    private int numero;
    private double saldo;
    private Data dataAbertura;
    private int identificador;
    private static int qtdContas;

    public Conta(){
        qtdContas++;
        this.identificador = qtdContas;
    };

    public Conta(String titular, double saldo){
        qtdContas++;
        this.titular = titular;
        this.saldo = saldo;
        this.identificador = qtdContas;
    }

    public boolean sacar(double valorSaque) {
        if (valorSaque > this.saldo) {
            return false;
        } else {
            this.saldo -= valorSaque;
            return true;  
        }
    }

    public boolean depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            return false;
        } else {
            this.saldo += valorDeposito; 
            return true; 
        }
    }

    public double getRendimento() {
        return this.saldo * 0.1;
    }

    public void recuperaDadosParaImpressao() {
        System.out.println("-------------------------\n    Extrato   \n-------------------------");
        System.out.println(this.identificador + " - " + this.titular);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("N. Conta: " + this.numero);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("-------------------------");
        System.out.println("Saldo = " + this.saldo);
        System.out.println("Rendimento = " + this.getRendimento());
    }

    public void transferir(Conta contaDestino, double valorTransferencia) {
        boolean conseguiuSacar = this.sacar(valorTransferencia);
        if (conseguiuSacar){
            contaDestino.depositar(valorTransferencia);
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getIdentificador() {
        return identificador;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(int dia, int mes, int ano) {
        this.dataAbertura = new Data(dia, mes, ano);
    }

    public void setDataAbertura(String data) {
        this.dataAbertura = new Data(data);
    }
   
}

class Data {

    public int dia;
    public int mes;
    public int ano;
    
    public Data(int dia, int mes, int ano) {
        valida(dia, mes, ano);
    }

    public Data(String data) {
        String[] dma = data.split("/");
        int dia = Integer.parseInt(dma[0]);
        int mes = Integer.parseInt(dma[1]);
        int ano = Integer.parseInt(dma[2]);
        valida(dia, mes, ano);
    }

    public boolean valida(int dia, int mes, int ano){
        if (dia != 31 && mes != 2){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            return true;
        } else {
            System.out.println("Data não existe");
            return false;
        }
    }

    public String toString(){
        return String.format("%02d", this.dia)+"/"+String.format("%02d", this.mes)+"/"+String.format("%04d", this.ano);
    }
}