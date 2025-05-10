public class Compra {

    private String id;
    private Produto produto;
    private String dataDaCompra;

    @Override
    public String toString() {
        return String.format("%s - %s - %s", id, produto.toString(), dataDaCompra);
    }

    
}
