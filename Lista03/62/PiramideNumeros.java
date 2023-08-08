
import java.util.Scanner;

public class PiramideNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da pirâmide:");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", i);
            }
            // Quebra de linha 
            System.out.println();
        }

        sc.close();
    }
}
