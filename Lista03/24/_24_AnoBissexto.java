import java.util.Scanner;

public class _24_AnoBissexto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int day = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int month = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int year = scanner.nextInt();

        boolean isValid = isValidDate(day, month, year);

        if (isValid) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }

        scanner.close();
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        } else {
            return day <= 31;
        }
    }
}

