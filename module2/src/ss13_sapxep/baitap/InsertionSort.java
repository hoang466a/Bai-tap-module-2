package ss13_sapxep.baitap;
import ss2_array_function.thuc_hanh.ArrayReverse;

import java.util.Arrays;
import java.util.Scanner;


public class InsertionSort {


    public static void main(String[] args) {
        int pos;
        double x;
        double[] array=new Arrays;


        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                System.out.println("chance place of "+array[pos]+" to "+array[pos-1]);
                pos--;
            }
            array[pos] = x;
            System.out.println("chance place of "+array[pos]+" to "+array[pos-1]);
        }



    }


}
