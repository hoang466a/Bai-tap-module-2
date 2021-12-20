package ss6_KeThua.bai_tap;

public class Point2And3DTest {
    public static void main(String[] args) {
        Point2D s1=new Point2D();
        Point2D s2=new Point2D(1.8f,9.0f);
        Point2D s3=new Point3D();
        Point2D s4=new Point3D(1.5f,2.7f,1.2f);

        float []array=s1.getXY();
        float []array2=s2.getXY();
        float []array3=((Point3D)s3).getXYZ();
        float []array4=((Point3D)s4).getXYZ();

        for (float x1:array2)
            System.out.println(x1);

        for (float x3:array4)
            System.out.println(x3);

    }

}
