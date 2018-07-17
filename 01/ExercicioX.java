public class ExercicioX {
    public static void main(String[] args) {
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }
        for (int i = 0, soma=0; i < 1000; i++) {
            soma = soma + i;
            System.out.println(soma);
        }
        double fatorial = 1;
        for (double n = 1; n <= 40; n++) {
            fatorial = fatorial * n;
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }

        long fib1 = 0;
        long fib2 = 1;
        for (int i = 1; i < 100; i++){
            System.out.println("fib: "+ fib1);
            long fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
            if (fib > 100) break;
        }

        int x = 13;
        do {
            if (x%2 == 0){
                x = x/2;
            } else {
                x = 3*x+1;
            }
            System.out.print(x);
            if (x != 1) System.out.print(" -> ");            
        } while (x > 1);
        
        System.out.println("\n Desafio:");
        int fibA = 0;
        for (int i = 1; i < 100; i++) {
            System.out.println(fibA);
            i = fibA + i;
            fibA = i+1;
        }
    }
}