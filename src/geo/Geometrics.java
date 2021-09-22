package geo;
public class Geometrics {
    private static double x = 10.0;
    private static double y = 5.0;
    private static double z = 3.0;
    private static int x1 = 8;
    private static int y1 = 7;
    private static int z1 = 10;
    private static int x2 = 100;
    private static int y2 = 57;
    private static int z2 = 129;
    private static int x3 = 45;
    private static int y3 = 89;
    private static int z3 = 69;

    public static void main(String[] args) {
        // area ... Fläche
        System.out.println("Square area");
        System.out.println(squareArea(23));
        System.out.println(squareArea(21));
        
        // perimeter ... Umfang
        System.out.println("Square perimeter");
        System.out.println(squarePerimeter(23,22));
        System.out.println(squarePerimeter(21,33));

        System.out.println("Rectangle area");
        System.out.println(squarePerimeter(5,99));
        
        System.out.println("Rectangle perimeter");
        System.out.println(rectangleArea(88,55));
     

        System.out.println("Zone of a sphere");
        double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
        System.out.println(zoneOfaSphere(1.1,2.2,3.3));

        System.out.println("Sphere with cylinder");
        System.out.println(sphereWithcylinder(3.3));

        System.out.println("Ungula");
        System.out.println(Ungula(2.2,3.3));
    }
    public static int squareArea(int x) {
    	return x*x;
    }
    public static int squarePerimeter(int x, int y) {
    	return x*4;
    }
    public static int rectangleArea(int x, int y) {
    	return x*y*2;
    }
    public static double zoneOfaSphere(double x, double y, double z) {
    	return  (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;	
    }
    public static double sphereWithcylinder( double z) {
    	return  Math.PI * Math.pow(z, 3) / 6;	
    }
    public static double Ungula( double x, double z) {
    	return ( 2 * x * z) / 3;	
    }
}
