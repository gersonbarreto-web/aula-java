package dao;



import modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    private final List<Cliente> listaClientes = new ArrayList<>();

    public boolean cadastrar(Cliente cliente) {
        if (buscar(cliente.getCodigo()) != null) {
            return false;
        }
        return listaClientes.add(cliente);
    }

    public List<Cliente> listar() {
        return new ArrayList<>(listaClientes);
    }

    public Cliente buscar(int codigo) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }

    public boolean alterar(Cliente cliente) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getCodigo() == cliente.getCodigo()) {
                listaClientes.set(i, cliente);
                return true;
            }
        }
        return false;
    }

    public boolean remover(int codigo) {
        return listaClientes.removeIf(cliente -> cliente.getCodigo() == codigo);
    }
}