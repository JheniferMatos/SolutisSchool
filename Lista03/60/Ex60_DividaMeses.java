package Lista03;

import java.util.Scanner;

public class Ex60_DividaMeses {
    public static void main(String[] args) {
        int mes = 1, ano = 2007, quantidadeAnos, quantidadeMeses;
        double dividaInicial, taxaCorrecao, divida;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor da divida: ");
        dividaInicial = s.nextDouble();

        System.out.print("Digite a taxa de correcao (% ao mes): ");
        taxaCorrecao = s.nextDouble() / 100.0;

        System.out.print("Digite a quantidade de anos: ");
        quantidadeAnos = s.nextInt();

        quantidadeMeses = quantidadeAnos * 12;
        divida = dividaInicial;

        System.out.println("\nMes\tAno\tValor da Divida");
        System.out.printf("%d\t%d\tR$ %.2f\n", mes, ano, divida);

        for (mes = 2; mes <= quantidadeMeses; mes++) {
            ano = (mes - 1) / 12 + 2007;
            divida *= (1 + taxaCorrecao);
            System.out.printf("%d\t%d\tR$ %.2f\n", mes, ano, divida);
        }
        s.close();
    }


}
