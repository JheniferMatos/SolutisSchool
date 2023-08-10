package Lista6._02_Exercicio;

public class Cachorro extends Animal {


    public Cachorro(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU!");
    }

    @Override
    public void correr() {
        System.out.println("Cachorro correndo");
    }
}
