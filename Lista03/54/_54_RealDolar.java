import java.text.DecimalFormat;
import java.util.Scanner;

public class _54_RealDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial em reais: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Digite o valor final em reais: ");
        double finalValue = scanner.nextDouble();

        System.out.print("Digite o valor do incremento: ");
        double increment = scanner.nextDouble();

        System.out.print("Digite o valor do dolar em real ");
        double dollarValue = scanner.nextDouble();

        printConversionTable(initialValue, finalValue, increment, dollarValue);

        scanner.close();
    }

    public static void printConversionTable(double initialValue, double finalValue, double increment, double dollarValue) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println("Tabela de conversão:");
        System.out.println("Reais     Dollars");

        for (double reais = initialValue; reais <= finalValue; reais += increment) {
            double dollars = reais / dollarValue;
            System.out.println(decimalFormat.format(reais) + "     " + decimalFormat.format(dollars));
        }
    }
}
