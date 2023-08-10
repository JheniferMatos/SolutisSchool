package Lista6._08_Exercicio;

public class Main {
    public static void main(String[] args) {

        ComissaoGerente comissaoGerente = new ComissaoGerente();
        ComissaoSupervisor comissaoSupervisor = new ComissaoSupervisor();
        ComissaoVendedor comissaoVendedor = new ComissaoVendedor();

        System.out.printf("Comissão GERENTE: R$ %.2f%n", comissaoGerente.getValor());
        System.out.printf("Comissão GERENTE: R$ %.2f%n", comissaoSupervisor.getValor());
        System.out.printf("Comissão GERENTE: R$ %.2f%n", comissaoVendedor.getValor());
    }
}
