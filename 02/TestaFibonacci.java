public class TestaFibonacci {

    public static void main(String[] args) {        
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 1; i <= 6; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.println(resultado);
        }   
    }
}

class Fibonacci {

    int calculaFibonacci(int fib) {
        if (fib < 2){
            return fib;
        } else {
            return calculaFibonacci(fib - 1) + calculaFibonacci(fib-2);
        }
    }
}