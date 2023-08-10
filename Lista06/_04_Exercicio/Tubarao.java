package _04_Exercicio;

public class Tubarao extends Animal {

    public Tubarao(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de tubarao");
    }
}
