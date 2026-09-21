package D2;
import java.util.Scanner;

public class PrincipalVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo veiculo = null;

        while (true) {
            System.out.println("\n=== SISTEMA DE LOCAÇÃO DE VEÍCULOS ===");
            System.out.println("1. Cadastrar um Veículo (Carro / Moto)");
            System.out.println("2. Mostrar dados do Veículo");
            System.out.println("3. Calcular valor do aluguel");
            System.out.println("4. Calcular aluguel com desconto");
            System.out.println("5. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Selecione o Tipo de Veículo ---");
                    System.out.println("1 - Carro");
                    System.out.println("2 - Moto");
                    System.out.print("Opção: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipo != 1 && tipo != 2) {
                        System.out.println("Tipo inválido. Registo cancelado.");
                        break;
                    }

                    System.out.print("Digite a Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Digite o Modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Digite o Ano: ");
                    int ano = scanner.nextInt();

                    System.out.print("Digite o Valor da Diária: R$ ");
                    double valorDiaria = scanner.nextDouble();

                    if (tipo == 1) {
                        veiculo = new Carro(placa, modelo, ano, valorDiaria);
                        System.out.println("Carro cadastrado com sucesso!");
                    } else {
                        veiculo = new Moto(placa, modelo, ano, valorDiaria);
                        System.out.println("Moto cadastrada com sucesso!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Dados do Veículo ---");
                    if (veiculo != null) {
                        System.out.println(veiculo.exibeDados());
                    } else {
                        System.out.println("Nenhum veículo cadastrado até ao momento.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Cálculo do Aluguel ---");
                    if (veiculo != null) {
                        System.out.print("Informe a quantidade de dias da locação: ");
                        int dias = scanner.nextInt();
                        double total = veiculo.calcularAluguel(dias);
                        System.out.println("Valor total para " + dias + " dias: R$ " + total);
                    } else {
                        System.out.println("Nenhum veículo cadastrado. Cadastre um veículo primeiro.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Cálculo do Aluguel com Desconto ---");
                    if (veiculo != null) {
                        System.out.print("Informe a quantidade de dias da locação: ");
                        int diasDesc = scanner.nextInt();

                        System.out.print("Informe o valor do desconto: R$ ");
                        double desconto = scanner.nextDouble();

                        double totalComDesconto = veiculo.calcularAluguel(diasDesc, desconto);
                        System.out.println("Valor final com desconto de R$ " + desconto + ": R$ " + totalComDesconto);
                    } else {
                        System.out.println("Nenhum veículo cadastrado. Cadastre um veículo primeiro.");
                    }
                    break;

                case 5:
                    System.out.println("A encerrar o programa de locação... Até breve!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Selecione uma opção válida.");
                    break;
            }
        }
    }
}