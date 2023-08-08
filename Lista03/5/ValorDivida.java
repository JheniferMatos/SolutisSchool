//Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do débito, 
//a quantidade de meses e os juros mensais. Use o calculo de juros simples

import java.util.Scanner;

public class ValorDivida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial da dívida: R$ ");
        double valorInicial = sc.nextDouble();

        System.out.print("Digite a quantidade de meses: ");
        int meses = sc.nextInt();
        while (meses <= 0) {
            System.out.println("Quantidade de meses inválida. Digite um valor positivo.");
            meses = sc.nextInt();
        }

        System.out.print("Digite o juros mensal: ");
        double juros = sc.nextDouble();
        while (juros < 0) {
            System.out.println("Taxa de juros inválida. Digite um valor não negativo.");
            juros = sc.nextDouble();
        }

        double valorFinal = calcularValorFinal(valorInicial, meses, juros);

        System.out.printf("O valor final da dívida é: R$ %.2f%n", valorFinal);

        sc.close();
    }

    public static double calcularValorFinal(double valorInicial, int meses, double juros) {
        double valorFinal = valorInicial + (valorInicial * (juros / 100) * meses);
        return valorFinal;
    }
}
