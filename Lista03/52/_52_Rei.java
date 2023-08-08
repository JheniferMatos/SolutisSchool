public class _52_Rei {
    public static void main(String[] args) {

        long quantityRice = 0;

        for (int i = 1; i <= 64; i++) {
            quantityRice += (long) Math.pow(2, i - 1);
        }

        System.out.println("Quantidade total: " + quantityRice);

        double quantidadeSacos = quantityRice / 64000.0; // Assumindo 64.000 grãos por saco
        System.out.println("Quantidade aproximada de sacos de arroz: " + quantidadeSacos);
    }
}
