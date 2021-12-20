package ss6_KeThua.bai_tap;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D()
    {

    }
    public Point2D(float x,float y)
    {
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y)
    {
        this.y = y;
        this.x = x;
    }
    public float [] getXY()
    {
        float[]sample={this.x,this.y};
        return sample;
    }


    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
