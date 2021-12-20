package com.codegym;

import java.util.Scanner;

public class ColorableTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        Shape []shape=new Shape[3];
        shape[0]=new Circle(2.0,"red",true);
        shape[1]=new Rectangle(2.0,3.0,"red",true);
        shape[2]=new Square(2.0,"red",true);


        for(Shape check:shape)
        {
            System.out.println(check);
            if (check instanceof Colorable)
            {
                ((Colorable) check).howToColor();
            }
        }

    }
}
