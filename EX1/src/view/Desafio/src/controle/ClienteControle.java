package controle;

import dao.ClienteDao;
import modelo.Cliente;
import java.util.List;

public class ClienteControle {

    private final ClienteDao dao = new ClienteDao();

    public boolean cadastrar(int codigo, String nome, String telefone, String email) {
        Cliente cliente = new Cliente(codigo, nome, telefone, email);
        return dao.cadastrar(cliente);
    }

    public List<Cliente> listar() {
        return dao.listar();
    }

    public Cliente buscar(int codigo) {
        return dao.buscar(codigo);
    }

    public boolean alterar(int codigo, String nome, String telefone, String email) {
        Cliente cliente = new Cliente(codigo, nome, telefone, email);
        return dao.alterar(cliente);
    }

    public boolean remover(int codigo) {
        return dao.remover(codigo);
    }
}