import java.sql.Date;

/**
 * TestaConta
 */
public class TestaConta {

    public static void main(String[] args) {
        Conta conta1 = new Conta("Thais Andre",100.0);
        conta1.setAgencia("1234-4");
        conta1.setNumero(578757);
        conta1.setDataAbertura("27/06/2001");

        Conta conta2 = new Conta();
        conta2.setTitular("Daniel Lima");
        conta2.setAgencia("3694-8");
        conta2.setNumero(5454);
        conta2.setDataAbertura(13, 5, 1998);
        conta2.setDataAbertura(31, 2, 1998);

        conta1.recuperaDadosParaImpressao();
        conta2.recuperaDadosParaImpressao();

        // 4 - comparando

        if (conta1.equals(conta2)) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        // 5 - referencia
        Conta conta3 = conta1;
        if (conta1.equals(conta3)) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}