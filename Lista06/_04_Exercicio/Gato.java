package _04_Exercicio;

public class Gato extends Animal implements Correr {

    public Gato(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miauuu");
    }

    @Override
    public void correr() {
        System.out.println("Gato está correndo");
    }
}
