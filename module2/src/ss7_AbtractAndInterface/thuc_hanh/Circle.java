package ss7_AbtractAndInterface.thuc_hanh;

class Circle {
    private double radius=1.0;
    private String color="red";
    private boolean filled=true;

    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle(double radius,String color,boolean filled) {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public Circle() {
    }




    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
