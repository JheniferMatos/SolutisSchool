package _07_Exercicio;

public class Main {
    public static void main(String[] args) {
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

        for (int i = 0; i < 4; i++) {
            funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario " + (i + 1), "C" + (i + 1), "Básica");
        }

        for (int i = 4; i < 8; i++) {
            funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario " + (i + 1), "C" + (i + 1), "Básica", "Média");
        }

        for (int i = 8; i < 10; i++) {
            funcionarios[i] = new FuncionarioUniversidade("Funcionario " + (i + 1), "C" + (i + 1), "Básica", "Média", "Universidade");
        }
        return funcionarios;

       
    }
}
