package tp112221;

import java.util.Scanner;

public abstract class TP112221 implements SumOfSquares{
    
    protected static Scanner scn = new Scanner(System.in);
    protected static double[] massiveOfDoubles;
    
    public static void main(String[] args) {
        System.out.print("Enter length of massive: ");
        int length = scn.nextInt();
        System.out.println("");
        
        massiveOfDoubles = new double[length];
        
        for (int i = 0; i < length; i++){
            System.out.printf("Enter %d number in massive: ", (i+1) );
            massiveOfDoubles[i] = scn.nextDouble();
            System.out.println("");
        }

        System.out.println(calculateSumOfSquares(massiveOfDoubles));
    }

    public static double calculateSumOfSquares(double[] massive) {
        double sum = 0;
        
        for (double num : massive){
            sum += num * num ;
        }
        
        return sum;
    }
    
}
