package _10_Exercicio;

public class FuncionarioUniversidade extends FuncionarioEscolaridade {

    public FuncionarioUniversidade(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
        super(nome, codigoFuncional, escolaEnsinoBasico, escolaEnsinoMedio, universidade);
    }

    public FuncionarioUniversidade(String nome, String codigoFuncional, Double comissao) {
        super(nome, codigoFuncional, comissao);
    }

    @Override
    public double calcularRendaTotal() {
        double rendaBasico = getRenda() + getRenda() * 0.1; // Renda do ensino básico + 10%
        double rendaMedio = rendaBasico + rendaBasico * 0.5; // Renda do ensino médio + 50%
        return rendaMedio + rendaMedio + getComissao(); // Renda da universidade + 100%
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nCódigo Funcional: " + getCodigoFuncional()
                + "\nEscola de Ensino Básico: " + getEscolaEnsinoBasico()
                + "\nEscola Ensino Médio: " + getEscolaEnsinoMedio()
                + "\nUniversidade: " + getUniversidade()
                + "\nRenda: " + calcularRendaTotal();
    }
}
