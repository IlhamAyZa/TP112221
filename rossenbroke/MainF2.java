package rossenbroke;

public class MainF2 {
    
    public void main(String[] args) {
        
        System.out.println();
        Point point = new Point(3);
        double[] aPoint = {1, 2, 1};
        point.setComponents(aPoint);
        
        System.out.println(fRosen(point));
        
    }
    
    public double fRosen(Point point) {
	double diff = Math.pow(point.components[0], 2);
	double a = Math.pow(1-point.components[0], 2);
	double b = Math.pow(point.components[1]-diff, 2);
                
	return a + (100*b);
    }
}
