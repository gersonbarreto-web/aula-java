import java.util.Scanner;

public class AtvVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] produtos = new String[5];
        int[] estoque = new int[5];
        
        int qtd = 0;   
        int opcao = 0; 

        do {
            System.out.println("\n=== SISTEMA DE ESTOQUE ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    // 
                    if (qtd < 5) {
                        System.out.print("Nome do produto: ");
                        produtos[qtd] = sc.nextLine();

                        System.out.print("Quantidade em estoque: ");
                        estoque[qtd] = sc.nextInt();
                        sc.nextLine(); 

                        qtd++; 
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Limite de 5 produtos atingido!");
                    }
                    break;

                case 2:
                    
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n--- PRODUTOS CADASTRADOS ---");
                        for (int i = 0; i < qtd; i++) {
                            System.out.println("Indice " + i + " | Nome: " + produtos[i] + " | Estq: " + estoque[i]);
                        }
                    }
                    break;

                case 3:
                 
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.print("Digite o nome para buscar: ");
                        String busca = sc.nextLine();
                        boolean achou = false;

                        for (int i = 0; i < qtd; i++) {
                          
                            if (produtos[i].equals(busca)) {
                                System.out.println("Encontrado na posicao " + i + ": " + produtos[i] + " - " + estoque[i] + " unidades");
                                achou = true;
                                break;
                            }
                        }

                        if (!achou) {
                            System.out.println("Produto nao encontrado.");
                        }
                    }
                    break;

                case 4:
                  
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.print("Digite o nome do produto para alterar: ");
                        String busca = sc.nextLine();
                        int posicao = -1;

                        for (int i = 0; i < qtd; i++) {
                            if (produtos[i].equals(busca)) {
                                posicao = i;
                                break;
                            }
                        }

                        if (posicao != -1) {
                            System.out.print("Novo nome: ");
                            produtos[posicao] = sc.nextLine();

                            System.out.print("Nova quantidade: ");
                            estoque[posicao] = sc.nextInt();
                            sc.nextLine(); 

                            System.out.println("Produto alterado com sucesso!");
                        } else {
                            System.out.println("Produto nao encontrado.");
                        }
                    }
                    break;

                case 5:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.print("Digite o nome do produto para remover: ");
                        String busca = sc.nextLine();
                        int posicao = -1;

                    
                        for (int i = 0; i < qtd; i++) {
                            if (produtos[i].equals(busca)) {
                                posicao = i;
                                break;
                            }
                        }

                        if (posicao != -1) {
                            
                            for (int i = posicao; i < qtd - 1; i++) {
                                produtos[i] = produtos[i + 1];
                                estoque[i] = estoque[i + 1];
                            }

                            qtd--; 
                            System.out.println("Produto removido com sucesso!");
                        } else {
                            System.out.println("Produto nao encontrado.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa... Ate logo!");
                    break;

                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }

        } while (opcao != 6);

        sc.close();
    }
}
        