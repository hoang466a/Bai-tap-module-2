package ss11_CollectionFramework.baitap.service;

import ss11_CollectionFramework.baitap.model.Product;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;



public class ProductService implements IProduct {
private static Scanner input=new Scanner(System.in);
    ArrayList<Product> product = new ArrayList<Product>();


    @Override
    public void getAdd() {
            System.out.println("Input product id (type:0000-9999): ");
            String productid=input.nextLine();
            while (!(productid.matches("^[0-9][0-9][0-9][0-9]$"))) {
                System.out.println("Input is invalid!");
                System.out.println("Input product id:");
                 productid= input.nextLine();
            }
            System.out.println("Input product name: ");
            String productname=input.nextLine();

            System.out.println("Input product price: ");
            int productprice= Integer.parseInt(input.nextLine());

        Product object=new Product(productid,productname,productprice);
        product.add(object);
    }

    @Override
    public void getFix() {
        System.out.println("Input product id you want to fix: ");
        String fixid= input.nextLine();
        boolean check=false;
        for (Product productlist:product)
        {
            if (productlist.getProductid().equals(fixid))
            {
                check=true;
                System.out.println("Id was found!");
                System.out.println("Input What do you want to change the name to: ");
                String fixName=input.nextLine();
                productlist.setProductname(fixName);
                System.out.println("Input What do you want to change the price to: ");
                int fixPrice=Integer.parseInt(input.nextLine());
                productlist.setProductprice(fixPrice);
            }
        }
        if (!check)
        {
            System.out.println("Id was not found!");
        }
        else
        {
            this.display();
        }


    }

    @Override
    public void getRemove() {
        System.out.println("Input product id you want to remove: ");
        String removeid= input.nextLine();
        boolean check=false;
        for (int i=0;i<product.size();i++)
        {
            if (product.get(i).getProductid().equals(removeid))
                {
                    check=true;
                    System.out.println("Id was found!");
                    product.remove(i);
                }
        }
        if (!check)
            System.out.println("Id was not found!");
        else
            this.display();


    }

    @Override
    public void display() {
        for (Product productlist:product)
        {
            System.out.println(productlist);
        }
    }

    @Override
    public void search() {
        System.out.println("Input product name you want to search: ");
        String searchid= input.nextLine();
        boolean check=false;
        for (int i=0;i<product.size();i++)
        {
            if (product.get(i).getProductname().equals(searchid))
            {
                check=true;
                System.out.println("Name was found!");
                System.out.println(product.get(i));
            }
        }
        if (!check)
            System.out.println("Name was not found!");
    }

    @Override
    public void sortIncrease() {
        Collections.sort(product, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductprice() > o2.getProductprice() ? 1 : -1;
            }
        });
        display();
    }


    public void sortDecrease() {
        Collections.sort(product, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getProductprice() > o1.getProductprice() ? 1 : -1;
            }
        });
        display();
    }


    }


