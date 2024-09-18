package folhapagamento.beans;

import java.util.Objects;

public abstract class Funcionario extends Pessoa implements Empregado {
    protected int matricula;
    protected String departamento;
    protected String CPF;

    public Funcionario(int matricula, String departamento, String CPF, String RG, String nome, String email) {
        super(RG, nome, email);
        this.matricula = matricula;
        this.departamento = departamento;
        this.CPF = CPF;
    }

    @Override
    public double salarioLiquido() {
        return salarioBruto() - IRRF() - INSS();
    }

    @Override
    public double INSS() {
        double salario = salarioBruto();
        if(salario >= 7507.49) {
            return 0.14 * 7507.49;
        } else if (salario >= 3696.69 && salario < 7507.49) {
            return 0.12 * salario;
        } else if (salario >= 2669.69 && salario < 3696.69) {
            return 0.09 * salario;
        } else if (salario >= 1412.01 && salario < 2669.69) {
            return 0.09 * salario;
        } else {
            return 0.075 * salario;
        }
    }

    @Override
    public double IRRF() {
        double salario = salarioBruto() - INSS();
        if(salario >= 4664.68) {
            return 0.275 * salario - 884.96;
        } else if (salario >= 3751.06 && salario < 4664.68) {
            return 0.225 * salario - 651.73;
        } else if ( salario >= 2826.66 && salario < 3751.06) {
            return 0.15 * salario - 370.40;
        } else if (salario >= 2592.21 && salario < 2826.66) {
            return 0.075 * salario - 158.40;
        } else {
            return salario;
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "RG=" + rg + ", nome=" + nome + ", email=" + email + "\n matricula=" + matricula + ", departamento=" + departamento + ", CPF=" + CPF + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.matricula;
        hash = 67 * hash + Objects.hashCode(this.CPF);
        hash = 67 * hash + Objects.hashCode(this.rg);
        hash = 67 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
}
