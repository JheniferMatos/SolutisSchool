package Lista6._09_Exercicio;

public class FuncionarioSemEscolaridade extends Funcionario {

    public FuncionarioSemEscolaridade(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public double calcularRendaTotal() {
        return getRenda();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nCódigo Funcional: " + getCodigoFuncional()
                + "\nRenda: " + getRenda();

    }
}
