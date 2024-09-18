package folhapagamento.beans;

import java.util.Objects;

public class Funcionario extends Pessoa implements Empregado {
    protected int matricula;
    protected String cpf;

    public Funcionario(int matricula, String rg, String cpf, String nome, String email) {
        super(rg, nome, email);
        this.matricula = matricula;
        this.cpf = cpf;
    }

    @Override
    public double salarioLiquido() {
        return salarioBruto()-IRRF()-INSS();
    }

    @Override
    public double salarioBruto() {
        return 0;
    }

    @Override
    public double INSS() {
        return 0.11*salarioBruto();
    }

    @Override
    public double IRRF() {
        return 0.275*salarioBruto();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", cpf='" + cpf + '\'' +
                ", rg='" + getRG() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Funcionario that = (Funcionario) o;
        return matricula == that.matricula && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricula, cpf);
    }
}
