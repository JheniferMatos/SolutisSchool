package Lista03;

import java.util.Scanner;

public class _30_RetanguloVertices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as coordenadas do primeiro retângulo:");
		double[] retangulo1 = lerRetangulo(sc);

		System.out.println("Digite as coordenadas do segundo retângulo:");
		double[] retangulo2 = lerRetangulo(sc);

		if (temIntersecao(retangulo1, retangulo2)) {
			System.out.println("Os retângulos se interceptam em algum lugar.");
		} else {
			System.out.println("Os retângulos não se interceptam.");
		}

		sc.close();
	}

	public static double[] lerRetangulo(Scanner sc) {
		double[] retangulo = new double[8];

		System.out.print("Digite o valor do ponto superior esquerdo (X1): ");
		retangulo[0] = sc.nextDouble();
		System.out.print("Digite o valor do ponto superior esquerdo (Y1): ");
		retangulo[1] = sc.nextDouble();

		System.out.print("Digite o valor do ponto superior direito (X2): ");
		retangulo[2] = sc.nextDouble();
		System.out.print("Digite o valor do ponto superior direito (Y2): ");
		retangulo[3] = sc.nextDouble();

		System.out.print("Digite o valor do ponto inferior esquerdo (X3): ");
		retangulo[4] = sc.nextDouble();
		System.out.print("Digite o valor do ponto inferior esquerdo (Y3): ");
		retangulo[5] = sc.nextDouble();

		System.out.print("Digite o valor do ponto inferior direito (X4): ");
		retangulo[6] = sc.nextDouble();
		System.out.print("Digite o valor do ponto inferior direito (Y4): ");
		retangulo[7] = sc.nextDouble();

		return retangulo;
	}

	public static boolean temIntersecao(double[] retangulo1, double[] retangulo2) {
		// Ordenar as coordenadas dos retângulos
		ordenarRetangulo(retangulo1);
		ordenarRetangulo(retangulo2);

		// Verificar se há interseção entre os retângulos
		return (retangulo1[2] >= retangulo2[0] && retangulo1[0] <= retangulo2[2]) && // Eixo X
				(retangulo1[7] >= retangulo2[5] && retangulo1[5] <= retangulo2[7]); // Eixo Y
	}

	public static void ordenarRetangulo(double[] retangulo) {
		// Ordenar em ordem crescente as coordenadas no eixo X e no eixo Y
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (retangulo[i * 2] > retangulo[j * 2]) {
					trocar(retangulo, i * 2, j * 2);
					trocar(retangulo, i * 2 + 1, j * 2 + 1);
				}
			}
		}
	}

	public static void trocar(double[] retangulo, int indice1, int indice2) {
		double temp = retangulo[indice1];
		retangulo[indice1] = retangulo[indice2];
		retangulo[indice2] = temp;
	}

}
