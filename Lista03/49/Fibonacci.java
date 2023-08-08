//Exiba os 50 primeiros números da seqüência de Fibonacci (1,1,2,3,5,8,13,21,34,55,89,144,233,377,...).

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;

        int a = 1;
        int b = 1;

        System.out.print("Os primeiros " + n + " números da sequência de Fibonacci são: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println();

    }
}
