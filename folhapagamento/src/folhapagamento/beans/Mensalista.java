package folhapagamento.beans;

public class Mensalista extends Funcionario {
    protected String cargo;

    public Mensalista(String cargo, int matricula, String rg, String cpf, String nome, String email) {
        super(matricula, rg, cpf, nome, email);
        this.cargo = cargo;
    }


    @Override
    public double salarioBruto() {
        if(cargo.equalsIgnoreCase("Diretor"))
            return 38000;
        if(cargo.equalsIgnoreCase("Gerente"))
            return 16000;
        if(cargo.equalsIgnoreCase("SuperiorAdministrativo"))
            return 10000;
        if(cargo.equalsIgnoreCase("TecnicoAdministrativo"))
            return 6000;
        if(cargo.equalsIgnoreCase("AuxiliarAdministrativo"))
            return 4000;
        if(cargo.equalsIgnoreCase("Estagiario"))
            return 1500;
        return 0;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
