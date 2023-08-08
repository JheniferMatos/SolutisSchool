package Lista03;

import java.util.Scanner;

public class Ex9_VerificaIdade {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade.");

        } else {
            System.out.println("Maior de idade.");
        }
        s.close();
    }
}
