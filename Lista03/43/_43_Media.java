package Lista03;

import java.util.Scanner;

public class _43_Media {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de valores a serem lidos: ");
		int quantidadeValores = sc.nextInt();

		int somaValores = 0;

		for (int i = 1; i <= quantidadeValores; i++) {
			System.out.print("Digite o valor " + i + ": ");
			int valor = sc.nextInt();
			somaValores += valor;
		}

		double media = (double) somaValores / quantidadeValores;
		System.out.println("A média dos valores é: " + media);

		sc.close();
	}
}
