public class Carro {
    private static String marca;

    private static String estilo;

    private static String cor;

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Carro.marca = marca;
    }

    public static String getEstilo() {
        return estilo;
    }

    public static void setEstilo(String estilo) {
        Carro.estilo = estilo;
    }

    public static String getCor() {
        return cor;
    }

    public static void setCor(String cor) {
        Carro.cor = cor;
    }
}