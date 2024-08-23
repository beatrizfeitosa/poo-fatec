public class InterfaceFiguras {
    public static void main(String[] args) {
        Ponto2D ponto01 = new Ponto2D(2, 3);
        ponto01.getX();

        Objeto2D ponto02 = new Ponto2D(2, 3);
        /*
            ponto02.getX();

            nesse caso o objeto ponto02 não consegue utilizar nenhum método
            além dos que estão declarados na interface pois ele é do tipo Objeto2D
         */

        Objeto2D ponto03 = new Ponto2D(5, 7);


        Objeto2D segmentoDeReta = new SegmentoReta(ponto01, (Ponto2D) ponto03);
        System.out.println(segmentoDeReta);

        Figura2D quadrado = new Quadrado(2, ponto01);
        System.out.println(quadrado);
    }
}
