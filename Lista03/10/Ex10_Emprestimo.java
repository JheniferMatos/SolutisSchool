package Lista03;

import java.util.Scanner;

public class Ex10_Emprestimo {

    public static void main(String[] args) {


        double salarioBruto = 0, salarioLiquido, descontos, valorEmprestimo;
        Scanner s = new Scanner(System.in);

        do {
            System.out.print("Digite o valor do seu salario: ");
            salarioBruto = s.nextDouble();
        } while (salarioBruto < 0);

        System.out.print("Digite o valor dos descontos: ");
        descontos = s.nextDouble();

        salarioLiquido = salarioBruto - descontos;

        System.out.print("Digite o valor esperado do emprestimo: ");
        valorEmprestimo = s.nextDouble();

        if (salarioLiquido * 0.3 >= valorEmprestimo) {
            System.out.println("Emprestimo Autorizado!");
        } else {
            System.out.println("Emprestimo nao autorizado! ");
        }

    s.close();

    }


}
