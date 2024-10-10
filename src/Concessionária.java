/**
 * @author Antonio
 */

public class Concessionária {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Cliente.setNome("Jessica");

        Vendedor.setNome("Cleito");
        Vendedor.setCodigo(2);

        Carro.setMarca("Porshe");
        Carro.setEstilo("Cayene 911");
        Carro.setCor("Preto");

        System.out.println(Cliente.getNome());

        System.out.println(Vendedor.getNome());
        System.out.println(Vendedor.getCodigo());

        System.out.println(Carro.getMarca());
        System.out.println(Carro.getEstilo());
        System.out.println(Carro.getCor());
    }

}
