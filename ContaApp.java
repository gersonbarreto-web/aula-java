
import java.util.Scanner;

public class ContaApp {
    private static cadastroConta repositorio = new cadastroConta();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
            exibirMenu();
            try {
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        cadastrarConta();
                        break;
                    case 2:
                        buscarConta();
                        break;
                    case 3:
                        removerConta();
                        break;
                    case 4:
                        System.out.println("Encerrando o sistema... Até logo!");
                        executando = false;
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para escolher a opção.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("=== SISTEMA DE CADASTRO DE CONTAS BANCÁRIAS ===");
        System.out.println("1. Cadastrar Conta");
        System.out.println("2. Buscar Conta");
        System.out.println("3. Remover Conta");
        System.out.println("4. Sair");
        System.out.print("Opção: ");
    }

    private static void cadastrarConta() {
        try {
            System.out.print("Informe o número da conta: ");
            String numero = scanner.nextLine();

            System.out.print("Informe o nome do titular: ");
            String titular = scanner.nextLine();

            System.out.print("Informe o saldo inicial: ");
            double saldo;
            try {
                saldo = Double.parseDouble(scanner.nextLine().replace(',', '.'));
            } catch (NumberFormatException e) {
                throw new ExcecaoDadoInvalido("Erro: O saldo informado deve ser um valor numérico válido.");
            }

            Conta novaConta = new Conta(numero, titular, saldo);
            repositorio.inserir(novaConta);

            System.out.println("Sucesso: Conta cadastrada com sucesso!");

        } catch (ExcecaoDadoInvalido | ExcecaoElementoJaExistente | ExcecaoRepositorio e) {
            System.out.println(e.getMessage());
        }
    }

    private static void buscarConta() {
        try {
            System.out.print("Informe o número da conta para busca: ");
            String numero = scanner.nextLine();

            Conta conta = repositorio.buscar(numero);
            System.out.println("\n--- Conta Encontrada ---");
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: R$ " + String.format("%.2f", conta.getSaldo()));

        } catch (ExcecaoElementoInexistente e) {
            System.out.println(e.getMessage());
        }
    }

    private static void removerConta() {
        try {
            System.out.print("Informe o número da conta para remoção: ");
            String numero = scanner.nextLine();

            repositorio.remover(numero);
            System.out.println("Sucesso: Operação realizada com sucesso! A conta foi removida.");

        } catch (ExcecaoElementoInexistente e) {
            System.out.println(e.getMessage());
        }
    }
}