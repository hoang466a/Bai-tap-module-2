package ss16_binaryfile.baitap.service;

import ss16_binaryfile.baitap.model.Product;
import ss16_binaryfile.thuchanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product_Service implements IProduct {
    Scanner input=new Scanner(System.in);
    private static final String product_list="D:\\Codegym\\Module02\\module2\\src\\ss16_binaryfile\\baitap\\service\\product_list.txt";
    static List<Product> products=new ArrayList<>();
    static {
        Product proDuct=new Product("1234","Candy","MandM",20);
        Product product1=new Product("1235","Cake","Kinh Do",30);
        Product product2=new Product("1236","Coke","CocaCola",10);
        Product product3=new Product("1237","Pepsi","Pepsi",10);
        Product proDuct4=new Product("1238","Coca","CocaCola",15);
        products.add(proDuct);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(proDuct4);
    }


    public static void writeToFile(String path, List<Product>products)
    {
        try {
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }


    public static void main(String[] args) {
        Product_Service test=new Product_Service();
        test.add();

    }





    @Override
    public void add() {
        System.out.println("Enter the product id:");
        String productId = input.nextLine();
        while (!(productId.matches("^[0-9][0-9][0-9][0-9]$"))) {
            System.out.println("Input is invalid!");
            System.out.println("Input the student id:");
            productId = input.nextLine();
        }
        System.out.println("Enter the product name:");
        String productName = input.nextLine();
        System.out.println("Enter the product brand:");
        String productBrand = input.nextLine();
        System.out.println("Enter the product price (x,000 VND):");


        String productPriceString=input.nextLine();
        while (!(productPriceString.matches("[0-9]{1,}"))) {
            System.out.println("Input is invalid!");
            System.out.println("Enter the product price:");
            //input.skip("\\R");
            productPriceString = input.nextLine();
        }
        int productPrice = Integer.parseInt(productPriceString);
        Product product=new Product(productId,  productName,productBrand,productPrice);
        products.add(product);
        writeToFile(product_list,products);
        //writeToFile();
    }




    @Override
    public void display() {
    List <Product> display=readDataFromFile(product_list);
    for (Product test:display)
    {
        System.out.println(test);
    }
    }

    @Override
    public void search() {
        List <Product> display=readDataFromFile(product_list);
        System.out.println("Enter the product id you want to find");
        String find=input.nextLine();
        boolean flag=false;
        for (Product test:display)
        {
         if (find.equals(test.getProduct_id()))
         {
             flag=true;
             System.out.println("Product id has found!");
             System.out.println(test);
         }
        }
        if (flag==false)
        {
            System.out.println("Product id not found");
        }
    }
}


