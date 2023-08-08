import java.util.Scanner;

public class _51_Tribonaci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade desejada na sequência de Tribonacci?");
        int n = sc.nextInt();

        int term1 = 1, term2 = 1, term3 = 2;

        System.out.print(term1 + " " + term2 + " " + term3 + " ");

        for (int i = 3; i < n; i++) {
            int nextTerm = term1 + term2 + term3;
            System.out.print(nextTerm + " ");
            term1 = term2;
            term2 = term3;
            term3 = nextTerm;
        }
    }
}

