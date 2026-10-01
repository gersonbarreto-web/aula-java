import java.util.InputMismatchException;
import java.util.Scanner;

public class ModuloPagamentos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoAtual = 1000.00;  

        System.out.println("Saldo disponível: R$ " + saldoAtual);
        System.out.print("Digite o valor do saque: ");

        try {
            double valorSaque = scanner.nextDouble();

            if (valorSaque <= 0) {
                throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
            }

       
            if (valorSaque > saldoAtual) {
                throw new IllegalArgumentException("Saldo insuficiente para realizar esta operação.");
            }

       
            saldoAtual -= valorSaque;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valorSaque);
            System.out.printf("Novo saldo: R$ %.2f%n", saldoAtual);

        } catch (InputMismatchException e) {
            System.out.println("Erro de digitação: Por favor, insira um número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no saque: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético: " + e.getMessage());
        } finally {
            
            System.out.println("Operação encerrada");
            scanner.close();
        }
    }
}