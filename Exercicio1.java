import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== EXERCÍCIO 1: OPERAÇÕES BÁSICAS ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (num2 != 0) {
            double divisao = num1 / num2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão: Não é possível dividir por zero!");
        }

        sc.close();
    }
}
