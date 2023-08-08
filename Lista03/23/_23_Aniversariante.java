import java.util.Scanner;

public class _23_Aniversariante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String name1 = sc.nextLine();
        System.out.print("Dia de nascimento: ");
        int day1 = sc.nextInt();
        System.out.print("Mês de nascimento: ");
        int month1 = sc.nextInt();

        System.out.println("Digite o nome da segunda pessoa:");
        sc.nextLine();
        String name2 = sc.nextLine();
        System.out.print("Dia de nascimento: ");
        int day2 = sc.nextInt();
        System.out.print("Mês de nascimento: ");
        int month2 = sc.nextInt();

        if (month1 < month2 || (month1 == month2 && day1 < day2)) {
            System.out.println("O primeiro aniversariante é: " + name1);
        } else if (month1 > month2 || day1 > day2) {
            System.out.println("O primeiro aniversariante é: " + name2);
        } else {
            System.out.println("As duas pessoas fazem aniversário na mesma data!");
        }
    }
}
