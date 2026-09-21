package EX_JAVA;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        // 1. Exibir números cadastrados
        System.out.println("Números cadastrados:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // 2. Pedir o número para remover (FORA do loop)
        System.out.println("\nDigite um número para remover da lista:");
        int numeroRemover = sc.nextInt();

        // Tenta remover pelo VALOR do objeto Integer
        if (numeros.remove(Integer.valueOf(numeroRemover))) {
            System.out.println("Número removido com sucesso!");
        } else {
            System.out.println("Número não encontrado na lista.");
        }

        // 3. Exibir a lista atualizada
        System.out.println("\nLista após a remoção:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        sc.close();
    }
}