import java.util.HashMap;

public abstract class Usuario {

    private String nome;
    private String id;
    private String cpf;
    private String dataDeNascimento;
    private HashMap<String, Compra> historicoDeCompras;
    private HashMap<String, Produto> listaDeDesejos;
    private HashMap<String, Cupom> cupons;

    public abstract boolean realizaCompra(String idProduto, int valorCompra);

    public abstract boolean cancelaCompra(String idProduto, int valorCompra);

    public abstract boolean adicionaItemCarrinho(int idProduto);

    public abstract boolean removeItemCarrinho(int idProduto);

    public abstract boolean resgataCupom(int idCupom);

    public abstract boolean utilizaCupom(int idCupom);

    public abstract String[] exibeCupons();

    public abstract String[] exibeHistoricoCompras();

    public abstract boolean adicionaItemListaDesejos(int idProduto);

    public abstract boolean removeItemListaDesejos(int idProduto);






}