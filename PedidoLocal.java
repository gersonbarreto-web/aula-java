package D5;
public class PedidoLocal extends Pedido {

    public PedidoLocal(int numeroPedido, String nomeCliente, double valorPedido) {
        super(numeroPedido, nomeCliente, valorPedido);
    }

    @Override
    public String exibeDados() {
        return "[LOCAL] " + super.exibeDados();
    }
}
