package ss2_array_function.bai_tap;
import java.util.Scanner;
public class ValueFromAnArray_Delete {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in) ;
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = input.nextInt();
        do {
            if(size<0)
            {
                System.out.print("Enter a size:");
                size = input.nextInt();
            }
            else
            break;
        } while (size < 0);
        array=new int[size];
        for(int i=0;i<array.length;i++)
        {
            System.out.print("Value of an array " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Value of number you want to find: ");
        int number = input.nextInt();
        int number1;
        for(int i=0;i<array.length;i++)
        {
           if(number==array[i])
           {
               number1=i;
               System.out.println("Phần tử được tìm thấy tại vị trí: "+i);
               for(i=number1;i< array.length-1;i++)
               {
                    array[i]=array[i+1];
               }
               array[array.length-1]=0;
               for(i=0;i<array.length;i++)
               {
                   System.out.println("Value of an array " + (i + 1) + " is: "+array[i]);

               }

               break;
           }
           else if(i== array.length-1)
           {
               System.out.println("Không tìm thấy giá trị cần tìm trong mảng");
               break;
           }
        }



    }
}
