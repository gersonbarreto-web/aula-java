package controle;

import modelo.Produto;

import java.util.ArrayList;

import dao.ProdutoDAO;

public class ProdutoControle {
    
    private ProdutoDAO dao;

    public  ProdutoControle(){
        dao = new ProdutoDAO();
    }

    // CRIA UM PRODUTO E ENVIA PARA O DAO CADASTRAR
    public void  cadastrar(int codigo, String nome,double preco){

        Produto produto = new Produto(codigo,nome,preco);
        dao.cadastrar(produto);
    }

    // SOLICITAR AO DAO A LISTA DE PRODUTO
    public  ArrayList<Produto> lista(){
        return  dao.listar();
    }

    public Produto buscar (int codigo){
        return dao.buscar(codigo);

    }

    public  boolean alterar(int codigo, String nome,double preco){
        return dao.alterar(codigo, nome, preco);

    }

    public boolean remover(int codigo){
        return dao.remover(codigo);
    }
}
