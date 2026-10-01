import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while (op != 0) {
            try {
                System.out.println("\n==== MENU ====");
                System.out.println("1 - Adicionar");
                System.out.println("2 - Listar");
                System.out.println("3 - Remover");
                System.out.println("0 - Sair");
                System.out.print("Informe a opção: ");
                
                op = sc.nextInt();
                sc.nextLine(); 

                switch (op) {
                    case 1:
                        System.out.print("Digite o nome/item para adicionar: ");
                        String novoItem = sc.nextLine();
                        lista.add(novoItem);
                        System.out.println("✓ Item '" + novoItem + "' adicionado com sucesso!");
                        break;

                    case 2:
                        System.out.println("\n--- LISTA DE ITENS ---");
                        if (lista.isEmpty()) {
                            System.out.println("A lista está vazia.");
                        } else {
                            for (int i = 0; i < lista.size(); i++) {
                                System.out.println((i + 1) + ". " + lista.get(i));
                            }
                        }
                        break;

                    case 3:
                        