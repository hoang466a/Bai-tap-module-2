package ss5_Class_Object.bai_tap;

public class Fan {
    public final int slow=1;
    public final int medium=2;
    public final int fast=3;


    private int speed=slow;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public Fan()
    {

    }
    public Fan(String speed,boolean on,double radius,String color )
    {
        if(speed.equals("slow"))
        {
            this.speed=slow;
        }
        else if(speed.equals("medium"))
        {
            this.speed=medium;
        }
        else if(speed.equals("fast"))
        {
            this.speed=fast;
        }
    this.on=on;
    this.radius=radius;
    this.color=color;
    }

    @Override
    public String toString() {
        if(on==true)
        {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}'+", fan is on";
        }
        else
        {
            return "Fan{" +

                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    '}'+", fan is off";
        }
    }
}
