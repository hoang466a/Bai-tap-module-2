package ss3_loop_java.bai_tap;
import java.util.Scanner;
public class MenuDrawing {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int choice = -1;
                while(choice != 4) {
                    System.out.println("Menu");
                    System.out.println("1. Draw the rectangle");
                    System.out.println("2. Draw the square triangle");
                    System.out.println("3. Draw the isosceles triangle");
                    System.out.println("4. Exit");
                    System.out.println("Enter your choice: ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Draw the triangle");
                            System.out.println("Enter your height you want to draw: ");
                            int height=input.nextInt();
                            System.out.println("Enter your width you want to draw: ");
                            int width=input.nextInt();
                            for (int i=0;i<height;i++) {
                                for (int j = 0; j < width; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("Menu");
                            System.out.println("1. top-left");
                            System.out.println("2. top-right");
                            System.out.println("3. bottom-left");
                            System.out.println("4. bottom-right");
                            System.out.println("Enter your choice: ");
                            int choice1=input.nextInt();
                            System.out.println("Enter your height you want to draw: ");
                            height=input.nextInt();
                            int height1=height;
                            if(choice1==1)
                            {
                                for (int i=0;i<height;i++) {
                                    for (int j = height1; j >0; j--) {
                                        System.out.print("*");
                                    }
                                    height1--;
                                    System.out.println();
                                }
                            }


                            else if(choice1==2)
                            {
                                for (int i=0;i<height;i++) {
                                    if(i>0 && i<=(height-1))
                                    {
                                        for (int j = 0; j <i; j++) {
                                         System.out.print(" ");
                                       }
                                    }
                                   for (int j = 0; j <(height-i); j++) {
                                      System.out.print("*");
                                    }

                                    System.out.println();
                            }}


                            else if(choice1==3)
                            {
                                for (int i=0;i<height;i++) {
                                    if(i<=(height-1))
                                    {
                                        for (int j = 0; j <=i; j++) {
                                            System.out.print("*");
                                        }
                                    }
                                    for (int j = 0; j <height; j++) {
                                        System.out.print(" ");
                                    }

                                    System.out.println();
                                }}


                            else if(choice1==4)
                            {
                                for (int i=0;i<height;i++) {

                                   if(i>=0 && i<height)
                                   {
                                    for (int j = 1; j <(height-i); j++) {
                                        System.out.print(" ");
                                    }}
                                   for(int j=0;j<=i;j++)
                                   {
                                       System.out.print("*");
                                   }
                                    System.out.println();
                                }}
                            break;
                        case 3:
                            System.out.println("Draw the isosceles triangle");
                            System.out.println("Enter your height you want to draw: ");
                            height=input.nextInt();
                            int flag=0;
                            for(int i=0;i<height;i++)
                            {
                                for(int j=0;j<(2*height-1);j++)
                                {
                                    if(j>=(height-1-flag) && j<=(height-1+flag))
                                    {System.out.print("*");}
                                    else
                                    {
                                        System.out.print(" ");
                                    }
                                }
                                flag++;
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            System.out.println("No choice!");
                    }
                }
            }
        }



