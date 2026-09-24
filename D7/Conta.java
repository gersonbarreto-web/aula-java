package D7;
public class Conta {
    private String numero;
    private String titular;
    private double saldo;
    private Agencia agencia;

    public Conta(String numero, String titular, double saldoInicial, Agencia agencia) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
            return;
        }
        this.saldo += valor;
        System.out.printf("Depósito realizado! Saldo atualizado: R$ %.2f%n", this.saldo);
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
    }

    public void mostrarDadosCompletos() {
        agencia.mostrarDados();
        System.out.println("Número da Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
    

