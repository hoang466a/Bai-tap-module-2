package ss6_KeThua.bai_tap;

public class Cylinder extends Circle{
    private double hight=2.0;

    public Cylinder()
    {}
    public Cylinder(double hight)
    {
        this.hight=hight;
    }
    public Cylinder(double radius,String color,double hight)
    {
        super(radius,color);
        this.hight=hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getArea()
    {
        return Math.PI*2*(this.getRadius()*this.getRadius()+this.getRadius()*this.hight);
    }

    public double getVolume()
    {
        return Math.PI*this.getRadius()*this.getRadius()*this.hight;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + hight +
                ", radius=" + this.getRadius() +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
