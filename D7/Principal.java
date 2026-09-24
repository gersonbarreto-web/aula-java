package D7;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados inicial
        System.out.println("CADASTRO INICIAL");
        System.out.print("Número da agência: ");
        String numAgencia = scanner.nextLine();

        System.out.print("Nome da agência: ");
        String nomeAgencia = scanner.nextLine();

        System.out.print("Número da conta: ");
        String numConta = scanner.nextLine();

        System.out.print("Titular: ");
        String titular = scanner.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Instanciação
        Agencia agencia = new Agencia(numAgencia, nomeAgencia);
        ContaCorrente conta = new ContaCorrente(numConta, titular, saldoInicial, agencia);

        // Menu principal de repetição
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1 - Mostrar dados da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Pagar com PIX");
            System.out.println("5 - Pagar com cartão");
            System.out.println("6 - Pagar em dinheiro");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de memória

            switch (opcao) {
                case 1:
                    conta.mostrarDadosCompletos();
                    break;

                case 2:
                    conta.consultarSaldo();
                    break;

                case 3:
                    System.out.print("Valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 4:
                    System.out.print("Valor do pagamento: ");
                    double valorPix = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Chave PIX: ");
                    String chave = scanner.nextLine();
                    conta.pagar(valorPix, chave);
                    break;

                case 5:
                    System.out.print("Valor da compra: ");
                    double valorCartao = scanner.nextDouble();
                    System.out.print("Quantidade de parcelas: ");
                    int parcelas = scanner.nextInt();
                    conta.pagar(valorCartao, parcelas);
                    break;

                case 6:
                    System.out.print("Valor do pagamento: ");
                    double valorDinheiro = scanner.nextDouble();
                    conta.pagar(valorDinheiro);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}