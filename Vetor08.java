import java.util.Scanner;

public class Vetor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        System.out.println("====Cadastro de Nomes===");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome: ");
            nomes[i] = sc.nextLine();
        }
        
        System.out.println("\nLista atual:");
        listar(nomes);

        System.out.print("\nDigite a posicao para alterar (0 a 2): ");
        int posAlterar = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        if (posAlterar >= 0 && posAlterar < nomes.length) {
            System.out.print("Digite o novo nome: ");
            nomes[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista atualizada:");
        listar(nomes); // Corrigido o ; no final

        System.out.println("\n Digite a pocicao para remover");
        int posRemover=sc.nextInt();

        if (posRemover>=0 && posRemover<nomes.length){
            for(int i = posRemover; i<nomes.length-1;i++){
                nomes[i]=nomes[i+1];

            }
            nomes[nomes.length -1]=null;
        }else{
            System.out.println("posicao invalida");
        }
        System.out.println("\n Lista apos remocao");
        listar(nomes);
        
        sc.close();
    }

    // Criado o método listar recebendo o array de Strings como parâmetro
    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) { // Corrigida a condição (i < array.length)
            System.out.println(i + " - " + array[i]);
        }
    }
}