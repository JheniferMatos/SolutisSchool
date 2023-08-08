package Lista03;

import java.util.Scanner;

public class _40_IdadeGrupo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas no grupo: ");
		int quantidadePessoas = sc.nextInt();

		int somaIdades = 0;
		int maiorIdade = Integer.MIN_VALUE;
		int menorIdade = Integer.MAX_VALUE;
		int quantidadeMaioresIdade = 0;

		for (int i = 1; i <= quantidadePessoas; i++) {
			System.out.print("Digite a idade da pessoa " + i + ": ");
			int idade = sc.nextInt();

			somaIdades += idade;

			if (idade > maiorIdade) {
				maiorIdade = idade;
			}
			if (idade < menorIdade) {
				menorIdade = idade;
			}
			if (idade >= 18) {
				quantidadeMaioresIdade++;
			}
		}

		double mediaIdades = (double) somaIdades / quantidadePessoas;

		System.out.println("Média das idades: " + mediaIdades);
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Menor idade: " + menorIdade);
		System.out.println("Quantidade de pessoas maior de idade: " + quantidadeMaioresIdade);

		sc.close();
	}
}
