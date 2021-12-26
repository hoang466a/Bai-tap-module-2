package ss16_binaryfile.baitap.service;

import ss16_binaryfile.baitap.model.Product;
import ss16_binaryfile.thuchanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Product_Service implements IProduct {
    private static final String product="D:\\Codegym\\Module02\\module2\\src\\ss16_binaryfile\\baitap\\product_list.txt";
    static List<Product> products=new ArrayList<>();
    static {
        Product proDuct=new Product(1234,"Candy","MandM",20);
        Product product1=new Product(1235,"Cake","Kinh Do",30);
        Product product2=new Product(1236,"Coke","CocaCola",10);
        Product product3=new Product(1237,"Pepsi","Pepsi",10);
        Product proDuct4=new Product(1238,"Coca","CocaCola",15);
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
        writeToFile("product.txt",products);
        List<Product> productDataFromFile = readDataFromFile("product.txt");
        for (Product test : productDataFromFile){
            System.out.println(test);
        }

    }





    @Override
    public void add() {


    }

    @Override
    public void display() {

    }

    @Override
    public void search() {

    }
}


