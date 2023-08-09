
public class Elefante extends AnimalAB {
    
    private int quantidadeComida, quantidadeCaminho, quantidadeHoras;

    public Elefante(String nome, String tipoAnimal, int idade, String habitat) {
        super(nome, "Elefante", idade, habitat);
    }

    public Elefante(String nome, int idade) {
		
		super(nome, "Elefante", idade, "Terrestre");
		this.quantidadeComida=0;
		this.quantidadeCaminho=0;
		this.quantidadeHoras=0;
	}

    //Getters e Setters
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
