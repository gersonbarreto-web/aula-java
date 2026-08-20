import java.util.Scanner;

public class desafioCOMDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "";
        
        do {
            System.out.println("Digite a senha: ");
            senha = sc.nextLine();
        } while (!senha.equals("1234")); // "1234" entre aspas como String
        
        System.out.println("Acesso permitido"); // Sem a chave { no final
        
        sc.close();
    }
}