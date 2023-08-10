package Lista6._01_Exercicio;

import Lista6._02_Exercicio.Animal;

public class Preguica extends Animal {

    public Preguica(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Zzzzz");
    }

    public void subirEmArvore() {
        System.out.println("Subindo em arvore");
    }
}
