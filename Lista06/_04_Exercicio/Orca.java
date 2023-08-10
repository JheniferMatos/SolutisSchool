package Lista6._04_Exercicio;

public class Orca extends Animal{

    public Orca(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de orca");
    }
}
