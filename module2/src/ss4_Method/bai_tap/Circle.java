package ss4_Method.bai_tap;

public class Circle {
    private double radius=1.0;
    private static String color="red";


    public Circle()
    {

    }
    public Circle(double r)
    {
        this.radius=r;
        this.color="red";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    public static String getColor() {
        return color;
    }






}
