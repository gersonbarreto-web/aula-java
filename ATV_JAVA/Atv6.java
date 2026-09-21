import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
           
            System.out.println("\n===== MENU DE OPÇÕES =====");
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

        
            switch (opcao) {
                case 1:
                    System.out.print("\nInforme o número para ver a tabuada: ");
                    int numTabuada = sc.nextInt();
                    System.out.println("--- Tabuada do " + numTabuada + " ---");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numTabuada + " x " + i + " = " + (numTabuada * i));
                    }
                    break;

                case 2:
                    System.out.print("\nInforme o número inicial da contagem: ");
                    int inicio = sc.nextInt();
                    System.out.println("--- Contagem Regressiva ---");
                    for (int i = inicio; i >= 0; i--) {
                        System.out.println(i);
                    }
                    System.out.println("Fim da contagem!");
                    break;

                case 0:
                    System.out.println("\nSaindo do programa... Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0); 

        sc.close();
    }
}