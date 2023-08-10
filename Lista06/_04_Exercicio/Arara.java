package _04_Exercicio;

public class Arara extends Animal{
    public Arara(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Arara");
    }
}
