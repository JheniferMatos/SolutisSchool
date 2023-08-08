//Determine a quantidade de homens e mulheres (separadamente) que são maiores de idade, 
//baseado numa lista de 200 pessoas.

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        int maiorIdade = 18;
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 200; i++) {
            System.out.print("Digite o sexo da pessoa (M/F): ");
            String sexo = sc.nextLine();

            System.out.print("Digite a idade da pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do scanner após a leitura do número inteiro

            if (sexo.equals("M") && idade >= maiorIdade) {
                quantidadeHomens++;
            } else if (sexo.equals("F") && idade >= maiorIdade) {
                quantidadeMulheres++;
            }
        }

        sc.close();

        System.out.println("Quantidade de homens maiores de idade: " + quantidadeHomens);
        System.out.println("Quantidade de mulheres maiores de idade: " + quantidadeMulheres);
    }
}
