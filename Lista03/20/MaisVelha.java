//Solicite o nome e a idade de duas pessoas. Em seguida exiba o nome da pessoa mais velha e o nome da pessoa mais nova.

import java.util.Scanner;

public class MaisVelha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        String pessoaMaisVelha = idade1 > idade2 ? nome1 : nome2;
        String pessoaMaisNova = idade1 < idade2 ? nome1 : nome2;

        if (idade1 == idade2) {
            System.out.println("As duas pessoas têm a mesma idade.");
        } else {
            System.out.println("A pessoa mais velha é: " + pessoaMaisVelha);
            System.out.println("A pessoa mais nova é: " + pessoaMaisNova);
        }

        sc.close();
    }
}

