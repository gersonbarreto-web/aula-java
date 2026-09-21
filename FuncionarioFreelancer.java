package D1;
public class FuncionarioFreelancer extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioFreelancer(String nome, String cpf, int horasTrabalhadas, double valorHora) {
       
        super(nome, cpf, 0); 
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public double calcularPagamento(double bonus) {
        return (horasTrabalhadas * valorHora) + bonus;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + " | Tipo: Freelancer | Horas Trabalhadas: " + horasTrabalhadas 
                + " | Valor/Hora: R$ " + valorHora;
    }
}