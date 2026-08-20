import java.util.Scanner;

public class atvDM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0; 

        while (op != 4) { 
            System.out.println("\n---MENU---");
            System.out.println("1 Embalagem de vidro");
            System.out.println("2 Sacola de plastico");
            System.out.println("3 caixa de papelao");
            System.out.println("4 Sair ");
            System.out.println("Escolha uma opcao");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Embalagem de vidro \n Resistente e reutilizável ");
                    break;
                case 2:
                    System.out.println("Sacola de platico \n Leve e prática, mas pouco sustentável ");
                    break;
                case 3: 
                    System.out.println("Caixa de papelao \n Ideal para transporte e armazenamento");
                    break;
                case 4:
                    System.out.println("Saindo do menu de Embalagens");  
                    break;  
                default:
                    System.out.println("Opcao invalida! tente novamente.");
                    break;
            }
        } 

        sc.close();
    }
}

