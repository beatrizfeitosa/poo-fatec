package interfacefiguras;

import interfacefiguras.beans.Esfera;
import interfacefiguras.beans.Ponto3D;
import interfacefiguras.beans.SegmentoReta3D;

public class Aula02 {
    public static void main(String[] args) {
        /* beans.Objeto2D ponto01 = new beans.Ponto2D(2, 3);
        beans.Objeto2D ponto02 = new beans.Ponto2D(5, 7);
        ponto01.moveX(2);
        beans.Objeto2D segmentoReta = new beans.SegmentoReta((beans.Ponto2D) ponto01, (beans.Ponto2D) ponto02);
        beans.Quadrado quadrado = new beans.Quadrado(4, (beans.Ponto2D) ponto01);
        beans.Circulo circulo = new beans.Circulo(3, (beans.Ponto2D) ponto01);
        System.out.println(ponto01.toString());
        if(segmentoReta.getClass().equals(beans.SegmentoReta.class))
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
