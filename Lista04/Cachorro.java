package Lista04;
/*Crie as classes concertas Cachorro, Gato, Elefante, Leão que herdarão da classe
AnimalAB e sobrescreva os métodos abstratos comer, moverse, dormir; As
ações desses métodos consistem em alterar o estado interno do objeto através
dos atributos de instância que representam a quantidade de comida ingerida ao
comer, a quantidade de caminho percorrido ao moverse, e a quantidade de horas
ao dormir;*/

public class Cachorro extends AnimalAB  {

    private int quantidadeComida, quantidadeCaminho, quantidadeHoras;

    
    public Cachorro(String nome, int idade, String habitat, int quantidadePatas) {
        super(nome, "Cachorro", idade, habitat);
        this.quantidadeComida = 0;
    }

    public Cachorro(String nome, int idade) {
		super(nome, "Cachorro", idade, "Terrestre");
	}
   
    @Override
    public void comer(int quantidadeComida) {
        quantidadeComida += quantidadeComida;
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O cachorro " + "andou " + quantidadeCaminho + " metros.");
    }

    @Override
    public void dormir(int horas) {
        System.out.println("O cachorro " + "dormiu por " +  quantidadeHoras + " horas.");
    }
}
    
    
