package Lista04;

public class Elefante extends AnimalAB {
    
    private int quantidadeComida;
    private int quantidadeCaminho;
    private int quantidadeHoras;

    @Override
    public void comer() {
        
        quantidadeComida++;
    }

    @Override
    public void moverse() {
        
        quantidadeCaminho++;
    }

    @Override
    public void dormir() {
        
        quantidadeHoras++;
    }
}
