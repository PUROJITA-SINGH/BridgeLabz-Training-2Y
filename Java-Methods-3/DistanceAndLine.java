public class DistanceAndLine {
    public static void main(String[] args) {
        // Sample points
        int x1 = 1, y1 = 2;
        int x2 = 4, y2 = 6;
        
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Distance: %.2f\n", distance);
        
        double[] equation = getLineEquation(x1, y1, x2, y2);
        System.out.printf("Slope: %.2f, Y-intercept: %.2f\n", equation[0], equation[1]);
        System.out.println("Equation: y = " + equation[0] + "x + " + equation[1]);
    }
    
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public static double[] getLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}
