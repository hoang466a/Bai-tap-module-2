package FuramaResort.controllers;
import java.util.Scanner;
import java.util.Stack;

public class FuramaController {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

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
                        break;
                    }
                    case 2:
                    {
                        break;
                    }
                    case 3:
                    {
                        break;
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
                        break;
                    }
                    case 2:
                    {
                        break;
                    }
                    case 3:
                    {
                        break;
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
                        break;
                    }
                    case 2:
                    {
                        break;
                    }
                    case 3:
                    {
                        break;
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
                        break;
                    }
                    case 2:
                    {
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
