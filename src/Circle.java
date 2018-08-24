//Java Program to calculate Circle properties
public class Circle {
    private int x;
    private int y; //location of Circle
    private double radius; 

    public Circle(){ //initialises circle to 0
        this(0, 0, 0);
    }

    public Circle(int x, int y, double radius){ //initializes the attributes to the given values
        setX(x);
        setY(y);
        setRadius(radius);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double getRadius(){
        return this.radius;
    }

    public int getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return (int)area;
    }

    public static void main(String[] args) {
        Circle c = new Circle(1, 2, 5);

        c.setX(4);
        c.setY(5);
        c.setRadius(6);
        System.out.println("x      : " + c.getX());
        System.out.println("y      : " + c.getY());
        System.out.println("radius : " + c.getRadius());
        System.out.println("area   : " + c.getArea());

        c.setRadius(-5);
        System.out.println("radius : " + c.getRadius());
        c = new Circle(1, 1, -4);
        System.out.println("radius : " + c.getRadius());
    }

}


