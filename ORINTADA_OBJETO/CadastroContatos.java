package ATVSistema;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato1> contatos = new ArrayList<>();

        while (true) {
            System.out.println("\n========= AGENDA DE CONTATOS =========");
            System.out.println("1 - Cadastrar contato pessoal");
            System.out.println("2 - Cadastrar contato profissional");
            System.out.println("3 - Listar todos os contatos");
            System.out.println("4 - Pesquisar contato");
            System.out.println("5 - Alterar contato");
            System.out.println("6 - Excluir contato");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeP = sc.nextLine();
                    System.out.print("Telefone: ");
                    String numP = sc.nextLine();
                    System.out.print("Parentesco: ");
                    String parentesco = sc.nextLine();
                    contatos.add(new ContatoPessoal(nomeP, numP, parentesco));
                    System.out.println("Contato pessoal cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomePr = sc.nextLine();
                    System.out.print("Telefone: ");
                    String numPr = sc.nextLine();
                    System.out.print("Empresa: ");
                    String empresa = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    contatos.add(new ContatoProfissional(nomePr, numPr, empresa, cargo));
                    System.out.println("Contato profissional cadastrado com sucesso!");
                    break;

                case 3:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.println("\n--- Lista de Contatos ---");
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println((i + 1) + " - " + contatos.get(i).exibirDados());
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome para pesquisar: ");
                    String busca = sc.nextLine();
                    boolean encontrado = false;
                    for (Contato1 c : contatos) {
                        if (c.getNome().equalsIgnoreCase(busca)) {
                            System.out.println("\nContato encontrado!");
                            System.out.println(c.exibirDados());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    if (contatos.isEmpty()) {
                        System.out.println("Lista vazia.");
                        break;
                    }
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + " - " + contatos.get(i).getNome());
                    }
                    System.out.print("Informe o número do contato que deseja alterar: ");
                    int idxAlt = sc.nextInt();
                    sc.nextLine();

                    if (idxAlt > 0 && idxAlt <= contatos.size()) {
                        System.out.print("Novo Nome: ");
                        contatos.get(idxAlt - 1).setNome(sc.nextLine());
                        System.out.print("Novo Telefone: ");
                        contatos.get(idxAlt - 1).setNumero(sc.nextLine());
                        System.out.println("Contato alterado com sucesso!");
                    } else {
                        System.out.println("Contato inválido!");
                    }
                    break;

                case 6:
                    if (contatos.isEmpty()) {
                        System.out.println("Lista vazia.");
                        break;
                    }
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + " - " + contatos.get(i).getNome());
                    }
                    System.out.print("Informe o número do contato que deseja excluir: ");
                    int idxExc = sc.nextInt();
                    sc.nextLine();

                    if (idxExc > 0 && idxExc <= contatos.size()) {
                        contatos.remove(idxExc - 1);
                        System.out.println("Contato excluído com sucesso!");
                    } else {
                        System.out.println("Contato inválido!");
                    }
                    break;

                case 7:
                    System.out.println("Saindo do sistema...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}