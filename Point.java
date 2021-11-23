package tp112221;

public class Point {
    
    public int dimention;
    public double[] components;

    public Point(int dimention, double[] components) {
        this.dimention = dimention;
        this.components = components;
    }

    public Point(int dimention) {
        this.dimention = dimention;
    }

    public double[] getComponents() {
        return components;
    }

    public int getDimention() {
        return dimention;
    }

    public void setComponents(double[] components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
