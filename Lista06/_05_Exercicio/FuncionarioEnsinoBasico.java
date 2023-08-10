package _05_Exercicio;

public class FuncionarioEnsinoBasico extends FuncionarioEscolaridade{

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaEnsinoBasico) {
        super(nome, codigoFuncional, escolaEnsinoBasico, null, null);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nCódigo Funcional: " + getCodigoFuncional()
                + "\nEscola de Ensino Básico: " + getEscolaEnsinoBasico();
    }
}
