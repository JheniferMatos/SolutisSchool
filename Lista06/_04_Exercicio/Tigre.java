package Lista6._04_Exercicio;

public class Tigre extends Animal implements Correr {

    public Tigre(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Grrrrrrrr");
    }

    @Override
    public void correr() {
        System.out.println("Tigre está correndo");
    }
}
