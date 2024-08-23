/**
 * @author biahf
 */
public interface Objeto3D extends Objeto2D {
    public void moveZ(double dZ);
    public void moveXZ(double dX, double dZ);
    public void moveYZ(double dY, double dZ);
    public void moveXYZ(double dX, double dY, double dZ);
}
