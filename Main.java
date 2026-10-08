import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Carro> listaCarros = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = 0;

        do {
            String menu = "=== SISTEMA DE CADASTRO DE CARROS ===\n\n"
                    + "1 - Cadastrar Carro\n"
                    + "2 - Listar Carros\n"
                    + "3 - Detalhar Carro\n"
                    + "4 - Alterar Carro\n"
                    + "5 - Remover Carro\n"
                    + "6 - Gravar Informações em Arquivo\n"
                    + "7 - Sair\n\n"
                    + "Escolha uma opção:";

            String entrada = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                break;
            }

            try {
                opcao = Integer.parseInt(entrada);

                switch (opcao) {
                    case 1: cadastrarCarro(); break;
                    case 2: listarCarros(); break;
                    case 3: detalharCarro(); break;
                    case 4: alterarCarro(); break;
                    case 5: removerCarro(); break;
                    case 6: gravarEmArquivo(); break;
                    case 7: JOptionPane.showMessageDialog(null, "Saindo do sistema. Até logo!"); break;
                    default: JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (opcao != 7);
    }

    private static void cadastrarCarro() {
        String marca = JOptionPane.showInputDialog(null, "Informe a marca do carro:");
        if (marca == null || marca.trim().isEmpty()) return;

        String modelo = JOptionPane.showInputDialog(null, "Informe o modelo do carro:");
        if (modelo == null || modelo.trim().isEmpty()) return;

        try {
            int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano do carro:"));
            Carro carro = new Carro(marca, modelo, ano);
            listaCarros.add(carro);
            JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ano inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void listarCarros() {
        if (listaCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado no sistema.");
            return;
        }

        StringBuilder lista = new StringBuilder("=== CARROS CADASTRADOS ===\n\n");
        for (int i = 0; i < listaCarros.size(); i++) {
            Carro c = listaCarros.get(i);
            lista.append(i + 1).append(" - ").append(c.getMarca()).append(" ").append(c.getModelo()).append("\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString());
    }

    private static void detalharCarro() {
        if (listaCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado no sistema.");
            return;
        }

        int indice = selecionarCarro("Escolha o número do carro para ver os detalhes:");
        if (indice != -1) {
            Carro c = listaCarros.get(indice);
            JOptionPane.showMessageDialog(null, c.exibirDetalhes());
        }
    }

    private static void alterarCarro() {
        if (listaCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado no sistema.");
            return;
        }

        int indice = selecionarCarro("Escolha o número do carro que deseja alterar:");
        if (indice != -1) {
            Carro c = listaCarros.get(indice);

            String novaMarca = JOptionPane.showInputDialog(null, "Informe a nova marca:", c.getMarca());
            if (novaMarca == null || novaMarca.trim().isEmpty()) return;

            String novoModelo = JOptionPane.showInputDialog(null, "Informe o novo modelo:", c.getModelo());
            if (novoModelo == null || novoModelo.trim().isEmpty()) return;

            try {
                int novoAno = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o novo ano:", c.getAno()));
                c.setMarca(novaMarca);
                c.setModelo(novoModelo);
                c.setAno(novoAno);

                JOptionPane.showMessageDialog(null, "Dados do carro atualizados com sucesso!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ano inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void removerCarro() {
        if (listaCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado no sistema.");
            return;
        }

        int indice = selecionarCarro("Escolha o número do carro que deseja remover:");
        if (indice != -1) {
            Carro c = listaCarros.get(indice);
            listaCarros.remove(indice);
            JOptionPane.showMessageDialog(null, "Carro (" + c.getMarca() + " " + c.getModelo() + ") removido com sucesso!");
        }
    }

    private static void gravarEmArquivo() {
        if (listaCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum carro para gravar no arquivo.");
            return;
        }

        try (FileWriter fw = new FileWriter("carros.txt");
             PrintWriter pw = new PrintWriter(fw)) {

            for (Carro c : listaCarros) {
                pw.println("Marca: " + c.getMarca());
                pw.println("Modelo: " + c.getModelo());
                pw.println("Ano: " + c.getAno());
                pw.println("------------------------------");
            }

            JOptionPane.showMessageDialog(null, "Dados gravados em 'carros.txt' com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static int selecionarCarro(String mensagem) {
        StringBuilder lista = new StringBuilder(mensagem + "\n\n");
        for (int i = 0; i < listaCarros.size(); i++) {
            Carro c = listaCarros.get(i);
            lista.append(i + 1).append(" - ").append(c.getMarca()).append(" ").append(c.getModelo()).append("\n");
        }

        try {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, lista.toString()));
            int indice = opcao - 1;

            if (indice >= 0 && indice < listaCarros.size()) {
                return indice;
            } else {
                JOptionPane.showMessageDialog(null, "Número inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return -1;
    }
}