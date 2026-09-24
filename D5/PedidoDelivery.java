package D5;

public class PedidoDelivery extends Pedido {
    private String endereco;
    private double taxaEntrega;

    public PedidoDelivery(int numeroPedido, String nomeCliente, double valorPedido, String endereco, double taxaEntrega) {
        super(numeroPedido, nomeCliente, valorPedido);
        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

  
    public double getValorTotalDelivery() {
        return getValorPedido() + taxaEntrega;
    }

    @Override
    public String exibeDados() {
        return "[DELIVERY] " + super.exibeDados() + 
               " | Taxa de Entrega: R$ " + String.format("%.2f", taxaEntrega) + 
               " | Valor Total: R$ " + String.format("%.2f", getValorTotalDelivery()) + 
               " | Endereço: " + endereco;
    }
}