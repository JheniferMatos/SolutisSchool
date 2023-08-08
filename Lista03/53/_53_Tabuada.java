import java.util.Scanner;

public class _53_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int number = scanner.nextInt();

        displayMultiplicationTable(number);

        scanner.close();
    }

    public static void displayMultiplicationTable(int number) {
        System.out.println("Tabuada do numero " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
    }

