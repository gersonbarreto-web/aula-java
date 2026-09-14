import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        // 1. Adicionar elementos
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");

        System.out.println("Lista original:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // 2. Alterar elemento no índice 1 ("Maria" -> "edivandecodecleide")
        nomes.set(1, "edivandecodecleide");

        System.out.println("\nLista de nomes alterada:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // 3. Remover elemento no índice 0 ("João")
        nomes.remove(0);

        System.out.println("\nLista de nomes após remoção:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}