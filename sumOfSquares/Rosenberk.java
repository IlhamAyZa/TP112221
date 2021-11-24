package sumOfSquares;

public class Rosenberk implements FunctionMV {

    @Override
    public double fx(double[] x) {
        double diff = Math.pow(x[0], 2);
        double a = Math.pow(1 - x[0], 2);
        double b = Math.pow(x[1] - diff, 2);

        return a + (100 * b);
    }
}
