package _05_Exercicio;

public class FuncionarioUniversidade extends FuncionarioEscolaridade {

    public FuncionarioUniversidade(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
        super(nome, codigoFuncional, escolaEnsinoBasico, escolaEnsinoMedio, universidade);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nCódigo Funcional: " + getCodigoFuncional()
                + "\nEscola de Ensino Básico: " + getEscolaEnsinoBasico()
                + "\nEscola Ensino Médio: " + getEscolaEnsinoMedio()
                + "\nUniversidade: " + getUniversidade();
    }
}
