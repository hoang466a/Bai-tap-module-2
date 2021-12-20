package com.codegym;

public class Square extends Shape implements Resizeable, Colorable{
    private double side=1.0;

    public Square(){}

    public Square(double side)
    {
        this.side=side;
    }

    public Square(double side,String color, boolean filled)
    {
        super(color, filled);
        this.side=side;
    }

    public String getClassName() {

        String className = this.getClass().getSimpleName();
        return className;
    }

    public double getArea() {
        return this.side*this.side;
    }

    public double getPerimeter() {
        return 4 * this.side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + " has area is: "+this.getArea()
                + " and perimeter is:  "+this.getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        double increase=1+(percent/100);
        this.side=this.side*increase;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
