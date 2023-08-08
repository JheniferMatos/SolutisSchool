package Lista03;

import java.util.Scanner;

public class Ex02_SalariosMinimos {
    public static void main(String[] args) {

        double salario, salarioMinimo;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor do seu salario: ");
        salario = s.nextDouble();
        System.out.print("Digite o valor do salario minimo atual: ");
        salarioMinimo = s.nextDouble();
        System.out.print("A quantidade de salarios minimos referente ao seu salario e: " + (salario / salarioMinimo) + "x");
        s.close();

    }
}
