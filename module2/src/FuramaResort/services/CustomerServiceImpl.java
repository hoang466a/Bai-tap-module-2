package FuramaResort.services;

import FuramaResort.models.person.Customer;
import FuramaResort.models.person.Employee;
import FuramaResort.services.impl.CustomerService;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
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



    public void display(){
        for (Customer display:customers)
        {
            System.out.println(display);
        }
    }


    public void add(){
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
