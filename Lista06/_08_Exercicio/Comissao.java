package _08_Exercicio;
public abstract class Comissao {

    double valor;

    public Comissao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
