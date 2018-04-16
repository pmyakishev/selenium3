package CS201.Circles;

public class TestCircle2D extends Circle2D {

    public static void main(String[] args) {
        // Printing coordinates and radius of a circle c1.
        System.out.println("\nCircle c1 coordinates: 2,2 and radius is 5.5");
        System.out.println("\nA radius of c1 is: " + getMyArea(5.5));
        System.out.println("\nA perimeter of c1 is: " +getMyPerimeter(5.5));

        checkIfContainsCoord(3, 3);
        checkIfContainsCircle(4, 5, 10.5);
        checkIfOverlaps(3, 5, 2.3);
    }

    public static double getMyArea(double s){
        Circle2D c1 = new Circle2D();
        double myArea = c1.getArea(s);
        return myArea; }

    public static double getMyPerimeter(double s){
        Circle2D c1 = new Circle2D();
        double myPerimeter = c1.getPerimeter(s);
        return myPerimeter; }

    //A method will print the comment the specified point (r, w) is inside of the circle.
    public static void checkIfContainsCoord(double r, double w) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        if (c1.containsCoord(r, w)) {
            System.out.println("\nCoordinates: " + r + "," + w + " are located within circle c1.");
        } else { System.out.println("\nCoordinates: " + r + "," + w + " are NOT located within circle c1."); }
    }

    //A method will print the comment if new circle is with the circle c1.
    public static void checkIfContainsCircle(double r, double w, double f) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        if (c1.containsCircle(new Circle2D(r, w, f))) {
            System.out.println("\nA circle with coordinates: " + r + "," + w + " and radius " + f + " is located within circle c1.");
        } else { System.out.println("\nA circle with coordinates: " + r + "," + w + " and radius " + f + " is NOT located within circle c1."); }
    }

    //A method will print the comment if new circle overlaps the circle c1.
    public static void checkIfOverlaps(double j, double u, double t) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        if (c1.overlaps(new Circle2D(j, u, t))) {
            System.out.println("\nA circle with coordinates: " + j + "," + u + " and radius " + t + " is overlaps within circle c1.");
        } else { System.out.println("\nA circle with coordinates: " + j + "," + u + " and radius " + t + " is NOT overlaps within circle c1."); }
    }
}

