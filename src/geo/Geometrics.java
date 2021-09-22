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
        System.out.println("x * y = " + x * y);
        System.out.println("x1 * y1 = " + x1 * y1);
        System.out.println("x2 * y2 = " + x2 * y2);
        System.out.println("x3 * y3 = " + x3 * y3);

        System.out.println("Rectangle perimeter");
        System.out.println("x + y = " + x + y);
        System.out.println("x1 + y1 = " + x1 + y1);
        System.out.println("x2 + y2 = " + x2 + y2);
        System.out.println("x3 + y3 = " + x3 + y3);

        System.out.println("We can also calculate some volumes");
        /*
            z is our height
            y is our radius
         */
        System.out.println("Zone of a sphere");
        double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
        System.out.println(v);

        System.out.println("Sphere with cylinder");
        System.out.println(Math.PI * Math.pow(z, 3) / 6);

        System.out.println("Ungula");
        System.out.println((double) (2 * x3 * z3) / 3);
    }
    public static int squareArea(int x) {
    	return x*x;
    }
    public static int squarePerimeter(int x, int y) {
    	return x+y;
    }
}
