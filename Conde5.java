import java.util.Scanner;

public class Conde5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o nome:");
        String nome=sc.nextLine();

        System.out.println("informa a senha :");
        String senha=sc.nextLine();

        if (nome.equals("raquel1")&&senha.equals("1234")) {
            System.out.println("Login realizado com sucesso");
        }else if (nome.equals("maria")&& senha.equals("5678")) {
            System.out.println("Login realizado com sucesso");
        }else {
            System.out.println("Nome de usuário ou senha incorretos");
        }
        sc.close();
    }
}
