
public class Leao extends AnimalAB {

    private int quantidadeComida, quantidadeCaminho, quantidadeHoras;

    public Leao(String nome, String tipoAnimal, int idade, String habitat) {
        super(nome, tipoAnimal, idade, habitat);

    }

    @Override
    public void comer(int quantidadeComida) {
        this.quantidadeComida += quantidadeComida;
    }

    @Override
    public void moverse(double distancia) {
        this.quantidadeCaminho += distancia;
    }

    @Override
    public void dormir(int horas) {
        this.quantidadeHoras += horas;
    }

    public int getQuantidadeComida() {
        return this.quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public int getQuantidadeCaminho() {
        return this.quantidadeCaminho;
    }

    public void setQuantidadeCaminho(int quantidadeCaminho) {
        this.quantidadeCaminho = quantidadeCaminho;
    }

    public int getQuantidadeHoras() {
        return this.quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

}
