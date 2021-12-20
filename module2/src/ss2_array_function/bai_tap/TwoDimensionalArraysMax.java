package ss2_array_function.bai_tap;
import java.util.Scanner;
public class TwoDimensionalArraysMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max;
        int address=0,address2=0;

        System.out.print("The length of the columns in the array: ");
        int number1 = input.nextInt();
        while(number1<0)
        {
            System.out.print("The length of the columns in the array: ");
            number1 = input.nextInt();
        }


        System.out.print("The length of the rows in the array: ");
        int number2 = input.nextInt();
        while(number2<0)
        {
            System.out.print("The length of the rows in the array: ");
            number2 = input.nextInt();
        }
        int arr[][]=new int [number2][number1];
        max=arr[0][0];
        for (int i=0;i<number2;i++)
        {
            for (int j=0;j<number1;j++)
            {
                arr[i][j]=(int)Math.round(99 * Math.random()) + 1;
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                    address=i;
                    address2=j;
                }
            }
        }
        System.out.println("max number in random 2 dimension arrays is: "+"arr["+address+"]"+"["+address2+"]: "+max);
        System.out.println("Let take input from keyboard: ");

        for (int i=0;i<number2;i++)
        {

            for (int j=0;j<number1;j++)
            {

                System.out.print("Value of an array " + "arr["+i+"]"+"["+j+"]: ");
                arr[i][j] = input.nextInt();
                if(i==0&&j==0)
                {
                    max=arr[0][0];
                    address=0;
                    address2=0;
                }

                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                    address=i;
                    address2=j;
                }
            }
        }
        System.out.println("max number in input 2 dimension arrays is: "+"arr["+address+"]"+"["+address2+"]: "+max);
    }
}
