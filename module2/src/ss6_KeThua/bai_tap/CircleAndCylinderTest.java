package ss6_KeThua.bai_tap;

public class CircleAndCylinderTest {
    public static void main(String[] args) {
        Circle s1=new Circle();
        Circle s2=new Cylinder();
        Cylinder s3=new Cylinder(3.0,"orange",4.0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
        System.out.println(s3.getArea());
        System.out.println(s3.getVolume());

    }
}
