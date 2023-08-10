package Lista6._10_Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario[] funcionarios = criarFuncionarios();

        double custoTotal = 0;
        double rendaTotalBasica = 0;
        double rendaTotalMedio = 0;
        double rendaTotalSuperior = 0;

        for (Funcionario funcionario : funcionarios) {
            funcionario.calcularRendaTotal();

            if (funcionario instanceof FuncionarioEnsinoBasico) {
                rendaTotalBasica += funcionario.calcularRendaTotal();
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                rendaTotalMedio += funcionario.calcularRendaTotal();
            } else if (funcionario instanceof FuncionarioUniversidade) {
                rendaTotalSuperior += funcionario.calcularRendaTotal();
            }
            custoTotal = rendaTotalBasica + rendaTotalMedio + rendaTotalSuperior;

            System.out.println("\n" + funcionario);
        }

        System.out.println("\nCusto tota: " + custoTotal);
        System.out.println("Custo total por nível de escolaridade:");
        System.out.println("Ensino Básico: " + rendaTotalBasica);
        System.out.println("Ensino Médio: " + rendaTotalMedio);
        System.out.println("Nível Superior: " + rendaTotalSuperior);

    }
    public static Funcionario[] criarFuncionarios() {
        Funcionario[] funcionarios = new Funcionario[10];

        int qtdGerentes = 1;
        int qtdSupervisores = 2;
        int qtdVendedores = 7;

        for (int i = 0; i < qtdGerentes; i++) {
            funcionarios[i] = new FuncionarioUniversidade("Funcionario " + (i + 1), "CF" + (i + 1), "Escola Básica", "Escola Média", "Universidade");
        }

        for (int i = qtdGerentes; i < qtdGerentes + qtdSupervisores; i++) {
            funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario " + (i + 1), "CF" + (i + 1), "Escola Basica", "Escola Média");
        }

        for (int i = qtdGerentes + qtdSupervisores; i < qtdGerentes + qtdSupervisores + qtdVendedores; i++) {
            funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario " + (i + 1), "CF" + (i + 1), "Escola Básica");
        }

        return funcionarios;
    }
}
