package ss4_Method.bai_tap;

import ss4_Method.thuc_hanh.Student;

public class TestCircle {
    public static void main(String[] args) {
        Circle s1=new Circle();
        Circle s2=new Circle(5);
        System.out.println(s1.getRadius());
        System.out.println(s2.getRadius());
        System.out.println(s2.getArea());
    }
}
