package _04_Exercicio;
public class Leao extends Animal implements Correr{

    public Leao(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("GRRRRRRRRRRRRRR");
    }

    @Override
    public void correr() {
        System.out.println("Leão correndo");
    }
}
