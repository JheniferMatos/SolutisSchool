package Lista03;

import java.util.Scanner;

public class Ex8_RacionalParaReal {

    public static void main(String[] args) {
        int numerador, denominador=0;
        double numeroReal;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        numerador = s.nextInt();


        System.out.print("Digite o denominador: ");
        do {
            denominador = s.nextInt();
            if(denominador==0){
                System.out.println("Denominador nao pode ser 0! Digite outro valor.");
            }
        } while (denominador == 0);
        s.close();
        numeroReal= (double) numerador/denominador;
        System.out.println("A conversao de (" +numerador +"/" +denominador + ")  = " +numeroReal);
    }
}
