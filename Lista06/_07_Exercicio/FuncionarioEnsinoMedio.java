package Lista6._07_Exercicio;

public class FuncionarioEnsinoMedio extends FuncionarioEscolaridade {

    public FuncionarioEnsinoMedio() {
    }

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, escolaEnsinoBasico, escolaEnsinoMedio, null);
    }

    @Override
    public double calcularRendaTotal() {
       double rendaBasica = getRenda() + getRenda() * 0.1;
       return rendaBasica + rendaBasica * 0.5;
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
