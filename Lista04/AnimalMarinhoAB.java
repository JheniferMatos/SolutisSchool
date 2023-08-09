package Lista04;
/* Crie uma classe Peixe e Pombo. De quem vamos herdar? Um peixe nada e um
pombo voa então os métodos nadar e voar devem estar na classe abstrata
Animal? Não. Então criem uma classe abstrata AnimalMarinhoAB
,AnimalVoadorAB, AnimalTerrestreAB que implementa a classe abstrata
AnimalAB para representar a classe abstrata para animais marinhos e aéreos
“que voam”.*/

public abstract class AnimalMarinhoAB extends AnimalAB {
    
    private int quantidadeNadadeiras;

    public AnimalMarinhoAB(String nome, int idade, String habitat, int quantidadeNadadeiras) {
        super(nome, "Animal Marinho", idade, habitat);
        this.quantidadeNadadeiras = quantidadeNadadeiras;
    }

    public abstract void nadar();


}
