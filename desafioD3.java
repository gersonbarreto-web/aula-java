import java.util.Scanner;

public class desafioD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";

        do {
            System.out.println("Digite o nome do professor mais fofo do SENAI:");
            nome = sc.nextLine();

            
            if (!nome.equalsIgnoreCase("Anderson")) {
                System.out.println("Resposta incorreta! Tente novamente.\n");
            }

        } while (!nome.equalsIgnoreCase("Anderson"));

        System.out.println("\nAcertou! O professor Anderson é realmente o mais fofo! ");

        sc.close();
    }

    }

