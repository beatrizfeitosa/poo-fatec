package folhapagamento.beans;

public class Aluno extends Pessoa {
    private String ra;
    private String curso;
    private int semestre;

    public Aluno(String ra, String curso, int semestre, String rg, String nome, String email) {
        super(rg, nome, email);
        this.ra = ra;
        this.curso = curso;
        this.semestre = semestre;
    }
}
