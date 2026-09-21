package D5;
public abstract class Pedido implements PagamentoPCD {
    private int numeroPedido;
    private String nomeCliente;
    private double valorPedido;

    public Pedido(int numeroPedido, String nomeCliente, double valorPedido) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.valorPedido = valorPedido;
    }

   
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f efetuado em DINHEIRO com sucesso!\n", valor);
    }

    @Override
    public void pagar(double valor, String chavePix) {
        System.out.printf("Pagamento de R$ %.2f efetuado via PIX (Chave: %s) com sucesso!\n", valor, chavePix);
    }

    @Override
    public void pagar(double valor, int parcelas) {
        double valorParcela = valor / parcelas;
        System.out.printf("Pagamento de R$ %.2f efetuado em %dx de R$ %.2f no CARTÃO com sucesso!\n", 
                valor, parcelas, valorParcela);
    }

    public String exibeDados() {
        return "Nº Pedido: " + numeroPedido + " | Cliente: " + nomeCliente + 
               " | Valor do Pedido: R$ " + String.format("%.2f", valorPedido);
    }
}