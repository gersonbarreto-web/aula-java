package D4;

public abstract class Curso implements Matricula {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private double valor;

    public Curso(int codigo, String nome, int cargaHoraria, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }

   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    @Override
    public double realizarMatricula(String nomeAluno) {
        return valor;
    }

    @Override
    public double realizarMatricula(String nomeAluno, double percentualDesconto) {
        return valor - (valor * (percentualDesconto / 100.0));
    }

    public String exibeDados() {
        return "Código: " + codigo + " | Nome: " + nome + 
               " | Carga Horária: " + cargaHoraria + "h | Valor: R$ " + String.format("%.2f", valor);
    }
}