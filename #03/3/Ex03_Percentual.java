package Lista03;

import java.util.Scanner;

public class Ex03_Percentual {


    public static void main(String[] args) {
        int quantidadeHomens, quantidadeMulheres, quantidadeTotal;
        double percentualHomens, percentualMulheres;

        Scanner s = new Scanner(System.in);
        System.out.print("Digite a quantidade de homens na sala: ");
        quantidadeHomens=s.nextInt();
        System.out.print("Digite a quantidade de mulheres na sala: ");
        quantidadeMulheres=s.nextInt();

        quantidadeTotal=quantidadeHomens+quantidadeMulheres;
        percentualHomens=100*((double) quantidadeHomens /quantidadeTotal);
        percentualMulheres= 100*(double) quantidadeMulheres/quantidadeTotal;

        String percentualHomensFormatado = String.format("%.0f", percentualHomens);
        String percentualMulheresFormatado = String.format("%.0f", percentualMulheres);


        System.out.println("Percentual de homens: " +percentualHomensFormatado + "%");
        System.out.println("Percentual de mulheres: " +percentualMulheresFormatado + "%");

        s.close();
    }
}


