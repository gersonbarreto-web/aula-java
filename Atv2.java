import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero == 0) {
            System.out.println("O número é NULO (Zero).");
        } else if (numero % 2 != 0) {
            System.out.println("O número " + numero + " é ÍMPAR.");
        } else {
            System.out.println("O número " + numero + " é PAR.");
        }
        
        scanner.close(); 
    }
}