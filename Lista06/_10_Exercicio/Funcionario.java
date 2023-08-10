package _10_Exercicio;

public abstract class Funcionario {

    private String nome;
    private String codigoFuncional;
    private Double renda = 1000.0;
    private Double comissao = 0d;

    public Funcionario() {
    }

    public Funcionario(String nome, String codigoFuncional, Double comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
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

    public Double getComissao() {
        if (this instanceof FuncionarioEnsinoBasico) {
            this.comissao = 250.0;
        } else if (this instanceof FuncionarioEnsinoMedio) {
            this.comissao = 600.0;
        } else if (this instanceof FuncionarioUniversidade) {
            this.comissao = 1500.0;
        }
        return comissao;
    }
    public abstract double calcularRendaTotal();
}
