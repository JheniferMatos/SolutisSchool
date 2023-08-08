//Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros. A área de um círculo
//é ¶ multiplicado pelo raio elevado ao quadrado. Em Java o valor de ¶ está disponível em Math.PI

import java.util.Locale;
import java.util.Scanner;

public class _06_AreaCirculo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("A área do círculo, em metros quadrados é: %.3f%n", area);
    }
}
