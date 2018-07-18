import java.sql.Date;

/**
 * TestaConta
 */
public class TestaConta {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.titular = "Thais Andre";
        conta1.saldo = 100.0;
        conta1.agencia = "1234-4";
        conta1.numero = 578757;
        conta1.dataAbertura = new Data(27,06,2001);

        Conta conta2 = new Conta();
        conta2.titular = "Daniel Lima";
        conta2.saldo = 200.0;
        conta2.agencia = "3694-8";
        conta2.numero = 5454;
        conta2.dataAbertura = new Data(13,5,1998);

        conta1.recuperaDadosParaImpressao();
        conta2.recuperaDadosParaImpressao();
   
        // 4 - comparando

        if (conta1.equals(conta2)){
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        // 5 - referencia
        Conta conta3 = conta1;
        if (conta1.equals(conta3)){
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}