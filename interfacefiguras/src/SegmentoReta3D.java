public class SegmentoReta3D implements Objeto3D {
    private Ponto3D p0;
    private Ponto3D p1;

    public SegmentoReta3D(Ponto3D p0, Ponto3D p1) {
        this.p0 = new Ponto3D(p0.getX(), p0.getY(), p0.getZ());
        this.p1 = new Ponto3D(p1.getX(), p1.getY(), p1.getZ());;
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
        p1.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
        p1.moveY(dY);
    }

    @Override
    public void moveXY(double X, double Y) {
        p0.moveXY(X, Y);
        p1.moveXY(X, Y);
    }

    @Override
    public void moveZ(double dZ) {
        p0.moveZ(dZ);
        p1.moveZ(dZ);
    }

    @Override
    public void moveXZ(double dX, double dZ) {
        p0.moveXZ(dX, dZ);
        p1.moveXZ(dX, dZ);
    }

    @Override
    public void moveYZ(double dY, double dZ) {
        p0.moveYZ(dY, dZ);
        p1.moveYZ(dY,dZ);
    }

    @Override
    public void moveXYZ(double dX, double dY, double dZ) {
        p0.moveXYZ(dX, dY, dZ);
        p1.moveXYZ(dX, dY, dZ);
    }

    @Override
    public String toString() {
        return "SegmentoReta3D{" +
                "p0=" + p0 +
                ", p1=" + p1 +
                '}';
    }
}
