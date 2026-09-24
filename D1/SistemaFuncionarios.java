package D1;
import java.util.Scanner;

public class SistemaFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = null;

        while (true) {
            System.out.println("\n=== SISTEMA DE GESTÃO DE FUNCIONÁRIOS ===");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Escolher / Alterar Tipo de Funcionário");
            System.out.println("3. Mostrar Dados Cadastrados");
            System.out.println("4. Calcular Pagamento");
            System.out.println("5. Calcular Pagamento com Bónus");
            System.out.println("6. Consultar Dados do Funcionário");
            System.out.println("7. Encerrar o Programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                case 2:
                    System.out.println("\n--- Cadastro de Funcionário ---");
                    System.out.print("Digite o Nome: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Digite o CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.println("Selecione o Tipo de Funcionário:");
                    System.out.println("1 - CLT");
                    System.out.println("2 - Freelancer");
                    int tipo = scanner.nextInt();

                    if (tipo == 1) {
                        System.out.print("Digite o Salário Mensal: R$ ");
                        double salario = scanner.nextDouble();
                        funcionario = new FuncionarioCLT(nome, cpf, salario);
                        System.out.println("Funcionário CLT cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Digite a quantidade de Horas Trabalhadas: ");
                        int horas = scanner.nextInt();
                        System.out.print("Digite o Valor por Hora: R$ ");
                        double valorHora = scanner.nextDouble();
                        funcionario = new FuncionarioFreelancer(nome, cpf, horas, valorHora);
                        System.out.println("Funcionário Freelancer cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo inválido. Registo não realizado.");
                    }
                    break;

                case 3:
                case 6:
                    System.out.println("\n--- Dados do Funcionário ---");
                    if (funcionario != null) {
                        System.out.println(funcionario.exibeDados());
                    } else {
                        System.out.println("Nenhum funcionário cadastrado no momento.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Cálculo de Pagamento ---");
                    if (funcionario != null) {
                        System.out.println("Pagamento Total: R$ " + funcionario.calcularPagamento());
                    } else {
                        System.out.println("Nenhum funcionário cadastrado.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Cálculo de Pagamento com Bónus ---");
                    if (funcionario != null) {
                        System.out.print("Digite o valor do Bónus: R$ ");
                        double bonus = scanner.nextDouble();
                        System.out.println("Pagamento com Bónus: R$ " + funcionario.calcularPagamento(bonus));
                    } else {
                        System.out.println("Nenhum funcionário cadastrado.");
                    }
                    break;

                case 7:
                    System.out.println("A encerrar o sistema... Até à próxima!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}