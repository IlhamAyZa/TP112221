package tp112221;

import java.util.Scanner;

public abstract class MainF1 implements FunctionMV{
    
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
    }

    @Override
    public double fx(double[] x) {
        double sum = 0;
        
        for (double num : x){
            sum += num * num ;
        }
        
        return sum;
    }   
}
