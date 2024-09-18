package folhapagamento.beans;

public class ProfessorHorista extends Horista {
    private String titulo;
    private int nivel;

    public ProfessorHorista(String titulo, int nivel, int totalHoras, int matricula, String departamento, String CPF, String RG, String nome, String email) {
        super(0, totalHoras, matricula, departamento, CPF, RG, nome, email);
        this.titulo = titulo;
        this.nivel = nivel;
        calculoValorHora();
    }

    private void calculoValorHora() {
        if(titulo.equalsIgnoreCase("Doutor")) {
            valorHora = 50;
        } else if(titulo.equalsIgnoreCase("Mestre")) {
            valorHora = 40;
        } else if(titulo.equalsIgnoreCase("Especialista")) {
            valorHora = 20;
        } else {
            valorHora = 10;
        }

        if(nivel == 3) {
            valorHora += 20;
        } else if(nivel == 2) {
            valorHora += 10;
        }
    }

    @Override
    public double salarioBruto() {
        return 4 * valorHora * totalHoras * 1.45;
    }
}
