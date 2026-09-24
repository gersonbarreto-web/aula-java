package D1;
public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, String cpf, double salarioMensal) {
        super(nome, cpf, salarioMensal);
    }

    @Override
    public double calcularPagamento() {
        return getSalario();
    }

    @Override
    public double calcularPagamento(double bonus) {
        return getSalario() + bonus;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + " | Tipo: CLT | Salário Mensal: R$ " + getSalario();
    }
}