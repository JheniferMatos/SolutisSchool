
public class Peixe extends AnimalMarinhoAB {

   
    private int quantidadeBarbatanas;

    public Peixe(String nome, int idade, String habitat, int quantidadeBarbatanas) {
        super(nome, "Peixe", idade, habitat, quantidadeBarbatanas);
        this.quantidadeBarbatanas = quantidadeBarbatanas;
    }
    
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void comer(int quantidadeComida) {
        System.out.println(getNome() + " comeu " + quantidadeComida + " unidades de comida.");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O peixe nadou " + distancia + " Km de distâncias");
    }
	 

    @Override
    public void dormir(int horas) {
        System.out.println("Dormiu ao total de " + horas + " horas.");
    }

    //getters
    public int getQuantidadeBarbatanas() {
        return this.quantidadeBarbatanas;
    }
    

    

}
