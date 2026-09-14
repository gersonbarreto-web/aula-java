package ATVSistema;
public class Contato1 {
    private String nome;
    private String numero;

    public Contato1(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String exibirDados() {
        return "Nome: " + nome + ", Número: " + numero;
    }
}
