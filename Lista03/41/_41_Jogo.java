package Lista03;

import java.util.Random;
import java.util.Scanner;

public class _41_Jogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int numeroSorteado = random.nextInt(100) + 1;
		int tentativas = 0;
		int palpite;

		System.out.println("Bem-vindo ao Jogo de Adivinhação! Tente adivinhar o número sorteado de 1 a 100.");

		do {
			System.out.print("Digite seu palpite: ");
			palpite = sc.nextInt();
			tentativas++;

			if (palpite < numeroSorteado) {
				System.out.println("Dica: o número sorteado é maior que o palpite.");
			} else if (palpite > numeroSorteado) {
				System.out.println("Dica: o número sorteado é menor que o palpite.");
			} else {
				System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
			}
		} while (palpite != numeroSorteado);

		sc.close();
	}
}
