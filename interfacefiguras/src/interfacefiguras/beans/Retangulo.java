package interfacefiguras.beans;

public class Retangulo implements Figura2D, Objeto2D {
    private int base;
    private int altura;

    private Ponto2D p0;

    public Ponto2D getP0() {
        return p0;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
    }

    @Override
    public void moveXY(double X, double Y) {
        p0.moveXY(X, Y);
    }

    public Ponto2D findP1() {
        return new Ponto2D(p0.getX() + base, p0.getY());
    }

    public Ponto2D findP2() {
        return new Ponto2D(p0.getX(), p0.getY() + altura);
    }

    public Ponto2D findP3() {
        return new Ponto2D(p0.getX() + base, p0.getY() + altura);
    }

    @Override
    public String toString() {
        return "beans.Quadrado{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area() +
                ", perimetro=" + perimetro() +
                ", p0=" + p0 +
                ", p1=" + findP1() +
                ", p2=" + findP2() +
                ", p3=" + findP3() + '}';
    }
}
