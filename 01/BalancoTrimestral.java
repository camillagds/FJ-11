/**
 * Exercicio 3.3 - Balanço Trimestral
 */
public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;
        int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;

        double mediaMensal = gastoTrimestre / 3;

        System.out.println("Gasto do Trimestre: " + gastoTrimestre);
        System.out.println(String.format("Valor da média mensal: %.2f", mediaMensal));

    }
    
}