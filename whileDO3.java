import java.util.Scanner;

public class whileDO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Alterado de System.err para System.out
        System.out.println("Digite um numero:");
        int limite = sc.nextInt();
        int numero = 1;
        
        do { 
            System.out.println(numero);
            numero++;
        } while (numero <= limite); // Fecha o do-while
        
        sc.close();
    }
}