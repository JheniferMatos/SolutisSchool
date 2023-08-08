/*Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, a idade e a altura.  Para sinalizar o fim da lista será fornecido “fim” no nome do último paciente.
Exiba um relatório contendo:
i.    a quantidade de pacientes.
ii.   a média de idade dos homens.
iii.  a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
iv.  a quantidade de pessoas com idade entre 18 e 25.
v.   o nome do paciente mais velho.
vi.  o nome da mulher mais baixa.
vii. – neste item, você cria uma situação interessante constrói o algoritmo correspondente.   
 */

import java.util.Scanner;

public class RelatorioClinica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadePacientes = 0;
        int totalIdadeHomens = 0;
        int quantidadeMulheresAltasPesoAcima70 = 0;
        int quantidadeIdadeEntre18e25 = 0;

        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;

        String nomeMulherMaisBaixa = "";
        double alturaMulherMaisBaixa = Double.MAX_VALUE;

        while (true) {
            System.out.print("Digite o nome do paciente (ou 'fim' para encerrar): ");
            String nome = sc.nextLine();
            if (nome.equals("fim")) {
                break;
            }

            System.out.print("Digite o sexo do paciente (M/F): ");
            String sexo = sc.nextLine();

            System.out.print("Digite o peso do paciente: ");
            double peso = sc.nextDouble();

            System.out.print("Digite a idade do paciente: ");
            int idade = sc.nextInt();

            System.out.print("Digite a altura do paciente: ");
            double altura = sc.nextDouble();

            sc.nextLine(); // Limpa o buffer do scanner após a leitura do número inteiro

            quantidadePacientes++;

            if (sexo.equalsIgnoreCase("M")) {
                totalIdadeHomens += idade;
            } else if (sexo.equalsIgnoreCase("F") && altura >= 1.60 && altura <= 1.70 && peso > 70) {
                quantidadeMulheresAltasPesoAcima70++;
            }

            if (idade >= 18 && idade <= 25) {
                quantidadeIdadeEntre18e25++;
            }

            if (idade > idadeMaisVelho) {
                nomeMaisVelho = nome;
                idadeMaisVelho = idade;
            }

            if (sexo.equalsIgnoreCase("F") && altura < alturaMulherMaisBaixa) {
                nomeMulherMaisBaixa = nome;
                alturaMulherMaisBaixa = altura;
            }
        }

        sc.close();

        System.out.println("Quantidade de pacientes: " + quantidadePacientes);
        System.out.println("Média de idade dos homens: " + (totalIdadeHomens / quantidadePacientes));
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "
                + quantidadeMulheresAltasPesoAcima70);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + quantidadeIdadeEntre18e25);
        System.out.println("Nome do paciente mais velho: " + nomeMaisVelho);
        System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa);

    }
}
