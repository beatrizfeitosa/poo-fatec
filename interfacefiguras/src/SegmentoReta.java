public class SegmentoReta implements Objeto2D {
    private Ponto2D p0;
    private Ponto2D p1;

    public SegmentoReta(Ponto2D p0, Ponto2D p1) {
        this.p0 = new Ponto2D(p0.getX(), p0.getY());
        this.p1 = new Ponto2D(p1.getX(), p1.getY());
    }

    public Ponto2D getP0() {
        return p0;
    }

    public void setP0(Ponto2D p0) {
        this.p0 = p0;
    }

    public Ponto2D getP1() {
        return p1;
    }

    public void setP1(Ponto2D p1) {
        this.p1 = p1;
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
    public String toString() {
        return "SegmentoReta{" +
                "p0=" + p0 +
                ", p1=" + p1 +
                '}';
    }
}
