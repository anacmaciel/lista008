package gerenciadordecandidatos;

public class Candidato {
    private String numeroDeMatricula;
    private double nota;

    public Candidato(String numeroDeMatricula, double nota) {
        this.numeroDeMatricula = numeroDeMatricula;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "numeroDeMatricula='" + numeroDeMatricula + '\'' +
                ", nota=" + nota +
                '}';
    }

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
