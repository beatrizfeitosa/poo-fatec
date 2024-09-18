package interfacefiguras.beans;

public class Esfera implements Figura3D {
    private Ponto3D centro;
    private double raio;

    public Esfera(Ponto3D centro, double raio) {
        this.centro = new Ponto3D(centro.getX(), centro.getY(), centro.getZ());
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto3D getCentro() {
        return centro;
    }

    public void setCentro(Ponto3D centro) {
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double volume() {
        return (4/3) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public double superficie() {
        return 4 * Math.PI * raio * raio;
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
    public void moveZ(double dZ) {
        centro.moveZ(dZ);
    }

    @Override
    public void moveXZ(double dX, double dZ) {
        centro.moveXZ(dX, dZ);
    }

    @Override
    public void moveYZ(double dY, double dZ) {
        centro.moveYZ(dY, dZ);
    }

    @Override
    public void moveXYZ(double dX, double dY, double dZ) {
        centro.moveXYZ(dX, dY, dZ);
    }

    @Override
    public String toString() {
        return "beans.Esfera{" +
                "centro=" + centro +
                ", raio=" + raio +
                ", superficie=" + superficie() +
                ", volume=" + volume() +
                '}';
    }
}
