package ss2_array_function.bai_tap;
import java.util.Scanner;
public class ArrayMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min;
        int address=0;

        System.out.print("The length of the array: ");
        int size = input.nextInt();
        while(size<0)
        {
            System.out.print("The length of the array: ");
            size = input.nextInt();
        }
        int arr[]=new int[size];
        min=arr[0];
        address=0;

        for (int i=0;i<size;i++)
        {

            arr[i]=(int)Math.round(99 * Math.random()) + 1;
            if(i==0)
            {
                min=arr[0];
                address=0;
            }
            System.out.println("Value of an array["+i + "]: "+arr[i]);
            if(arr[i]<min)
            {
                min=arr[i];
                address=i;
            }

        }

        System.out.println("min number in random array is: "+"arr["+address+"]"+": "+min);







    }

}
