//Exiba dois números fornecidos pelo usuário em ordem crescente.

import java.util.Scanner;

public class NumeroCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            // Troca os valores das variáveis se o primeiro número for maior que o segundo
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("Os números em ordem crescente são: " + numero1 + " e " + numero2);

        sc.close();
    }
}

