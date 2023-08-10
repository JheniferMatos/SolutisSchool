package Lista6._07_Exercicio;
public abstract class Funcionario {

    private String nome;
    private String codigoFuncional;
    private Double renda = 1000.0;

    public Funcionario() {
    }

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public Double getRenda() {
        return renda;
    }
    public abstract double calcularRendaTotal();
}
