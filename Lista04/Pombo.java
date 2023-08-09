
public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, int idade, String habitat, int quantidadeAsas, double envergaduraAsas) {
        super(nome, idade, habitat, quantidadeAsas, envergaduraAsas); 
    }
    
    @Override
    public void comer(int quantidadeComida) {
        System.out.println(getNome() + " está comendo.");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println(getNome() + " se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        System.out.println(getNome() + " dormiu por " + horas + " horas.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando.");
    }
}



