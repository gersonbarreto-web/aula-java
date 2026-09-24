package D3;

import java.util.Scanner;

public class PrincipalProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;
        int quantidadeGuardada = 0;
        double valorFinalGuardado = 0.0;
        boolean vendaCalculada = false;

        while (true) {
            System.out.println("\n=== SISTEMA DE PRODUTOS E VENDAS ===");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Escolher produto físico ou digital");
            System.out.println("3. Mostrar dados do produto");
            System.out.println("4. Informar quantidade");
            System.out.println("5. Realizar venda");
            System.out.println("6. Realizar venda com desconto");
            System.out.println("7. Mostrar valor final");
            System.out.println("8. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                case 2:
                    System.out.println("\n--- Cadastro / Escolha de Produto ---");
                    System.out.println("Selecione o Tipo de Produto:");
                    System.out.println("1 - Produto Físico");
                    System.out.println("2 - Produto Digital");
                    System.out.print("Opção: ");
                    int tipo = scanner.nextInt();

                    if (tipo != 1 && tipo != 2) {
                        System.out.println("Opção inválida! Cadastro cancelado.");
                        break;
                    }

                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço unitário: R$ ");
                    double preco = scanner.nextDouble();

                    if (tipo == 1) {
                        System.out.print("Digite o valor do frete: R$ ");
                        double frete = scanner.nextDouble();
                        produto = new ProdutoFisico(codigo, nome, preco, frete);
                        System.out.println("Produto Físico cadastrado com sucesso!");
                    } else {
                        produto = new ProdutoDigital(codigo, nome, preco);
                        System.out.println("Produto Digital cadastrado com sucesso!");
                    }
                    vendaCalculada = false; 
                    break;

                case 3:
                    System.out.println("\n--- Dados do Produto ---");
                    if (produto != null) {
                        System.out.println(produto.exibeDados());
                    } else {
                        System.out.println("Nenhum produto cadastrado até o momento.");
                    }
                    break;

                case 4:
                    if (produto == null) {
                        System.out.println("Cadastre um produto antes de informar a quantidade.");
                        break;
                    }
                    System.out.print("\nInforme a quantidade desejada: ");
                    quantidadeGuardada = scanner.nextInt();
                    System.out.println("Quantidade registrada: " + quantidadeGuardada + " unidade(s).");
                    break;

                case 5:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    if (quantidadeGuardada <= 0) {
                        System.out.print("Informe a quantidade para a venda: ");
                        quantidadeGuardada = scanner.nextInt();
                    }
                    valorFinalGuardado = produto.realizarVenda(quantidadeGuardada);
                    vendaCalculada = true;
                    System.out.printf("Venda realizada com sucesso! Valor calculado: R$ %.2f\n", valorFinalGuardado);
                    break;

                case 6:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    if (quantidadeGuardada <= 0) {
                        System.out.print("Informe a quantidade para a venda: ");
                        quantidadeGuardada = scanner.nextInt();
                    }
                    System.out.print("Informe o percentual de desconto (ex: 10 para 10%): ");
                    double desconto = scanner.nextDouble();

                    valorFinalGuardado = produto.realizarVenda(quantidadeGuardada, desconto);
                    vendaCalculada = true;
                    System.out.printf("Venda com desconto realizada! Valor calculado: R$ %.2f\n", valorFinalGuardado);
                    break;

                case 7:
                    System.out.println("\n--- Resumo e Valor Final ---");
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else if (!vendaCalculada) {
                        System.out.println("Nenhuma operação de venda realizada ainda. Escolha a opção 5 ou 6 primeiro.");
                    } else {
                        System.out.println("Produto: " + produto.getNome());
                        System.out.println("Quantidade: " + quantidadeGuardada);
                        System.out.printf("Valor Final a Pagar: R$ %.2f\n", valorFinalGuardado);
                    }
                    break;

                case 8:
                    System.out.println("Encerrando o programa de vendas... Até logo!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Selecione uma opção entre 1 e 8.");
                    break;
            }
        }
    }
}