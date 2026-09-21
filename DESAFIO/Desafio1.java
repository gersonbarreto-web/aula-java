import java.util.Scanner;

public class Desafio1 {
    
    public static void main(String[] args) {
                 
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto= teclado.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = teclado.nextInt();

        System.out.print("Digite o preço: ");
        double preco = teclado.nextDouble();        

        System.out.printf("produto: %s%n", produto);
        
        System.out.printf("quantidade: %d%n", quantidade);
        
        System.out.printf("preco: R$ %.2f%n", preco);

        teclado.close();
    }

}

