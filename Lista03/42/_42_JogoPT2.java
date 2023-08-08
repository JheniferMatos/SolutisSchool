package Lista03;

import java.util.Random;

public class _42_JogoPT2 {
	public static void main(String[] args) {
		Random random = new Random();

		for (int i = 1; i <= 40; i++) {
			System.out.print("Grupo " + i + ": ");
			for (int j = 1; j <= 3; j++) {
				int numeroSorteado = random.nextInt(60);
				System.out.print(numeroSorteado + " ");
			}
			System.out.println();
		}
	}
}
