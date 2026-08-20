import java.util.Scanner;

public class desafioD2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um numero positivo (ou um negativo para sair):");
            numero = sc.nextInt();

            if (numero >= 0) {
                System.out.println("Voce digitou: " + numero);
            }

        } while (numero >= 0); 

        System.out.println("Numero negativo digitado. Programa encerrado!");
        
        sc.close();
    }
}
