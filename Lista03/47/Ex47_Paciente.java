package Lista03;

import java.util.Scanner;

public class _47_Paciente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		char sexo;
		double peso, altura;
		int idade, quantidadePacientes = 0;
		int quantidadeHomens = 0, somaIdadeHomens = 0;
		int quantidadeMulheresAlturaPeso = 0;
		int quantidadeIdade1825 = 0;
		int idadeMaisVelho = 0;
		String nomeMaisVelho = "";
		double alturaMaisBaixa = Double.MAX_VALUE;
		String nomeMaisBaixa = "";

		System.out.println("Digite os dados dos pacientes. Digite 'fim' no nome para encerrar.");

		while (true) {
			System.out.print("Nome: ");
			nome = sc.nextLine();

			if (nome.equalsIgnoreCase("fim")) {
				break;
			}

			System.out.print("Sexo (M/F): ");
			sexo = sc.next().charAt(0);
			sc.nextLine(); // Consumir o caractere de nova linha deixado pelo next()

			System.out.print("Peso: ");
			peso = sc.nextDouble();

			System.out.print("Idade: ");
			idade = sc.nextInt();

			System.out.print("Altura: ");
			altura = sc.nextDouble();
			sc.nextLine(); // Consumir o caractere de nova linha deixado pelo next()

			quantidadePacientes++;

			if (sexo == 'M' || sexo == 'm') {
				quantidadeHomens++;
				somaIdadeHomens += idade;
			} else if ((sexo == 'F' || sexo == 'f') && altura >= 1.60 && altura <= 1.70 && peso > 70) {
				quantidadeMulheresAlturaPeso++;
			}

			if (idade >= 18 && idade <= 25) {
				quantidadeIdade1825++;
			}

			if (idade > idadeMaisVelho) {
				idadeMaisVelho = idade;
				nomeMaisVelho = nome;
			}

			if (sexo == 'F' || sexo == 'f') {
				if (altura < alturaMaisBaixa) {
					alturaMaisBaixa = altura;
					nomeMaisBaixa = nome;
				}
			}
		}

		double mediaIdadeHomens = (double) somaIdadeHomens / quantidadeHomens;

		System.out.println("\nRelatório da Clínica:");
		System.out.println("Quantidade de pacientes: " + quantidadePacientes);
		System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
		System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "
				+ quantidadeMulheresAlturaPeso);
		System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + quantidadeIdade1825);
		System.out.println("Nome do paciente mais velho: " + nomeMaisVelho);
		System.out.println("Nome da mulher mais baixa: " + nomeMaisBaixa);

		sc.close();
	}
}
