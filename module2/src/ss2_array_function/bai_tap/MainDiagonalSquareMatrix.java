package ss2_array_function.bai_tap;
import java.util.Scanner;
public class MainDiagonalSquareMatrix {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int max;


        System.out.print("The length of the columns and rows in the array: ");
        int side = input.nextInt();
        while(side<0)
        {
            System.out.print("The length of the columns in the array: ");
            side = input.nextInt();
        }
        int sum=0;


        int arr[][]=new int [side][side];

        for (int i=0;i<side;i++)
        {
            for (int j=0;j<side;j++)
            {
                arr[i][j]=(int)Math.round(99 * Math.random()) + 1;
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of main diagonal in random square matrix is: "+sum);

        System.out.println("Let take input from keyboard: ");
        sum=0;
        for (int i=0;i<side;i++)
        {

            for (int j=0;j<side;j++)
            {

                System.out.print("Value of an array " + "arr["+i+"]"+"["+j+"]: ");
                arr[i][j] = input.nextInt();
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of main diagonal in input square matrix is: "+sum);

    }
}
