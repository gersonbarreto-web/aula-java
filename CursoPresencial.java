package D4;

public class CursoPresencial extends Curso {
    private String sala;
    private String turno;

    public CursoPresencial(int codigo, String nome, int cargaHoraria, double valor, String sala, String turno) {
        super(codigo, nome, cargaHoraria, valor);
        this.sala = sala;
        this.turno = turno;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + " | Tipo: Presencial | Sala: " + sala + " | Turno: " + turno;
    }
}