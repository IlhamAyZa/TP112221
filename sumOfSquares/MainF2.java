package sumOfSquares;

public class MainF2 implements FunctionMV {

    public void main(String[] args) {

        public void main(String[] args) {

        System.out.println();
        double[] aPoint = {1, 2, 1};

        System.out.println(fx(aPoint));

    }

    public double fx(double[] x) {
        double diff = Math.pow(x[0], 2);
        double a = Math.pow(1 - x[0], 2);
        double b = Math.pow(x[1] - diff, 2);

        return a + (100 * b);
    }

    }

    public double fx(double[] x) {
        double diff = Math.pow(x[0], 2);
        double a = Math.pow(1 - x[0], 2);
        double b = Math.pow(x[1] - diff, 2);

        return a + (100 * b);
    }
}
