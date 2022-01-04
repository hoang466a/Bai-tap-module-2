package FuramaResort.controllers;
import FuramaResort.services.*;

import java.util.Scanner;

public class FuramaController {
    static BookingServiceImpl bookingService=new BookingServiceImpl();
    static ContractServiceImpl contractService=new ContractServiceImpl();
    static CustomerServiceImpl customerService=new CustomerServiceImpl();
    static EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
    static FacilityServiceImpl facilityService=new FacilityServiceImpl();
    static Scanner input=new Scanner(System.in);

    static void DisplayListNewFacility()
    {
        while  (1>0) {
            System.out.println("1. Add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Back to menu");
            int newFacility = Integer.parseInt(input.nextLine());
            switch (newFacility) {
                case 1:
                    facilityService.addVilla();
                    continue;
                case 2:
                    facilityService.addHouse();
                    continue;
                case 3:
                    facilityService.addRoom();
                    continue;
                case 4:
                    break;
            }
            break;

        }

    }





    public static void main(String[] args) {


        while (1>0)
        {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Input your choice: ");
            int choice=(Integer.parseInt(input.nextLine()));

            switch (choice){

            case 1:
            {
                System.out.println("1. Display list employees");
                System.out.println("2. Add new employee");
                System.out.println("3. Edit employee");
                System.out.println("4. Return main menu");
                System.out.println("Input your choice: ");
                int choice1=(Integer.parseInt(input.nextLine()));
                switch(choice1){
                    case 1:
                    {
                        employeeService.display();
                        continue;
                    }
                    case 2:
                    {
                        employeeService.add();
                        continue;
                    }
                    case 3:
                    {
                        employeeService.edit();
                        continue;
                    }
                    case 4:
                    {
                        continue;
                    }

                }

                break;
            }

            case 2:{
                System.out.println("1. Display list customers");
                System.out.println("2. Add new customer");
                System.out.println("3. Edit customer");
                System.out.println("4. Return main menu");
                System.out.println("Input your choice: ");
                int choice2=(Integer.parseInt(input.nextLine()));
                switch(choice2){
                    case 1:
                    {
                        customerService.display();
                        continue;
                    }
                    case 2:
                    {
                        customerService.add();
                        continue;
                    }
                    case 3:
                    {
                        customerService.edit();
                        continue;
                    }
                    case 4:
                    {
                        continue;
                    }}
                break;
            }

            case 3:{
                    System.out.println("1. Display list falicity");
                    System.out.println("2. Add new falicity");
                    System.out.println("3. Display list facility maintenance");
                    System.out.println("4. Return main menu");
                System.out.println("Input your choice: ");
                int choice3=(Integer.parseInt(input.nextLine()));
                switch(choice3){
                    case 1:
                    {
                        facilityService.display();
                        continue;
                    }
                    case 2:
                    {
                        DisplayListNewFacility();
                        continue;
                    }
                    case 3:
                    {
                        facilityService.displayMaintenance();
                        continue;
                    }
                    case 4:
                    {
                        continue;
                    }}
                    break;
            }

            case 4:{
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new contracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                System.out.println("Input your choice: ");
                int choice4=(Integer.parseInt(input.nextLine()));
                switch(choice4){
                    case 1:
                    {
                        bookingService.add();
                        break;
                    }
                    case 2:
                    {
                        bookingService.display();
                        break;
                    }
                    case 3:
                    {
                        break;
                    }
                    case 4:
                    {
                        break;
                    }
                    case 5:
                    {
                        break;
                    }
                    case 6:
                    {
                        continue;
                    }

                }
                    break;
            }

            case 5:{
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                System.out.println("Input your choice: ");
                int choice5=(Integer.parseInt(input.nextLine()));
                switch(choice5){
                    case 1:
                    {
                        break;
                    }
                    case 2:
                    {
                        break;
                    }
                    case 3:
                    {
                        continue;
                    }}

                    break;
            }
            case 6:
                System.out.println("Have a nice day!");
                break;
            }



            break;
        }
    }
}
