import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe N1: ");
        double N1 = sc.nextDouble();

        System.out.println("Informe N2: ");
        double N2 = sc.nextDouble();

        System.out.println("Informe N3: ");
        double N3 = sc.nextDouble();

        // Operações Matemáticas
        double media = (N1 + N2 + N3) / 3;     
        double soma = N1 + N2 + N3;           
        double subtracao = N1 - N2 - N3;       
        double multiplicacao = N1 * N2 * N3;   

        // Exibição dos Resultados
        System.out.println("\n--- RESULTADOS PARA " + nome.toUpperCase() + " ---");
        System.out.println("Soma dos numeros: " + soma);
        System.out.println("Subtracao dos numeros: " + subtracao);
        System.out.println("Multiplicacao dos numeros: " + multiplicacao);
        System.out.printf("Media final: %.2f\n", media); 
        sc.close();
    }
}