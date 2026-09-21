package D2;
public class Moto extends Veiculo {

    public Moto(String placa, String modelo, int ano, double valorDiaria) {
        super(placa, modelo, ano, valorDiaria);
    }

    @Override
    public String exibeDados() {
        return "[MOTO] " + super.exibeDados();
    }
}