package ss2_array_function.bai_tap;
import java.util.Scanner;
public class TwoDimensionalArraysSumColumn {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.print("The length of the columns in the array: ");
        int column = input.nextInt();
        while(column<0)
        {
            System.out.print("The length of the columns in the array: ");
            column = input.nextInt();
        }


        System.out.print("The length of the rows in the array: ");
        int row = input.nextInt();
        while(row<0)
        {
            System.out.print("The length of the rows in the array: ");
            row = input.nextInt();
        }
        int arr[][]=new int [row][column];

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<row;j++)
            {
                arr[i][j]=(int)Math.round(99 * Math.random()) + 1;
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);

            }
        }
        System.out.print("The column you want to sum: ");
        int column1 = input.nextInt();
        while(column1<0||column1>column)
        {
            System.out.print("The column you want to sum: ");
            column1 = input.nextInt();
        }
        int sum=0;
        for (int i=0;i<row;i++)
        {
            sum+=arr[i][column1-1];
        }
        System.out.println("The sum of column "+column1+": "+sum);






        System.out.println("Let take input from keyboard: ");

        for (int i=0;i<row;i++)
        {

            for (int j=0;j<column;j++)
            {
                System.out.print("Value of an array " + "arr["+i+"]"+"["+j+"]: ");
                arr[i][j] = input.nextInt();
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);

            }
        }
        System.out.print("The column you want to sum: ");
        column1 = input.nextInt();
        while(column1<0||column1>column)
        {
            System.out.print("The column you want to sum: ");
            column1 = input.nextInt();
        }
        sum=0;
        for (int i=0;i<row;i++)
        {
            sum+=arr[i][column1-1];
        }
        System.out.println("The sum of column "+column1+": "+sum);

    }
}
