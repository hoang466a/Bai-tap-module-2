package ss13_sapxep.baitap;
import ss2_array_function.thuc_hanh.ArrayReverse;

import java.util.Arrays;
import java.util.Scanner;


public class InsertionSort {


    public static void main(String[] args) {
        int pos;
        double x;
        double[] array={5,3,1,7,3,1,8,9,1,6,7,1,4,8,4,5,10};


        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                System.out.println("chance place of "+array[pos]+" to "+array[pos-1]);
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
            System.out.println("array after loop: ");
            for (double arr:array)
            {
                System.out.print(arr+ " ");
            }
            System.out.println("");
        }



    }


}
