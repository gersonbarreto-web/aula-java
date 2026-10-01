public class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public Conta(String numero, String titular, double saldo) throws ExcecaoDadoInvalido {
        setNumero(numero);
        setTitular(titular);
        setSaldo(saldo);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws ExcecaoDadoInvalido {
        if (numero == null || numero.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("Erro: O número da conta é obrigatório.");
        }
        this.numero = numero.trim();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) throws ExcecaoDadoInvalido {
        if (titular == null || titular.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("Erro: O nome do titular é obrigatório.");
        }
        this.titular = titular.trim();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws ExcecaoDadoInvalido {
        if (saldo < 0) {
            throw new ExcecaoDadoInvalido("Erro: O saldo inicial não pode ser negativo.");
        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + " | Conta: " + numero + " | Saldo: R$ " + String.format("%.2f", saldo);
    }
}