package Lista04;

public class AnimalVoadorAB extends AnimalAB {
    
    private int quantidadeAssas;
    private double envergaduraAssa;


    public AnimalVoadorAB(String nome, int idade, String habitat, int quantidadeAsas, double envergaduraAsas) {
        super(nome, "Animal Voador", idade, habitat);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
    }
    
    public abstract void nadar();
    

    //Getters 

    /**
     * @return int return the quantidadeAssas
     */
    public int getQuantidadeAssas() {
        return quantidadeAssas;
    }



    /**
     * @return double return the envergaduraAssa
     */
    public double getEnvergaduraAssa() {
        return envergaduraAssa;
    }



}
