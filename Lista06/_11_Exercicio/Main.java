package Lista6._11_Exercicio;

import Lista6._06_Exercicio.Funcionario;
import Lista6._06_Exercicio.FuncionarioEnsinoBasico;
import Lista6._06_Exercicio.FuncionarioEnsinoMedio;
import Lista6._06_Exercicio.FuncionarioUniversidade;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 4; i++) {
            funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario " + (i + 1), "C" + (i + 1), "Escola Básica");
        }

        for (int i = 4; i < 8; i++) {
            funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario " + (i + 1), "C" + (i + 1), "Escola Média", "Escola Básica");
        }

        for (int i = 8; i < 10; i++) {
            funcionarios[i] = new FuncionarioUniversidade("Funcionario " + (i + 1), "C" + (i + 1), "Escola Básica", "Escola Média", "Universidade");
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println("\n" + funcionario.toString());
        }
    }
}

