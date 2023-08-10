package Lista6._03_Exercicio;

public class Veterinario {

    public void examinar(Animal animal) {
        System.out.println("Examinando o animal..." + animal.getName());
        animal.emitirSom();
        System.out.println();
    }
}
