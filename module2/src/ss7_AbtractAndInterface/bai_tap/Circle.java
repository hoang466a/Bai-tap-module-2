package com.codegym;

class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + " has area is: "+this.getArea()
                + " and perimeter is:  "+this.getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
    public String getClassName() {

        String className = this.getClass().getSimpleName();
        return className;
    }

    @Override
    public void resize(double percent) {
        double increase=1+(percent/100);
        this.radius=this.radius*increase;
    }
}
