package folhapagamento;

import folhapagamento.beans.*;
import org.w3c.dom.ls.LSOutput;

public class FolhaPagamento {
    public static void main(String[] args) {
        Pessoa p01 = new Pessoa("12.345.678", "Beatriz Feitosa", "beatrizfeitosa@gmail.com");
        Funcionario f01 = new Mensalista("Diretor", 12345, "12.345.678", "123.456.789-10", "Beatriz Feitosa", "beatrizfeitosa@gmail.com");
        Funcionario f02 = new Horista(80, 20, "Gerente", 12345, "12.345.678", "123.456.789-10", "Beatriz Feitosa", "beatrizfeitosa@gmail.com");

        Funcionario folha[] = new Funcionario[2];
        folha[0] = f01;
        folha[1] = f02;

        double totalSalarioBruto = 0;
        double totalSalarioLiquido = 0;
        double totalIRRF = 0;
        double totalINSS = 0;

        for(int i = 0; i < folha.length; i++) {
            System.out.println(folha[i].salarioBruto() + "-" + folha[i].IRRF() + "-" + folha[i].INSS() + "="
                + folha[i].salarioLiquido());
            totalSalarioBruto += folha[i].salarioBruto();
            totalSalarioLiquido += folha[i].salarioLiquido();
            totalINSS += folha[i].INSS();
            totalIRRF += folha[i].IRRF();
        }

        System.out.println(totalSalarioBruto + "-" + totalIRRF + "-" + totalINSS + "=" + totalSalarioLiquido);
    }
}
