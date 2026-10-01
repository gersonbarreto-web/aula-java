import java.util.ArrayList;
import java.util.List;

public class cadastroConta {
    private List<Conta> contas;
    private static final int LIMITE_MAXIMO = 100;

    public cadastroConta() {
        this.contas = new ArrayList<>();
    }

    public void inserir(Conta conta) throws ExcecaoRepositorio, ExcecaoElementoJaExistente {
        if (contas.size() >= LIMITE_MAXIMO) {
            throw new ExcecaoRepositorio("Erro: Limite máximo de " + LIMITE_MAXIMO + " contas atingido.");
        }
        
        if (buscarSilencioso(conta.getNumero()) != null) {
            throw new ExcecaoElementoJaExistente("Erro: Já existe uma conta cadastrada com o número '" + conta.getNumero() + "'.");
        }

        contas.add(conta);
    }

    public Conta buscar(String numero) throws ExcecaoElementoInexistente {
        Conta conta = buscarSilencioso(numero);
        if (conta == null) {
            throw new ExcecaoElementoInexistente("Erro: Conta com número '" + numero + "' não foi encontrada.");
        }
        return conta;
    }

    public void remover(String numero) throws ExcecaoElementoInexistente {
        Conta conta = buscar(numero);
        contas.remove(conta);
    }

    private Conta buscarSilencioso(String numero) {
        for (Conta c : contas) {
            if (c.getNumero().equalsIgnoreCase(numero)) {
                return c;
            }
        }
        return null;
    }
}