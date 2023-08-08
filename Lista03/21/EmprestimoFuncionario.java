//Exiba o valor do empréstimo possível para um funcionário de uma empresa.
//Cargo      % do salário
//Diretoria   30%
//Gerência    25%
//Operacional 20%

import java.util.Scanner;

public class EmprestimoFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = sc.nextDouble();
        
        sc.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o cargo do funcionário: (Diretoria, Gerência ou Operacional) ");
        String cargo = sc.nextLine();

        double emprestimo = calcularEmprestimo(salario, cargo);

        if (emprestimo == 0) {
            System.out.println("Cargo inválido.");
        } else {
            System.out.printf("O valor do empréstimo é: R$ %.2f%n", emprestimo);
        }

        sc.close();
}

    public static double calcularEmprestimo(double salario, String cargo) {
        double emprestimo = 0;
        switch (cargo) {
            case "Diretoria":
                emprestimo = salario * 0.3;
                break;
            case "Gerência":
                emprestimo = salario * 0.25;
                break;
            case "Operacional":
                emprestimo = salario * 0.2;
                break;
        }
        return emprestimo;
    }

}