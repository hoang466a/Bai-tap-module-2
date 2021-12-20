package com.codegym;
import java.util.Scanner;

public class ResizeableTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double percent=Math.floor(Math.random()*(100-1+1)+1);
        System.out.println(percent);
        Shape []shape=new Shape[3];
        shape[0]=new Circle(2.0,"red",true);
        shape[1]=new Rectangle(2.0,3.0,"red",true);
        shape[2]=new Square(2.0,"red",true);
        System.out.println("Pre change: ");

        for (Shape check:shape)
        {
            System.out.println(check);
        }
        System.out.println("After increase size: "+percent+"%");
        ((Circle)shape[0]).resize(percent);
        ((Rectangle)shape[1]).resize(percent);
        ((Square)shape[2]).resize(percent);

        for (Shape check:shape)
        {
            System.out.println(check);
        }

    }
}
