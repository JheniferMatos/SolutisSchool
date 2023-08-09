
public abstract class AnimalTerrestreAB extends AnimalAB{
    
    
	private double altura, peso;
    
    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas,
			double altura, double peso) {
		super(nome, tipoAnimal, idade, habitat);
		this.altura = altura;
		this.peso = peso;
	}

	public abstract void correr();

	@Override
    public void comer(int quantidadeComida) {
        System.out.println(getNome() + " está comendo.");
	}

    @Override
    public void moverse(double distancia) {
        System.out.println(getNome() + " se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        System.out.println(getNome() + " dormiu por " + horas + " horas.");
    }


	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	

}
