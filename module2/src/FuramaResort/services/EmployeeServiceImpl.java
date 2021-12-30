package FuramaResort.services;

import FuramaResort.models.person.Employee;
import FuramaResort.services.impl.EmployeeService;
import FuramaResort.utils.ReadAndWriteFile;
import ss15_textfile.baitap.CodeNation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeeServiceImpl implements EmployeeService {

    public static String filePath="D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\data\\employee.csv";
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


    static List<Employee> readFile(String file)
    {
        List <Employee> employees= new ArrayList<>();
        BufferedReader br=null;

        try {
            br=new BufferedReader(new FileReader(file));
            String line;
            String []temp;
            Employee employee;
            while ((line=br.readLine())!=null)
            {
                temp=line.split(",");
                System.out.println(temp);
                employee=new Employee(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8],temp[9]);
                employees.add(employee);}

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
        return employees;
    }


    static void writeFile(String filepath,List<Employee>employees)
    {
        try {
            FileWriter fw=new FileWriter(filepath);
            BufferedWriter bw=new BufferedWriter(fw);
            for (Employee employee:employees)
            {
                System.out.println(employee.getId());
                bw.write(employee.getId()+", "+
                        employee.getName()+", "+
                        employee.getDateofbirth()+", "+
                        employee.getGender()+", "+
                        employee.getCMND()+", "+
                        employee.getPhonenumber()+", "+
                        employee.getEmail()+", "+
                        employee.getEducationlevel()+", "+
                        employee.getPosition()+", "+
                        employee.getSalary() +"\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






    public void display(){
        employees=readFile(filePath);

        for (Employee employee:employees)
            System.out.println(employee);
    }
    public void add(){

        System.out.println("Enter a personal ID code for employee");
        String employeeId=input.nextLine();
        while(employeeId==null||!employeeId.matches("[0-9]{4}"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a personal ID code for employee");
            employeeId=input.nextLine();
        }

        System.out.println("Enter a employee name");
        String employeeName=input.nextLine();

        System.out.println("Enter a employee date of birth (DD-MM-YYYY)");
        String employeeDateOfBirth=input.nextLine();

        while(employeeDateOfBirth==null||!employeeDateOfBirth.matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a employee date of birth");
            employeeDateOfBirth=input.nextLine();
        }

        System.out.println("Enter a employee gender (Nam/Nu):");
        String employeeGender=input.nextLine();
        while(employeeGender==null||!employeeGender.matches("[Nn][Aa][Mm]|[Nn][Uu]"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a employee gender (Nam/Nu):");
            employeeGender=input.nextLine();
        }


        System.out.println("Enter a employee national identity card:");
        String employeeCMND=input.nextLine();
        while (employeeCMND==null||!employeeCMND.matches("[0-9]{9}"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a employee national identity card:");
            employeeCMND=input.nextLine();
        }


        System.out.println("Enter a employee phonenumber:");
        String employeePhonenumber=input.nextLine();
        while(employeePhonenumber==null||!employeePhonenumber.matches("^[0][0-9]{9}"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a employee phonenumber:");
            employeePhonenumber=input.nextLine();
        }

        String regex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$";
        System.out.println("Enter a employee email:");
        String employeeEmail=input.nextLine();
        while (employeeEmail==null||!employeeEmail.matches(regex))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a employee email:");
            employeeEmail=input.nextLine();
        }

        String regex2="[T][C]|[D][H]|[C][D]|[S][D][H]";
        System.out.println("Enter a employee education level (TC,DH,CD,SDH):");
        String employeeEducationlevel=input.nextLine();
        while(employeeEducationlevel==null||!employeeEducationlevel.matches(regex2))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a employee education level (TC,DH,CD,SDH):");
            employeeEducationlevel=input.nextLine();
        }


        String position="Le tan Phuc vu Chuyen vien Giam sat Quan ly Giam doc";
        System.out.println("Enter a employee position(Le tan, Phuc vu, Chuyen vien, Giam sat, Quan ly, Giam doc:");
        String employeePosition=input.nextLine();
        while(employeePosition==null||!position.contains(employeePosition))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a employee position:");
            employeePosition=input.nextLine();
        }


        System.out.println("Enter a employee salary:");
        String regex3="^[1-9][0-9]+";
        String employeeSalary=input.nextLine();
        while(employeeSalary==null||!employeeSalary.matches(regex3))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a employee salary:");
            employeeSalary=input.nextLine();
        }



        Employee employee=new Employee(employeeId,employeeName,employeeDateOfBirth,employeeGender,employeeId,employeePhonenumber,employeeEmail,employeeEducationlevel,employeePosition,employeeSalary);
        employees.add(employee);
        writeFile(filePath,employees);

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
                System.out.println("Enter a employee name");
                String employeeName=input.nextLine();

                System.out.println("Enter a employee date of birth (DD-MM-YYYY)");
                String employeeDateOfBirth=input.nextLine();

                while(employeeDateOfBirth==null||!employeeDateOfBirth.matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$"))
                {
                    System.out.println("Please re-enter, input is wrong!");
                    System.out.println("Enter a employee date of birth");
                    employeeDateOfBirth=input.nextLine();
                }

                System.out.println("Enter a employee gender (Nam/Nu):");
                String employeeGender=input.nextLine();
                while(employeeGender==null||!employeeGender.matches("[Nn][Aa][Mm]|[Nn][Uu]"))
                {
                    System.out.println("Please re-enter, input is wrong!");
                    System.out.println("Enter a employee gender (Nam/Nu):");
                    employeeGender=input.nextLine();
                }


                System.out.println("Enter a employee national identity card:");
                String employeeCMND=input.nextLine();
                while (employeeCMND==null||!employeeCMND.matches("[0-9]{9}"))
                {
                    System.out.println("Please re-enter, input is wrong!");
                    System.out.println("Enter a employee national identity card:");
                    employeeCMND=input.nextLine();
                }


                System.out.println("Enter a employee phonenumber:");
                String employeePhonenumber=input.nextLine();
                while(employeePhonenumber==null||!employeePhonenumber.matches("^[0][0-9]{9}"))
                {
                    System.out.println("Please re-enter, input is wrong!");
                    System.out.println("Enter a employee phonenumber:");
                    employeePhonenumber=input.nextLine();
                }

                String regex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$";
                System.out.println("Enter a employee email:");
                String employeeEmail=input.nextLine();
                while (employeeEmail==null||!employeeEmail.matches(regex))
                {
                    System.out.println("Please re-enter, input is wrong!");
                    System.out.println("Enter a employee email:");
                    employeeEmail=input.nextLine();
                }

                String regex2="[T][C]|[D][H]|[C][D]|[S][D][H]";
                System.out.println("Enter a employee education level (TC,DH,CD,SDH):");
                String employeeEducationlevel=input.nextLine();
                while(employeeEducationlevel==null||!employeeEducationlevel.matches(regex2))
                {
                    System.out.println("Please re-enter, input is wrong!");
                    System.out.println("Enter a employee education level (TC,DH,CD,SDH):");
                    employeeEducationlevel=input.nextLine();
                }


                String position="Le tan Phuc vu Chuyen vien Giam sat Quan ly Giam doc";
                System.out.println("Enter a employee position(Le tan, Phuc vu, Chuyen vien, Giam sat, Quan ly, Giam doc:");
                String employeePosition=input.nextLine();
                while(employeePosition==null||!position.contains(employeePosition))
                {
                    System.out.println("Please re-enter, input is wrong!");
                    System.out.println("Enter a employee position:");
                    employeePosition=input.nextLine();
                }

                System.out.println("Enter a employee salary:");
                String regex3="^[1-9][0-9]+";
                String employeeSalary=input.nextLine();
                while(employeeSalary==null||!employeeSalary.matches(regex3))
                {
                    System.out.println("Please re-enter, input is wrong!");
                    System.out.println("Enter a employee salary:");
                    employeeSalary=input.nextLine();
                }
            }
        }
        display();
        if (check=false)
        {
            System.out.println("Employee id not found!");
        }
    }
}
