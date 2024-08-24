public class Circulo implements Figura2D {
    private double raio;
    private Ponto2D centro;

    public Circulo(double raio, Ponto2D centro) {
        this.raio = raio;
        this.centro = new Ponto2D(centro.getX(), centro.getY());
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public Ponto2D getCentro() {
        return centro;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void moveX(double dX) {
        centro.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        centro.moveY(dY);
    }

    @Override
    public void moveXY(double X, double Y) {
        centro.moveXY(X, Y);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", centro=" + centro +
                ", area=" + area() +
                ", perimetro=" + perimetro() +
                '}';
    }
}
