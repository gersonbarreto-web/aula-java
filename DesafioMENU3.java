import java.util.Scanner;

public class DesafioMENU3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("\n---MENU---");
            System.out.println("1 Mochila escolar");
            System.out.println("2 Mochila esportiva");
            System.out.println("3 Mochila de Viagem");
            System.out.println("4 Sair ");
            System.out.println("Escolha uma opcao");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Mochila escolar \n Compacta e ideal para estudantes ");

                    break;
                case 2:
                    System.out.println("Mochila esportiva \n Leve, resistente e ergonômica ");
                    break;
                case 3 : 
                    System.out.println("Mochila de Viagem \n Leve, resistente e ergonômica");
                    break;
                case 4 :
                    System.out.println("Saindo do menu de Mochilas");  
                    break;  
                default:
                    System.out.println("Opcao invalida! tente novamente.");
                    break;
            }
                } while (op !=4);

            sc.close();

        
    }
    
}




