package D3;

public class ProdutoDigital extends Produto {

    public ProdutoDigital(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override
    public double realizarVenda(int quantidade) {
        return getPreco() * quantidade;
    }

    @Override
    public double realizarVenda(int quantidade, double percentualDesconto) {
        double subtotal = getPreco() * quantidade;
        double valorDesconto = subtotal * (percentualDesconto / 100.0);
        return subtotal - valorDesconto;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + " | Tipo: Digital (Sem Frete)";
    }
}