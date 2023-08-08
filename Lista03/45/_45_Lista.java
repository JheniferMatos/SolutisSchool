package Lista03;

import java.util.Scanner;

public class _45_Lista {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int quantidadeValores = 100;
		int maiorValor = Integer.MIN_VALUE;

		for (int i = 1; i <= quantidadeValores; i++) {
			System.out.print("Digite o valor " + i + ": ");
			int valor = sc.nextInt();
			if (valor > maiorValor) {
				maiorValor = valor;
			}
		}

		System.out.println("O maior valor é: " + maiorValor);

		sc.close();
	}
}
