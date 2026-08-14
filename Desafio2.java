import java.util.Scanner;

public class Desafio2 {
    
    public static void main(String[] args) {
       
        Scanner aluno = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = aluno.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = aluno.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = aluno.nextDouble();

        double media = (nota1 + nota2) / 2;

        
        System.out.printf("Aluno: %s%n", nome);
        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Média: %.2f%n", media);
        
        aluno.close();
    }
}