public class Formatacao {
    
    public static void main(String[] args) {
        String produto = "teclado";
        int quantidade = 2;
        double preco = 89.90;

        // Adicionado %n para quebrar linha e removido o % solto
        System.out.printf("Produto: %s%n", produto);
        
        // Adicionado espaço após o dois-pontos para organizar
        System.out.printf("Quantidade: %d%n", quantidade);
        
        // Adicionado 'f' depois de '%.2' para indicar float/double
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}