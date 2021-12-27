package FuramaResort.services;

import FuramaResort.models.person.Employee;
import FuramaResort.services.impl.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeeServiceImpl implements EmployeeService {
    Scanner input=new Scanner(System.in);
    static List<Employee>employees=new ArrayList<>();
    static {
        Employee employ1=new Employee("1234","Ngo Van A","12/12/1212","Nam","012345678","0912612645","VANA@gmail.com","TC","LE TAN","12345");
        Employee employ2=new Employee("1235","Ngo Van B","13/12/1212","Nam","012345679","0912612646","VANB@gmail.com","TC","LE TAN","12345");
        Employee employ3=new Employee("1236","Ngo Van C","14/12/1212","Nam","012345680","0912612647","VANC@gmail.com","TC","LE TAN","12345");
        Employee employ4=new Employee("1237","Ngo Van D","15/12/1212","Nam","012345681","0912612648","VAND@gmail.com","TC","LE TAN","12345");
        Employee employ5=new Employee("1238","Ngo Van E","16/12/1212","Nam","012345682","0912612649","VANE@gmail.com","TC","LE TAN","12345");
        employees.add(employ1);
        employees.add(employ2);
        employees.add(employ3);
        employees.add(employ4);
        employees.add(employ5);
    }


    public void display1(){
        for (Employee employee:employees)
        {
            System.out.println(employee);
        }
    }
    public void add(){
        System.out.println("Enter a personal ID code for employee");
        String employeeId=input.nextLine();
        System.out.println("Enter a employee name");
        String employeeName=input.nextLine();
        System.out.println("Enter a employee date of birth");
        String employeeDateOfBirth=input.nextLine();
        System.out.println("Enter a employee gender:");
        String employeeGender=input.nextLine();
        System.out.println("Enter a employee national identity card:");
        String employeeCMND=input.nextLine();
        System.out.println("Enter a employee phonenumber:");
        String employeePhonenumber=input.nextLine();
        System.out.println("Enter a employee email:");
        String employeeEmail=input.nextLine();
        System.out.println("Enter a employee education level:");
        String employeeEducationlevel=input.nextLine();
        System.out.println("Enter a employee position:");
        String employeePosition=input.nextLine();
        System.out.println("Enter a employee salary:");
        String employeeSalary=input.nextLine();
        Employee employee=new Employee(employeeId,employeeName,employeeDateOfBirth,employeeGender,employeeId,employeePhonenumber,employeeEmail,employeeEducationlevel,employeePosition,employeeSalary);
        employees.add(employee);
    }



    public void edit(){
        System.out.println("Enter employee id you want to edit: ");
        String fixId=input.nextLine();
        boolean check=false;
        for (Employee employee:employees)
        {
            if (fixId.equals(employee.getId()))
            {
                check=true;
                System.out.println("Employee id has found!");
                System.out.println("Enter a personal ID code for employee");
                employee.setId(input.nextLine());
                System.out.println("Enter a employee name");
                employee.setName(input.nextLine());
                System.out.println("Enter a employee date of birth");
                employee.setDateofbirth(input.nextLine());
                System.out.println("Enter a employee gender:");
                employee.setGender(input.nextLine());
                System.out.println("Enter a employee national identity card:");
                employee.setCMND(input.nextLine());
                System.out.println("Enter a employee phonenumber:");
                employee.setPhonenumber(input.nextLine());
                System.out.println("Enter a employee email:");
                employee.setEmail(input.nextLine());
                System.out.println("Enter a employee education level:");
                employee.setEducationlevel(input.nextLine());
                System.out.println("Enter a employee position:");
                employee.setPosition(input.nextLine());
                System.out.println("Enter a employee salary:");
                employee.setSalary(input.nextLine());
            }
        }
        display1();
        if (check=false)
        {
            System.out.println("Employee id not found!");
        }
    }
}
