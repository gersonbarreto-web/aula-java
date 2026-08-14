import java.util.Scanner;

public class Desafio3 {
    
    public static void main(String[] args) {
        
        Scanner Cliente = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = Cliente.nextLine();

        System.out.print("Digite o nome do produto: ");
        String produto = Cliente.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = Cliente.nextInt();

        System.out.print("Digite o valor unitario:");
        double valorUnitario = Cliente.nextDouble();

double total = quantidade * valorUnitario;
        System.out.println("---------- NOTA FISCAL ----------");
        System.out.printf("Cliente: %s%n", nome);
        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Valor unitario: R$ %.2f%n", valorUnitario);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

        Cliente.close();       
    }
}
