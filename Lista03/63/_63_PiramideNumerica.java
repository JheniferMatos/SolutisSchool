import java.util.Scanner;

public class _63_PiramideNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numLines = scanner.nextInt();

        drawPyramid(numLines);

        scanner.close();
    }

    public static void drawPyramid(int numLines) {
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", i);
            }
            System.out.println();
        }
    }
}

