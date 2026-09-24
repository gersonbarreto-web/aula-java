package D5;
public interface PagamentoPCD {
    
    void pagar(double valor);

    void pagar(double valor, String chavePix);

    
    void pagar(double valor, int parcelas);
}