//Imprima exatamente o n-ezimo termo da seqüência de Fibonacci.

import java.util.Scanner;

public class TermoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        long resultado = fibonacci(n);
        System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + resultado);

        sc.close();
    }

    public static long fibonacci(int n) {
        if (n <= 0) {
            return -1; 
        }

        long fib1 = 1, fib2 = 1, fibonacci = 0;

        for (int i = 3; i <= n; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }

        return fibonacci;
    }

}
