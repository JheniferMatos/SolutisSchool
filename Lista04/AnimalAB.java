
/*Crie uma classe abstrata AnimalAB que implementa a interface AnimalIF e define os métodos abstratos assinados na interface.
nome
tipoAnimal
idade
habitat
quantidade de patas 
*/

public abstract class AnimalAB implements AnimalIF {
    
    private String nome, tipoAnimal, habitat;
    private int idade, quantidadePatas;


    public AnimalAB(String nome, String tipoAnimal, String habitat, int idade, int quantidadePatas) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.habitat = habitat;
        this.idade = idade;
        this.quantidadePatas = quantidadePatas;
    }
    


    public AnimalAB(String nome2, String string, int idade2, String habitat2) {
    }



    public abstract void comer(int quantidadeComida);
    public abstract void moverse(double distancia);
    public abstract void dormir(int horas);

    
    //Getter e Setters

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }


    /**
     * @return String return the tipoAnimal
     */
    public String getTipoAnimal() {
        return tipoAnimal;
    }


    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }


    /**
     * @return String return the habitat
     */
    public String getHabitat() {
        return habitat;
    }


    /**
     * @return int return the quantidadePatas
     */
    public int getQuantidadePatas() {
        return quantidadePatas;
    }

 

}
