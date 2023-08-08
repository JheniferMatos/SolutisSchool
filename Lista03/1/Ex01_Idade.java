package Lista03;

import java.util.Scanner;

public class Ex01_Idade {


    public static void main(String[] args) {

        int anoNascimento, anoAtual;


        Scanner s = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = s.nextInt();

        System.out.print("Digite o ano atual: ");
        anoAtual = s.nextInt();

        s.close();
        System.out.print("Idade: " + (anoAtual - anoNascimento));

    }

}
