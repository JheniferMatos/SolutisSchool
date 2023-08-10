package Lista6._01_Exercicio;

import Lista6._02_Exercicio.Animal;

public class Cavalo extends Animal {

    public Cavalo(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("r-r-r-r-rinhin");
    }

    @Override
    public void correr() {
        System.out.println("Cavalo correndo");
    }
}
