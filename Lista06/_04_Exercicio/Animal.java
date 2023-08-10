package Lista6._04_Exercicio;

public abstract class Animal {

    private String name;
    private Integer idade;

    public Animal(String name, Integer idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public abstract void emitirSom();
}
