package Lista03;

import java.util.Scanner;

public class Ex11_VerificaVoto {

    public static void main(String[] args) {
        int idade;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Digite sua idade: ");
            idade = s.nextInt();

            if (idade <= 0) {
                System.out.println("Idade invalida digite uma idade valida!");
            }
        } while (idade <= 0);

        if (idade < 16) {
            System.out.println(idade + " anos, Nao permitido votar.");

        } else if (idade < 18 || idade >= 65) {
            System.out.println(idade + " anos, Voto Facultativo.");

        } else {
            System.out.print("Voto obrigatorio!");
        }

        s.close();
    }
}
