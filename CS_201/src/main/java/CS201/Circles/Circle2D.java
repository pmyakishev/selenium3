package CS201.Circles;

public class Circle2D {
    //Declaring coordinates data fields.
    double x;
    double y;
    //Getter for x.
    public void getX(double x) {
        this.x = x; }
    //Getter for y.
    public void getY(double y) {
        this.y = y; }
    //Declaring radius variable
    double radius;
    // A method to get radius.
    public void getRadius(double radius) {
        this.radius= radius; }
    //A constructor to create a circle without parameters.
    public Circle2D(){
        this (0,0,1); }
    // A constructor that creates a circle with the specified x, y, radius.
    public Circle2D (double x,double y,double radius){
        this.x =x;
        this.y =y;
        this.radius =radius;
        }
    // A method to calculate and return area of the circle.
    public double getArea(double radius){
        return radius*radius*Math.PI; }

    // A method to calculate and return radius.
    public double getPerimeter(double radius){ return  (radius+radius)*Math.PI; }
    //A  method returns true if the specified point (x, y) is inside of the circle.
    public boolean containsCoord(double X, double Y) {
        if (Math.sqrt((x-X) * (x-X) + (y-Y) * (y-Y)) <radius) {
            return true;
        } else {return false;}
    }
    //A method checks if a passed circle is with the circle.
    public boolean containsCircle(Circle2D circle) {
        if (Math.sqrt((x - circle.x) * (x - circle.x) + (y - circle.y) * (y - circle.y)) + circle.radius < radius) {
            return true;
        } else {return false; }
    }
    // A method checks if a passed circle overlaps with the circle.
    public boolean overlaps(Circle2D circle) {
        if (Math.sqrt((x -circle.x) * (x -circle.x) + (y -circle.y) * (y -circle.y)) +circle.radius >radius
                && Math.sqrt((x -circle.x) * (x -circle.x) + (y -circle.y) * (y -circle.y)) +circle.radius <radius + circle.radius) {
            return true;
        } else {
            return false;
        }
    }
}
