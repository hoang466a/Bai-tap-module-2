package ss6_KeThua.thuc_hanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);



      /* Shape nv1 = new Shape();
        Shape nv2 = new Circle1();
        Circle1 nv3 = new Circle1();
        nv1=nv3;
        nv3.getRadius();

         nv1.aloha();

         nv2.aloha();

         nv2.aloha();*/

    }
}
