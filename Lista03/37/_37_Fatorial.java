import java.util.Scanner;

public class _37_Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número:");

        System.out.println("O fatorial é: " + calcFactorial(sc.nextInt()));

        sc.close();
    }

    public static long calcFactorial(int n) {
        if (n > 1) {
            return n * calcFactorial(n - 1);
        } else {
            return 1;
        }
    }
}

