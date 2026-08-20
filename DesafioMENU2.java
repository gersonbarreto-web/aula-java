import java.util.Scanner;

public class DesafioMENU2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("\n---MENU---");
            System.out.println("1 Caneta Esferográfica");
            System.out.println("2 Caneta Gel");
            System.out.println("3 Caneta Tinteiro");
            System.out.println("4 Sair ");
            System.out.println("Escolha uma opcao");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Caneta Esferográfica \n Econômica e de longa duração ");

                    break;
                case 2:
                    System.out.println("Caneta Gel\n Tinta mais pigmentada e escrita suave ");
                    break;
                case 3 : 
                    System.out.println("Caneta Tinteiro \n Clássica e elegante, usada para caligrafia ");
                    break;
                case 4 :
                    System.out.println("Saindo do menu de Canetas");  
                    break;  
                default:
                    System.out.println("Opcao invalida! tente novamente.");
                    break;
            }
                } while (op !=4);

            sc.close();

        
    }
    
}


