/**
 * @author Beatriz Feitosa
 */
public class Ponto2D implements Objeto2D{
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "Ponto2D(" + x + ", " + y + ")";
    }
}
