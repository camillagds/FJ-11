class MeuPrograma3{
    public static void main(String[] args) {
        int idade = 15;
        boolean amigoDoDono = true;
        if (idade >= 18 || amigoDoDono) {
            System.out.println("Pode entrar");
        } else {
            System.out.println("Não Pode Entrar");
        }
        while (idade < 18){
            System.out.println(idade);
            idade++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}