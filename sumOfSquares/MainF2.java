package sumOfSquares;

public class MainF2 implements FunctionMV {

    public void main(String[] args) {

        System.out.println();
        Point point = new Point(3);
        double[] aPoint = {1, 2, 1};
        point.setComponents(aPoint);

        System.out.println(fx(point.getComponents()));

    }

    public double fx(double[] x) {
        double diff = Math.pow(x[0], 2);
        double a = Math.pow(1 - x[0], 2);
        double b = Math.pow(x[1] - diff, 2);

        return a + (100 * b);
    }
}
