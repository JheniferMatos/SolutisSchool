package Lista03;

import java.util.Random;
import java.util.Scanner;

public class Ex35_SorteioUsuario {
    public static void main(String[] args) {
        int quantidadeNumeros, rangeInicio, rangeFim, numero;
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        do {
            System.out.print("Digite a quantidade de numeros para sortear: ");
            quantidadeNumeros = s.nextInt();
            if (quantidadeNumeros <= 0) {
                System.out.print("Digite um valor positivo!");
            }

        } while (quantidadeNumeros <= 0);

        System.out.print("Digite o valor range inicial: ");
        rangeInicio = s.nextInt();

        System.out.print("Digite o valor de range final: ");
        rangeFim = s.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            numero = random.nextInt(rangeInicio, rangeFim + 1);
            System.out.print(numero + " ");
        }
        s.close();

    }

}
