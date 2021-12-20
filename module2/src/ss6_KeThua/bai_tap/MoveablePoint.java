package ss6_KeThua.bai_tap;

public class MoveablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveablePoint(float x,float y,float xSpeed,float ySpeed)
    {
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MoveablePoint()
    {

    }



    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float array[]={this.xSpeed,this.ySpeed};
        return array;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+"),speed=("+this.getxSpeed()+","+this.getySpeed()+")";
    }

    public MoveablePoint move()
    {
        this.setX(this.getX()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
        return this;
    }
}
