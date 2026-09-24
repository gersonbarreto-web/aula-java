package D7;

public class ContaCorrente extends Conta implements Pagamento {

    public ContaCorrente(String numero, String titular, double saldoInicial, Agencia agencia) {
        super(numero, titular, saldoInicial, agencia);
    }

    
    private boolean eValido(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser maior que zero.");
            return false;
        }
        if (valor > getSaldo()) {
            System.out.println("Erro: Saldo insuficiente para realizar a operação.");
            return false;
        }
        return true;
    }


    @Override
    public void pagar(double valor) {
        if (eValido(valor)) {
            setSaldo(getSaldo() - valor);
            System.out.println("Pagamento em dinheiro realizado com sucesso.");
            consultarSaldo();
        }
    }
    public void pagar(double valor, String chavePix) {
        if (eValido(valor)) {
            setSaldo(getSaldo() - valor);
            System.out.println("Chave PIX utilizada: " + chavePix);
            System.out.println("Pagamento via PIX realizado com sucesso.");
            consultarSaldo();
        }
    }

    
    public void pagar(double valor, int parcelas) {
        if (parcelas <= 0) {
            System.out.println("Erro: A quantidade de parcelas deve ser maior que zero.");
            return;
        }
        if (eValido(valor)) {
            double valorParcela = valor / parcelas;
            setSaldo(getSaldo() - valor);
            System.out.printf("Pagamento no cartão realizado em %dx de R$ %.2f%n", parcelas, valorParcela);
            consultarSaldo();
        }
    }
}