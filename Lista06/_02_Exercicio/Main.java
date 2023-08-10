package Lista6._02_Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();

        list.add(new Cachorro("Rex", 2));
        list.add(new Cavalo("Pé-de-pano", 5));
        list.add(new Preguica("Preguiça", 1));

        for(Animal animal : list) {
            animal.emitirSom();
        }

    }
}
