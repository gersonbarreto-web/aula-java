package ORINTADA_OBJETO_JAVA;

public class assunto_1 {

    public static void mensagem() {
        System.out.println("Seja bem-vindo!");
    }

    // com parametro e sem retorno
    public static void mostranome(String nome) {
        System.out.println("Seu nome é: " + nome);
    }
    // sem parametro e com retorno
    public static int obterNumero() {
        return 10;
    }
    // com parametro e com retorno
    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        mensagem();
        mostranome("carlos");
        int numero = obterNumero();
        System.out.println("O número obtido é: " + numero);
        int resultado = somar(10, 5);
        System.out.println("O resultado da soma é: " + resultado);
    }
}

