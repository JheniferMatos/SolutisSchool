//Acrescente no exercício anterior a apresentação do signo do horóscopo da pessoa.

import java.util.Scanner;

public class DataAniversario3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] meses = {
            "", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
            "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.print("Digite o dia do seu aniversário: ");
        int dia = sc.nextInt();
        while (dia <= 0 || dia > 31) {
            System.out.println("Dia inválido. Digite um valor entre 1 e 31.");
            dia = sc.nextInt();
        }

        System.out.print("Digite o mês do seu aniversário: ");
        int mes = sc.nextInt();
        while (mes <= 0 || mes > 12) {
            System.out.println("Mês inválido. Digite um valor entre 1 e 12.");
            mes = sc.nextInt();
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Dia inválido para este mês.");
        }

        if (mes == 2) {
            if (dia > 29) {
                System.out.println("Dia inválido para Fevereiro.");
            }
            if (dia == 29) {
                System.out.println("Você nasceu em um ano bissexto!");
            }
        }

        String nomeMes = meses[mes];
        System.out.printf("O mês do seu aniversário é: %s%n", nomeMes);

        int trimestre = (mes - 1) / 3 + 1;
        System.out.printf("Você nasceu no %dº trimestre.%n", trimestre);

        String signo = obterSigno(dia, mes);
        System.out.printf("Seu signo do horóscopo é: %s%n", signo);

        sc.close();
    }

    public static String obterSigno(int dia, int mes) {
        String[] signos = {
            "", "Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos",
            "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio"
        };
        int[] limites = { 0, 20, 19, 21, 20, 21, 22, 23, 23, 23, 23, 22, 22, 20 };
        int limite = limites[mes];
        if (dia <= limite) {
            return signos[mes];
        } else {
            return signos[mes + 1];
        }
    }
}
