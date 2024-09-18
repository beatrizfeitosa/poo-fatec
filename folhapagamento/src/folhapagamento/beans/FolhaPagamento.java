package folhapagamento.beans;

import folhapagamento.beans.*;

public class FolhaPagamento {
    public static void main(String[] args) {
        Mensalista m01 = new Mensalista("Diretor", 12345, "TI", "12.345.678", "123.456.789-10", "Beatriz", "beatrizfeitosa@gmail.com");
        m01.getCPF();

        Pessoa p01 = new Pessoa("12.345.678", "Beatriz Feitosa", "beatrizfeitosa@gmail.com");
        Funcionario f01 = new Mensalista("Diretor", 12345, "TI", "12.345.678", "123.456.789-10", "Beatriz Feitosa", "beatrizfeitosa@gmail.com");
        Funcionario f02 = new Horista(80, 20, 45678, "RH", "354.694.123-70", "35.987.123", "Maria Luiza", "marialuiza@gmail.com");
        Funcionario f03 = new ProfessorHorista("Doutor", 3, 40, 58876, "Administração", "336.128.775-89", "13.556.214", "Luiz", "luiz@gmail.com");

        Funcionario folha[] = new Funcionario[3];
        folha[0] = f01;
        folha[1] = f02;
        folha[2] = f03;

        double totalSalarioBruto = 0;
        double totalSalarioLiquido = 0;
        double totalIRRF = 0;
        double totalINSS = 0;

        for(int i = 0; i < folha.length; i++) {
            System.out.println(folha[i].getNome() + ": " + folha[i].salarioBruto() + " - " + folha[i].IRRF() + " - " + folha[i].INSS() + " = "
                + folha[i].salarioLiquido());
            totalSalarioBruto += folha[i].salarioBruto();
            totalSalarioLiquido += folha[i].salarioLiquido();
            totalINSS += folha[i].INSS();
            totalIRRF += folha[i].IRRF();
        }

        System.out.println("Total: " + totalSalarioBruto + " - " + totalIRRF + " - " + totalINSS + " = " + totalSalarioLiquido);
    }
}
