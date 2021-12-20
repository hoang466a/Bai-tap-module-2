package ss2_array_function.bai_tap;
import java.util.Scanner;
public class ClassMerge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int array1[]=new int[5];
        int array2[]=new int[5];
        int array3[]=new int[10];
        for (int i=0;i<array1.length;i++)
        {
            System.out.print("Value of an array1 " + (i + 1) + ": ");
            array1[i] = input.nextInt();
        }
        for (int i=0;i<array2.length;i++)
        {
            System.out.print("Value of an array2 " + (i + 1) + ": ");
            array2[i] = input.nextInt();
        }

        int flag=array1.length;
        for (int j=0;j<array1.length;j++)
        {
            array3[j] = array1[j];
        }
        for (int j=0;j<array2.length;j++)
        {array3[flag] = array2[j];
            flag++;
        }

        for (int i=0;i<array3.length;i++)
        {
            System.out.println("Value of an array3 " + (i + 1) + ": "+array3[i]);
        }


    }
}
