package _04_Exercicio;

public class Cavalo extends Animal implements Correr {

    public Cavalo(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("r-r-r-r-rinhin");
    }

    @Override
    public void correr() {
        System.out.println("Cavalo está correndo");
    }
}
