package _04_Exercicio;

public class Main {
    public static void main(String[] args) {

        Animal[] jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Rex",2);
        jaulas[1] = new Gato("Friex", 2);
        jaulas[2] = new Cavalo("Pé-de-pano", 3);
        jaulas[3] = new Preguica("Preguiça", 2);
        jaulas[4] = new Tigre("Tirica", 1);
        jaulas[5] = new Leao("Simba", 1);
        jaulas[6] = new Orca("Free-willy", 1);
        jaulas[7] = new Tubarao("Ossae", 7);
        jaulas[8] = new Aguia("Aguia", 7);
        jaulas[9] = new Arara("Arara", 7);

        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                animalCorredor(animal);
                System.out.println();
            }
        }
    }

    private static void animalCorredor(Animal animal) {
        if (animal instanceof Correr) {
            ((Correr) animal).correr();
        }
    }
}
