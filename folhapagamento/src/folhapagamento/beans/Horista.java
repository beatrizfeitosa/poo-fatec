package folhapagamento.beans;

public class Horista extends Funcionario {
    protected double valorHora;
    protected double totalHoras;

    public Horista(double valorHora, double totalHoras, int matricula, String departamento, String CPF, String RG, String nome, String email) {
        super(matricula, departamento, CPF, RG, nome, email);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getTotalHoras() {
        return totalHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setTotalHoras(double totalHoras) {
        this.totalHoras = totalHoras;
    }

    @Override
    public double salarioBruto() {
        return  4 * valorHora * totalHoras;
    }
}
