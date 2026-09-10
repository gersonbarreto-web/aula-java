package ORINTADA_OBJETO_JAVA;

public class pessoaApp {
    public static void main(String[] args) {
        pessoa p1 = new pessoa(1, "Carlos");
        pessoa p2 = new pessoa(2, "Maria");
        

        System.out.println("Código: " + p1.getCodigo() + ", Nome: " + p1.getNome());

        //modificado
        p1.setNome("vanessa");
        System.out.println("Código: " + p1.getCodigo() + ", Nome: " + p1.getNome());
    }
}