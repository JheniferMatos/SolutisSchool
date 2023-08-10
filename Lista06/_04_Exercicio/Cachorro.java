package Lista6._04_Exercicio;


public class Cachorro extends Animal implements Correr {

    public Cachorro(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU!");
    }

    @Override
    public void correr() {
        System.out.println("O cachorro está correndo!");
    }
}
