//Decida se um aluno será aprovado, reprovado por nota ou reprovado por faltas. 
//Use o sistema de avaliação da FAESA. Pergunte ao usuário a quantidade de notas para 
//cálculo da média semestral, sendo que todas elas possuem o mesmo peso. 

import java.util.Scanner;

public class VerificarAprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas para cálculo da média semestral: ");
        int quantidadeNotas = sc.nextInt();

        System.out.print("Digite a média mínima para aprovação: ");
        double mediaMinimaAprovacao = sc.nextDouble();

        System.out.print("Digite o limite de faltas permitidas (em porcentagem): ");
        double limiteFaltas = sc.nextDouble();

        System.out.print("Digite a quantidade total de aulas no semestre: ");
        int totalAulas = sc.nextInt();

        double somaNotas = 0;


        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();
            somaNotas += nota;
        }

        System.out.print("Digite a quantidade de faltas do aluno: ");
        int faltas = sc.nextInt();

        sc.close();

        double mediaSemestral = somaNotas / quantidadeNotas;
        double percentualFaltas = (faltas * 100.0) / totalAulas;

        if (mediaSemestral >= mediaMinimaAprovacao && percentualFaltas < limiteFaltas) {
            System.out.println("Aluno aprovado!");
        } else if (percentualFaltas >= limiteFaltas) {
            System.out.println("Aluno reprovado por faltas.");
        } else {
            System.out.println("Aluno reprovado por nota.");
        }
    }
}

