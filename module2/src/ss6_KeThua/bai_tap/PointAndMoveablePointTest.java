package ss6_KeThua.bai_tap;

public class PointAndMoveablePointTest {
    public static void main(String[] args) {
        Point s1=new Point(1.0f,2.0f);
        Point s2=new MoveablePoint(s1.getX(),s1.getY(),5.0f,6.0f);
        System.out.println(s1);
        System.out.println(s2);
        ((MoveablePoint)s2).move();
        System.out.println("aloha");
        System.out.println(s1);
        System.out.println(s2);


    }



}
