
public abstract class AnimalVoadorAB extends AnimalAB {
    
    private int quantidadeAsas;
    private double envergaduraAsas;


    public AnimalVoadorAB(String nome, int idade, String habitat, int quantidadeAsas, double envergaduraAsas) {
        super(nome, "Animal Voador", idade, habitat);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
    }
    
    public abstract void voar();

    // Getters

    public int getQuantidadeAssas() {
        return quantidadeAsas;
    }

    public double getEnvergaduraAssa() {
        return envergaduraAsas;
    }




}
