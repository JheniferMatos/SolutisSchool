package Lista03;

import java.util.Scanner;

public class Ex13_VerificaAprovacaoProva {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double soma = 0, media = 0, notaProvaFinal, mediaRecuperacao;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += s.nextDouble();
        }

        media = soma / 3;

        if (media >= 7.0) {
            System.out.println("Aprovado, media: " + media);
        } else if (media >= 5.0) {
            System.out.println("Recuperacao, media: " + media);
            System.out.print("Digite a nota da prova final: ");
            notaProvaFinal = s.nextDouble();
            mediaRecuperacao = (media + notaProvaFinal) / 2;

            if (mediaRecuperacao >= 5.0) {
                System.out.println("Aprovado nota final, media: " + mediaRecuperacao);
            } else {
                System.out.println("Reprovado nota final, media final: " + mediaRecuperacao);
            }
        } else {
            System.out.println("Reprovado, mEdia: " + media);
        }
        s.close();
    }
}


