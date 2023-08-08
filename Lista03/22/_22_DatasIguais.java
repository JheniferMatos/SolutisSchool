import java.util.Scanner;

public class _22_DatasIguais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Data de aniversário da 1ª pessoa:");
        System.out.print("Dia: ");
        int day1 = sc.nextInt();
        System.out.print("Mês: ");
        int month1 = sc.nextInt();

        System.out.println("Data de aniversário da 2ª pessoa:");
        System.out.print("Dia: ");
        int day2 = sc.nextInt();
        System.out.print("Mês: ");
        int month2 = sc.nextInt();

        if (day1 == day2 && month1 == month2) {
            System.out.println("As datas de aniversário são iguais!");
        } else {
            System.out.println("As datas de aniversário são diferentes.");
        }
    }
}
