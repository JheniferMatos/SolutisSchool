import java.util.Scanner;

public class _64_PiramideNumerica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de linhas: ");
        int numLines = scanner.nextInt();

        drawPyramid(numLines);

        scanner.close();
    }

    public static void drawPyramid(int numLines) {
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }
    }
}

