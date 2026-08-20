import java.util.Scanner;

public class desafioD4 { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        do {
            System.out.println("Digite a senha numerica de 4 digitos:");
            senha = sc.nextInt();

            if (senha != 12345) {
                System.out.println("Senha incorreta! Tente novamente.\n");
            }

        } while (senha != 12345);

        System.out.println("Acesso Permitido");

        sc.close();
    }
}