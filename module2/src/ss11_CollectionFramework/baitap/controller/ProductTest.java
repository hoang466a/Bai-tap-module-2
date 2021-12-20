package ss11_CollectionFramework.baitap.controller;

import BaiLamThem.bai2.service.StudentService;
import ss11_CollectionFramework.baitap.service.ProductService;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ProductService productservice=new ProductService();
        while  (1>0)
        {
            System.out.println("1. Add new product");
            System.out.println("2. Fix name and price product (product ID)");
            System.out.println("3. Remove product (index)");
            System.out.println("4. Display all products");
            System.out.println("5. Searching the product");
            System.out.println("6. Sort decrease list by price");
            System.out.println("7. Sort increase list by price");
            System.out.println("8. End the program");

            String choice=input.nextLine();
            switch (choice){
                case "1":
                {
                    productservice.getAdd();
                    continue;
                }
                case "2":
                {
                    productservice.getFix();
                    continue;
                }
                case "3":
                {
                    productservice.getRemove();
                    continue;
                }
                case "4":
                {
                    productservice.display();
                    continue;
                }
                case "5":
                {
                    productservice.search();
                    continue;
                }
                case "6":
                {
                    productservice.sortDecrease();
                    continue;
                }
                case "7":
                {
                    productservice.sortIncrease();
                    continue;
                }
                case "8":
                {
                    System.out.println("Have a nice day, bye!");
                    break;
                }
                default:
                {
                    System.out.println("Input is invalid, please re-enter your input ");
                    continue;
                }
            }
            break;


        }
}}
