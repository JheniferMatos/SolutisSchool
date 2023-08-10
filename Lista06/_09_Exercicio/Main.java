package Lista6._09_Exercicio;

public class Main {
    public static void main(String[] args) {

        ComissaoGerente gerente = new ComissaoGerente();
        ComissaoSupervisor supervisor = new ComissaoSupervisor();
        ComissaoVendedor vendedor = new ComissaoVendedor();

        FuncionarioEnsinoBasico ensinoBasico = new FuncionarioEnsinoBasico("Lucas", "1", vendedor );
        FuncionarioEnsinoMedio ensinoMedio = new FuncionarioEnsinoMedio("Maycon", "2", supervisor);
        FuncionarioUniversidade universidade = new FuncionarioUniversidade("Renato", "3", gerente);

        System.out.println("\n" + ensinoBasico);
        System.out.println("\n" + ensinoMedio);
        System.out.println("\n" + universidade);

    }
}
