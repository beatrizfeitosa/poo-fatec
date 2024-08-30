package folhapagamento.beans;

public class Horista extends Mensalista {
    double valorHora;
    int totalHoras;

    public Horista(double valorHora, int totalHoras, String cargo, int matricula, String rg, String cpf, String nome, String email) {
        super(cargo, matricula, rg, cpf, nome, email);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }
}
