

import java.util.Scanner;

public class ClienteAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op ;

        do{

            System.out.println("=====Sistema de cadastro de clientes=====");
            System.out.println("1 - Cadastrar Cliente PJ");
            System.out.println("2 - Cadastrar Cliente PF");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            sc.nextLine(); 

            while(!sc.hasNextInt()){
                System.out.println("Opção inválida. Digite um número inteiro.");
                sc.nextLine(); 
            }
             op=sc.nextInt() ;
             sc.nextLine(); 
            
            switch (op) {
                case 1:
                    System.out.print("Digite o nome do cliente PJ: ");
                    String nomePJ = sc.nextLine();
                    System.out.print("Digite o endereço do cliente PJ: ");
                    String enderecoPJ = sc.nextLine();
                    System.out.print("Digite o CNPJ do cliente PJ: ");
                    String cnpj = sc.nextLine();

                    ClientePJ clientePJ = new ClientePJ(nomePJ, enderecoPJ, cnpj);
                    clientePJ.exibirDados();
                    break;

                case 2:
                    System.out.print("Digite o nome do cliente PF: ");
                    String nomePF = sc.nextLine();
                    System.out.print("Digite o endereço do cliente PF: ");
                    String enderecoPF = sc.nextLine();
                    System.out.print("Digite o CPF do cliente PF: ");
                    String cpf = sc.nextLine();

                    ClientePf clientePF = new ClientePf(nomePF, enderecoPF, cpf);
                    clientePF.exibirDados();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while(op != 0);








        sc.close();
    }
}
