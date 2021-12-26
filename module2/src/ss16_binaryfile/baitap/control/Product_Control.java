package ss16_binaryfile.baitap.control;
import ss16_binaryfile.baitap.service.Product_Service;

import java.util.Scanner;
public class Product_Control {
    public static void main(String[] args) {
        Product_Service product_service=new Product_Service();
        while (1>0)
        {
        System.out.println("1.Adding products");
        System.out.println("2.Displaying all products");
        System.out.println("3.Searching products (ID)");
        System.out.println("4.Exit program");
        Scanner input=new Scanner(System.in);
        int choice=Integer.parseInt(input.nextLine());
        switch (choice)
        {
            case 1:
            {
                product_service.add();
                continue;
            }
            case 2:
            {
                product_service.display();
                continue;
            }
            case 3:
            {
                product_service.search();
                continue;
            }
            case 4:
            {
                System.out.println("Goodbye! Have a nice day!");
                break;
            }
            default:
            {
                System.out.println("input is invalid! please re-Enter your choice!");
                continue;
            }
        }
        break;}

    }


}
