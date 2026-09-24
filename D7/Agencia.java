package D7;
public class Agencia {
    private String numero;
    private String nome;

    public Agencia(String numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void mostrarDados() {
        System.out.println("Número da Agência: " + numero);
        System.out.println("Nome da Agência: " + nome);
    }
}