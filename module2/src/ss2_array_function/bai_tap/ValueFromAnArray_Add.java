package ss2_array_function.bai_tap;
import java.util.Scanner;
public class ValueFromAnArray_Add {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int array[]=new int[50];
        System.out.println("Nhập vào số phần tử bạn muốn nhập (nhỏ hơn 50 phần tử): ");
        int size= input.nextInt();
    do
    {
        if(size>50||size<0)
        {
            System.out.println("Gía trị nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào số phần tử bạn muốn nhập (nhỏ hơn 50 phần tử): ");
            size= input.nextInt();
        }
        else
            break;
    }while(size>50||size<0);

        System.out.println("Nhập vào giá trị muốn chèn: ");
        int value= input.nextInt();


        System.out.println("Nhập vào vị trí muốn chèn: ");
        int address= input.nextInt();


        do{
        if(address>=(size-1)||address<=-1)
        {
            System.out.println("Gía trị nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào vị trí muốn chèn: ");
            address= input.nextInt();
        }
        else
            break;
        }while(address<=-1||address>=(size-1));


        for (int i=0;i<size;i++)
        {
            System.out.print("Value of an array " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        for (int i=size;i>address-1;i--)
        {
            array[i]=array[i-1];
        }
        array[address]=value;
        System.out.println("Array after add: ");
        for (int i=0;i<size+1;i++)
        {
            System.out.println("Value of an array " + (i + 1) + ": "+array[i]);

        }









    }
}
