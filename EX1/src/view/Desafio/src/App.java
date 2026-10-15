import javax.swing.SwingUtilities;
import view.ClienteView;

public class App {
    public static void main(String[] args) throws Exception {
        // Garante que a interface gráfica seja executada na thread de eventos do Swing
        SwingUtilities.invokeLater(() -> {
            ClienteView tela = new ClienteView();
            tela.setVisible(true);
        });
    }
}