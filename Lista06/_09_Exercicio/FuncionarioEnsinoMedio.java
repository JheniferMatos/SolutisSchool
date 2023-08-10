package _09_Exercicio;

public class FuncionarioEnsinoMedio extends FuncionarioEscolaridade {

    public FuncionarioEnsinoMedio() {
    }

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, escolaEnsinoBasico, escolaEnsinoMedio, null);
    }

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
    }

    @Override
    public double calcularRendaTotal() {
       double rendaBasica = getRenda() + getRenda() * 0.1;
       return rendaBasica + (rendaBasica * 0.5) + getComissao().getValor();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nCódigo Funcional: " + getCodigoFuncional()
                + "\nRenda: " + calcularRendaTotal();
    }
}
