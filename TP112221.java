package tp112221;

import java.util.Scanner;

public abstract class TP112221 implements FunctionMV{
    
    protected Scanner scn = new Scanner(System.in);
    protected double[] massiveOfDoubles;
    
    public void main(String[] args) {
        System.out.print("Enter length of massive: ");
        int length = scn.nextInt();
        System.out.println("");
        
        massiveOfDoubles = new double[length];
        
        for (int i = 0; i < length; i++){
            System.out.printf("Enter %d number in massive: ", (i+1) );
            massiveOfDoubles[i] = scn.nextDouble();
            System.out.println("");
        }

        System.out.println(fx(massiveOfDoubles));
        
        System.out.println();
        Point point = new Point(3);
    }

    @Override
    public double fx(double[] x) {
        double sum = 0;
        
        for (double num : x){
            sum += num * num ;
        }
        
        return sum;
    }
    
    public double fRosen(Point point) {
		double diff = Math.pow(point.components[0], 2);
		double a = Math.pow(1-point.components[0], 2);
		double b = Math.pow(point.components[1]-diff, 2);
                
		return a + (100*b);
	}
    
}
