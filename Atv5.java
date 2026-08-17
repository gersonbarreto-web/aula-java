import java.util.Scanner;

public class Atv5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Informe a senha: ");
        String senha = sc.nextLine();

        String senhaCorreta = "12345";

       
        if (senha.equals(senhaCorreta)) {
            System.out.println("PORTA ABERTA");
        } else {
            System.out.println("SENHA NAO CONFERE");
        }

        sc.close();
    }
}
