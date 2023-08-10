package Lista6._10_Exercicio;

public class FuncionarioEnsinoMedio extends FuncionarioEscolaridade {

    public FuncionarioEnsinoMedio() {
    }

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, escolaEnsinoBasico, escolaEnsinoMedio, null);
    }

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, Double comissao) {
        super(nome, codigoFuncional, comissao);
    }

    @Override
    public double calcularRendaTotal() {
       double rendaBasica = getRenda() + getRenda() * 0.1;
       return rendaBasica + (rendaBasica * 0.5) + getComissao();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nCódigo Funcional: " + getCodigoFuncional()
                + "\nEscola de Ensino Básico: " + getEscolaEnsinoBasico()
                + "\nEscola Ensino Médio: " + getEscolaEnsinoMedio()
                + "\nRenda: " + calcularRendaTotal();
    }
}
