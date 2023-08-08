package Lista03;

import java.util.Scanner;

public class _14_Mes {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o nome do mês: ");
	        String nomeMes = sc.nextLine();

	        int numeroMes = -1; 

	        if (nomeMes.equalsIgnoreCase("janeiro")) {
	            numeroMes = 1;
	        } else if (nomeMes.equalsIgnoreCase("fevereiro")) {
	            numeroMes = 2;
	        } else if (nomeMes.equalsIgnoreCase("março")) {
	            numeroMes = 3;
	        } else if (nomeMes.equalsIgnoreCase("abril")) {
	            numeroMes = 4;
	        } else if (nomeMes.equalsIgnoreCase("maio")) {
	            numeroMes = 5;
	        } else if (nomeMes.equalsIgnoreCase("junho")) {
	            numeroMes = 6;
	        } else if (nomeMes.equalsIgnoreCase("julho")) {
	            numeroMes = 7;
	        } else if (nomeMes.equalsIgnoreCase("agosto")) {
	            numeroMes = 8;
	        } else if (nomeMes.equalsIgnoreCase("setembro")) {
	            numeroMes = 9;
	        } else if (nomeMes.equalsIgnoreCase("outubro")) {
	            numeroMes = 10;
	        } else if (nomeMes.equalsIgnoreCase("novembro")) {
	            numeroMes = 11;
	        } else if (nomeMes.equalsIgnoreCase("dezembro")) {
	            numeroMes = 12;
	        }

	        if (numeroMes != -1) {
	            System.out.println("O mês " + nomeMes + " é o mês número " + numeroMes);
	        } else {
	            System.out.println("Mês inválido!");
	        }

	        sc.close();
	    }
	}
