package D5;
import java.util.Scanner;

public class PrincipalPCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = null;

        while (true) {
            System.out.println("\n=== SISTEMA DE PEDIDOS - RESTAURANTE ===");
            System.out.println("1. Cadastrar pedido");
            System.out.println("2. Escolher pedido local ou delivery");
            System.out.println("3. Mostrar dados do pedido");
            System.out.println("4. Escolher forma de pagamento");
            System.out.println("5. Pagar em dinheiro");
            System.out.println("6. Pagar via PIX");
            System.out.println("7. Pagar com cartão");
            System.out.println("8. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                case 2:
                    System.out.println("\n--- Cadastro / Tipo de Pedido ---");
                    System.out.println("Selecione o Tipo de Pedido:");
                    System.out.println("1 - Pedido Local");
                    System.out.println("2 - Pedido Delivery");
                    System.out.print("Opção: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipo != 1 && tipo != 2) {
                        System.out.println("Opção inválida! Operação cancelada.");
                        break;
                    }

                    System.out.print("Número do pedido: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Valor do pedido: R$ ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    if (tipo == 1) {
                        pedido = new PedidoLocal(numero, nome, valor);
                        System.out.println("Pedido Local cadastrado com sucesso!");
                    } else {
                        System.out.print("Endereço de entrega: ");
                        String endereco = scanner.nextLine();

                        System.out.print("Taxa de entrega: R$ ");
                        double taxa = scanner.nextDouble();

                        pedido = new PedidoDelivery(numero, nome, valor, endereco, taxa);
                        System.out.println("Pedido Delivery cadastrado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Dados do Pedido ---");
                    if (pedido != null) {
                        System.out.println(pedido.exibeDados());
                    } else {
                        System.out.println("Nenhum pedido cadastrado até o momento.");
                    }
                    break;

                case 4:
                case 5:
                case 6:
                case 7:
                    if (pedido == null) {
                        System.out.println("Nenhum pedido cadastrado para realizar o pagamento.");
                        break;
                    }

                  
                    double valorTotal = (pedido instanceof PedidoDelivery) 
                        ? ((PedidoDelivery) pedido).getValorTotalDelivery() 
                        : pedido.getValorPedido();

                    if (opcao == 4) {
                        System.out.println("\n--- Escolher Forma de Pagamento ---");
                        System.out.println("1 - Dinheiro");
                        System.out.println("2 - PIX");
                        System.out.println("3 - Cartão");
                        System.out.print("Opção: ");
                        int forma = scanner.nextInt();
                        scanner.nextLine();

                        if (forma == 1) {
                            pedido.pagar(valorTotal);
                        } else if (forma == 2) {
                            System.out.print("Digite a chave PIX: ");
                            String pix = scanner.nextLine();
                            pedido.pagar(valorTotal, pix);
                        } else if (forma == 3) {
                            System.out.print("Digite a quantidade de parcelas: ");
                            int parcelas = scanner.nextInt();
                            pedido.pagar(valorTotal, parcelas);
                        } else {
                            System.out.println("Forma de pagamento inválida!");
                        }
                    } else if (opcao == 5) {
                        pedido.pagar(valorTotal);
                    } else if (opcao == 6) {
                        System.out.print("Digite a chave PIX: ");
                        String pix = scanner.nextLine();
                        pedido.pagar(valorTotal, pix);
                    } else if (opcao == 7) {
                        System.out.print("Digite a quantidade de parcelas: ");
                        int parcelas = scanner.nextInt();
                        pedido.pagar(valorTotal, parcelas);
                    }
                    break;

                case 8:
                    System.out.println("Encerrando o sistema do restaurante... Até logo!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Selecione uma opção entre 1 e 8.");
                    break;
            }
        }
    }
}