package ss5_Class_Object.bai_tap;
import java.util.Scanner;
public class QuadraticCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input the first coefficient: ");
        double a=input.nextDouble();
        System.out.println("Input the second coefficient: ");
        double b=input.nextDouble();
        System.out.println("Input the third coefficient: ");
        double c=input.nextDouble();
        QuadraticEquation s1=new QuadraticEquation(a,b,c);
        System.out.println(s1.getDiscriminant());
        if(s1.getDiscriminant()>0)
        {
            System.out.println("First root is: "+s1.getRoot1()+", second root is: "+s1.getRoot2());
        }
        else if(s1.getDiscriminant()==0)
        {
            System.out.println("double root is: "+s1.getRoot1());
        }
        else
        {
            System.out.println("No root");
        }

    }
}
