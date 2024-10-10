public class Vendedor {

    private static String nome;

    private static int codigo;

    private static int comissao;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Vendedor.nome = nome;
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Vendedor.codigo = codigo;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        Vendedor.comissao = comissao;
    }
}
