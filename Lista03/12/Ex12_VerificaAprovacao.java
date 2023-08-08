package Lista03;

import java.util.Scanner;

public class Ex12_VerificaAprovacao {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double soma = 0, media = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.print("Digite a nota " + i + ": ");
            soma += s.nextDouble();

        }

        media = soma / 3;

        if (media >= 7.0) {
            System.out.println("Aprovado, media: " + media);

        } else if (media >= 5.0) {

            System.out.println("Recuperacao, media: " + media);

        } else {

            System.out.println("Reprovado, media: " + media);

        }
        s.close();
    }
}


