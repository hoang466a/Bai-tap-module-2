package ss13_sapxep.baitap;
import ss2_array_function.thuc_hanh.ArrayReverse;

import java.util.Arrays;
import java.util.Scanner;


public class InsertionSortInt {


    public static void main(String[] args) {
        int pos;
        int x;
        int[] array={5,3,2,7,3,1,8,9,11,6,7,5,4,8,4,5,10};
        System.out.println("Array before sort: ");
        for (int arr:array)
        {
            System.out.print(arr+" ");
        }
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }


        System.out.println(" ");
        System.out.println("Array after sort: ");
        for (int arr:array)
        {
            System.out.print(arr+" ");
        }


    }


}
