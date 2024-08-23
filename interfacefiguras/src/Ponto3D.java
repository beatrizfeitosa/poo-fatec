public class Ponto3D implements Objeto3D {
    private double x;
    private double y;
    private double z;

    public Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void moveZ(double dZ) {
        z += dZ;
    }

    @Override
    public void moveXZ(double dX, double dZ) {
        x += dX;
        z += dZ;
    }

    public void moveYZ(double dY, double dZ) {
        y += dY;
        z += dZ;
    }

    @Override
    public void moveXYZ(double dX, double dY, double dZ) {
        x += dX;
        y += dY;
        z += dZ;
    }

    @Override
    public void moveX(double dX) {
        x += dX;
    }

    @Override
    public void moveY(double dY) {
        y += dY;
    }

    @Override
    public void moveXY(double X, double Y) {
        x += X;
        y += Y;
    }

    Ponto2D projecaoXY() {
        return new Ponto2D(x, y);
    }

    Ponto2D projecaoXZ() {
        return new Ponto2D(x, z);
    }

    @Override
    public String toString() {
        return "Ponto3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
