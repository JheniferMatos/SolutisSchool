package Lista03;

import java.util.Random;

public class Ex34_NumerosSorteados {
    public static void main(String[] args) {
        int numero;
        Random random = new Random();
        System.out.println("50 Numeros aleatorios entre 1-100");
        for (int i = 0; i < 50; i++) {
            numero = random.nextInt(100) + 1;
            System.out.print(numero + " ");
        }
    }
}
