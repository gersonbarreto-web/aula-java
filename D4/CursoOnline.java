package D4;

public class CursoOnline extends Curso {
    private String plataforma;
    private String codigoAcesso;

    public CursoOnline(int codigo, String nome, int cargaHoraria, double valor, String plataforma, String codigoAcesso) {
        super(codigo, nome, cargaHoraria, valor);
        this.plataforma = plataforma;
        this.codigoAcesso = codigoAcesso;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + " | Tipo: Online | Plataforma: " + plataforma + " | Cód. Acesso: " + codigoAcesso;
    }
}