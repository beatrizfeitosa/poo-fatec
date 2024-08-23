public class Quadrado implements Figura2D {
    private double lado;
    private Ponto2D p0;

    public Quadrado(double lado, Ponto2D p0) {
        this.lado = lado;
        this.p0 = new Ponto2D(p0.getX(), p0.getY());
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Ponto2D getP0() {
        return p0;
    }

    public void setP0(Ponto2D p0) {
        this.p0 = p0;
    }

    public Ponto2D findP1() {
        return new Ponto2D(p0.getX() + lado, p0.getY());
    }

    public Ponto2D findP2() {
        return new Ponto2D(p0.getX(), p0.getY() + lado);
    }

    public Ponto2D findP3() {
        return new Ponto2D(p0.getX() + lado, p0.getY() + lado);
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", area=" + area() +
                ", perimetro=" + perimetro() +
                ", p0=" + p0 +
                ", p1=" + findP1() +
                ", p2=" + findP2() +
                ", p3=" + findP3() + '}';
    }
}
