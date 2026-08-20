import java.util.Scanner;

public class whileDO4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Iniciar jogo");
            System.out.println("2 - Carregar jogo");
            System.out.println("3 - Configuracao");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opcao:");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Iniciando jogo...");
                    break;
                case 2:
                    System.out.println("Carregando jogo...");
                    break;    
                case 3:
                    System.out.println("Abrindo configuracoes...");
                    break;    
                case 4:
                    System.out.println("Saindo do jogo. Ate mais!");
                    break;            
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }

        } while (op != 4); // Repete o menu enquanto a opção NÃO for 4 (Sair)

        sc.close(); // Fechado apenas no final, fora do do-while
    }
}