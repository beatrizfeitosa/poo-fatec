public class Aula02 {
    public static void main(String[] args) {
        Objeto2D ponto01 = new Ponto2D(2, 3);
        Objeto2D ponto02 = new Ponto2D(5, 7);
        ponto01.moveX(2);
        Objeto2D segmentoReta = new SegmentoReta((Ponto2D) ponto01, (Ponto2D) ponto02);
        Quadrado quadrado = new Quadrado(4, (Ponto2D) ponto01);
        Circulo circulo = new Circulo(3, (Ponto2D) ponto01);
        System.out.println(ponto01.toString());
        if(segmentoReta.getClass().equals(SegmentoReta.class))
            System.out.println(segmentoReta);
        System.out.println(quadrado);
        System.out.println(circulo);
    }
}
