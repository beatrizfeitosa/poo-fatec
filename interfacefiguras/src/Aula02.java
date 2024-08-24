public class Aula02 {
    public static void main(String[] args) {
        /* Objeto2D ponto01 = new Ponto2D(2, 3);
        Objeto2D ponto02 = new Ponto2D(5, 7);
        ponto01.moveX(2);
        Objeto2D segmentoReta = new SegmentoReta((Ponto2D) ponto01, (Ponto2D) ponto02);
        Quadrado quadrado = new Quadrado(4, (Ponto2D) ponto01);
        Circulo circulo = new Circulo(3, (Ponto2D) ponto01);
        System.out.println(ponto01.toString());
        if(segmentoReta.getClass().equals(SegmentoReta.class))
            System.out.println(segmentoReta);
        System.out.println(quadrado);
        System.out.println(circulo); */

        Ponto3D p0 = new Ponto3D(2, 3, 5);
        Ponto3D p1 = new Ponto3D(7, 12, 9);
        SegmentoReta3D segReta3D = new SegmentoReta3D(p0, p1);
        Esfera esfera = new Esfera(p1, 5);

        System.out.println("Centro: " + esfera.getCentro());
        System.out.println("Raio: " + esfera.getRaio());
        System.out.println("Volume: " + esfera.volume());
        System.out.println("Superficie: " + esfera.superficie());
        System.out.println("Ponto P1: " + p1);
    }
}
