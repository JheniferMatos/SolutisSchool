package _07_Exercicio;

public class FuncionarioEnsinoBasico extends FuncionarioEscolaridade {

    public FuncionarioEnsinoBasico() {
    }

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaEnsinoBasico) {
        super(nome, codigoFuncional, escolaEnsinoBasico, null, null);
    }

    @Override
    public double calcularRendaTotal() {
        return getRenda() + getRenda() * 0.1;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nCódigo Funcional: " + getCodigoFuncional()
                + "\nEscola de Ensino Básico: " + getEscolaEnsinoBasico()
                +"\nRenda: " + calcularRendaTotal();
    }
}
