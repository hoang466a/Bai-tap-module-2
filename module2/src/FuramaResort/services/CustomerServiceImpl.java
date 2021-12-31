package FuramaResort.services;

import FuramaResort.models.person.Customer;
import FuramaResort.models.person.Employee;
import FuramaResort.services.impl.CustomerService;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    public static String filePath="D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\data\\customer.csv";
    Scanner input=new Scanner(System.in);
    public static List<Customer> customers=new LinkedList<>();
    static {
        Customer customer1=new Customer("1234","Ngo Van A","12/12/1212","Nam","012345678","0912612645","VANA@gmail.com","Diamond","Da Nang");
        Customer customer2=new Customer("1235","Ngo Van B","13/12/1212","NU","012345678","0912612645","VANA@gmail.com","Diamond","Da Nang");
        Customer customer3=new Customer("1236","Ngo Van C","14/12/1212","NU","012345678","0912612645","VANA@gmail.com","Diamond","Da Nang");
        Customer customer4=new Customer("1237","Ngo Van D","15/12/1212","NU","012345678","0912612645","VANA@gmail.com","Diamond","Da Nang");
        Customer customer5=new Customer("1238","Ngo Van E","18/12/1212","Nam","012345678","0912612645","VANA@gmail.com","Diamond","Da Nang");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
    }


    static List<Customer> readFile(String file)
    {
        List <Customer> customers= new ArrayList<>();
        BufferedReader br=null;

        try {
            br=new BufferedReader(new FileReader(file));
            String line;
            String[] temp;
            Customer customer;
            while ((line=br.readLine())!=null) {
                temp = line.split(",");
                System.out.println(temp);
                customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                customers.add(customer);
            }

        } catch (IOException e) {
            System.out.println("Failed to Read File from Data!");
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Failed to Read File from Data!");
            }
        }
        return customers;
    }


    static void writeFile(String filepath,List<Customer>customers)
    {
        try {
            FileWriter fw=new FileWriter(filepath);
            BufferedWriter bw=new BufferedWriter(fw);
            for (Customer customer:customers)
            {
                System.out.println(customer.getId());
                bw.write(customer.getId()+", "+
                        customer.getName()+", "+
                        customer.getDateofbirth()+", "+
                        customer.getGender()+", "+
                        customer.getCMND()+", "+
                        customer.getPhonenumber()+", "+
                        customer.getEmail()+", "+
                        customer.getType()+", "+
                        customer.getAddress()+", "+ "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






    public void display(){
        customers=readFile(filePath);
        for (Customer display:customers)
        {
            System.out.println(display);
        }
    }


    public void add(){
        System.out.println("Enter a personal ID code for customer");
        String customerId=input.nextLine();
        while(customerId==null||!customerId.matches("[0-9]{4}"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a personal ID code for customer");
            customerId=input.nextLine();
        }

        System.out.println("Enter a customer name");
        String customerName=input.nextLine();

        System.out.println("Enter a customer date of birth (DD-MM-YYYY)");
        String customerDateOfBirth=input.nextLine();

        while(customerDateOfBirth==null||!customerDateOfBirth.matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a customer date of birth");
            customerDateOfBirth=input.nextLine();
        }

        System.out.println("Enter a customer gender (Nam/Nu):");
        String customerGender=input.nextLine();
        while(customerGender==null||!customerGender.matches("[Nn][Aa][Mm]|[Nn][Uu]"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a customer gender (Nam/Nu):");
            customerGender=input.nextLine();
        }


        System.out.println("Enter a customer national identity card:");
        String customerCMND=input.nextLine();
        while (customerCMND==null||!customerCMND.matches("[0-9]{9}"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a customer national identity card:");
            customerCMND=input.nextLine();
        }


        System.out.println("Enter a customer phonenumber:");
        String customerPhonenumber=input.nextLine();
        while(customerPhonenumber==null||!customerPhonenumber.matches("^[0][0-9]{9}"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a customer phonenumber:");
            customerPhonenumber=input.nextLine();
        }

        String regex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$";
        System.out.println("Enter a customer email:");
        String customerEmail=input.nextLine();
        while (customerEmail==null||!customerEmail.matches(regex))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a customer email:");
            customerEmail=input.nextLine();
        }

        System.out.println("Enter a customer type (Diamond, Platinum,Gold,Silver,Member):");
        String type="Diamond Platinum Gold Silver Member";
        String customerType=input.nextLine();
        while (customerType==null||!type.contains(customerType))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a customer type:");
            customerEmail=input.nextLine();
        }


        System.out.println("Enter address of customer:");
        String customerAddress=input.nextLine();


        Customer customer=new Customer(customerId,customerName,customerDateOfBirth,customerGender,customerId,customerPhonenumber,customerEmail,customerType,customerAddress);
        customers.add(customer);
        writeFile(filePath,customers);
    }




    public void edit(){
        System.out.println("Enter customer id you want to edit: ");
        String fixId=input.nextLine();
        boolean check=false;
        for (Customer fix:customers)
        {
            if (fixId.equals(fix.getId()))
            {
                check=true;
                System.out.println("Customer id has found!");
                System.out.println("Enter a personal ID code for customer");
                String customerId=input.nextLine();
                System.out.println("Enter a customer name");
                String customerName=input.nextLine();
                System.out.println("Enter a customer date of birth");
                String customerDateOfBirth=input.nextLine();
                System.out.println("Enter a customer gender:");
                String customerGender=input.nextLine();
                System.out.println("Enter a customer national identity card:");
                String customerCMND=input.nextLine();
                System.out.println("Enter a customer phone number:");
                String customerPhonenumber=input.nextLine();
                System.out.println("Enter a customer email:");
                String customerEmail=input.nextLine();
                System.out.println("Enter a customer type:");
                String customerType=input.nextLine();
                System.out.println("Enter a customer address:");
                String customerAddress=input.nextLine();

                Customer customer=new Customer(customerId,customerName,customerDateOfBirth,customerGender,customerId,customerPhonenumber,customerEmail,customerType,customerAddress);
                customers.add(customer);
            }



    }
}
}
