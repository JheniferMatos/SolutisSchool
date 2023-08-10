package _06_Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o código funcional: ");
        String codigoFuncional = sc.nextLine();

        System.out.println("\n1 - Funcionário Sem Escolaridade");
        System.out.println("2 - Funcionário Ensino Básico");
        System.out.println("3 - Funcionário Ensino Médio");
        System.out.println("4 - Funcionário Graduado");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        Funcionario funcionario = null;

        switch (opcao) {
            case 1:
                funcionario = new FuncionarioSemEscolaridade(nome, codigoFuncional);
                break;
            case 2:
                System.out.print("Por favor, digite a escola de ensina básico: ");
                String basicoEnsinoBasico = sc.nextLine();
                funcionario = new FuncionarioEnsinoBasico(nome, codigoFuncional, basicoEnsinoBasico);
                break;
            case 3:
                System.out.print("Por favor, digite a escola de ensino básico: ");
                String medioEnsinoBasico = sc.nextLine();
                System.out.print("Por favor, digite a escola de ensino médio: ");
                String medioEnsinoMedio = sc.nextLine();
                funcionario = new FuncionarioEnsinoMedio(nome, codigoFuncional, medioEnsinoBasico , medioEnsinoMedio);
                break;
            case 4:
                System.out.print("Por favor, digite a escola de ensino básico: ");
                String graduadoEnsinoBasico = sc.nextLine();
                System.out.print("Por favor, digite a escola de ensino médio: ");
                String graduadoEnsinoMedio = sc.nextLine();
                System.out.print("Por favor, digite a universidade: ");
                String graduadoUniversidade = sc.nextLine();
                funcionario = new FuncionarioUniversidade(nome, codigoFuncional, graduadoEnsinoBasico, graduadoEnsinoMedio, graduadoUniversidade);
                break;
            default:
                System.out.println("Inválido");
        }

        System.out.println("\nInformações do funcionário: ");
        System.out.println(funcionario);
        sc.close();
    }
}
