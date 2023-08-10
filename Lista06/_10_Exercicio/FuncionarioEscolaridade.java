package _10_Exercicio;

public abstract class FuncionarioEscolaridade extends Funcionario {

    private String escolaEnsinoBasico;
    private String escolaEnsinoMedio;
    private String universidade;

    public FuncionarioEscolaridade() {

    }

    public FuncionarioEscolaridade(String nome, String codigoFuncional, Double comissao) {
        super(nome, codigoFuncional, comissao);
    }

    public FuncionarioEscolaridade(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
        super(nome, codigoFuncional);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
        this.escolaEnsinoMedio = escolaEnsinoMedio;
        this.universidade = universidade;
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }

    public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

}
