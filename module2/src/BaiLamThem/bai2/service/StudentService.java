package BaiLamThem.bai2.service;
import BaiLamThem.bai1.model.Candidate;
import BaiLamThem.bai2.model.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentService implements iStudent {
    private Student[] students =new Student[100];
    private static int number=0;
    private static Scanner input=new Scanner(System.in);

    @Override
    public void getAdd() {
        if(number< students.length) {
            System.out.println("Input the student id:");
            String studentId = input.nextLine();
            while (!(studentId.matches("^[1-9][0-9][0-9][0-9]$"))) {
                System.out.println("Input is invalid!");
                System.out.println("Input the student id:");
                studentId = input.nextLine();
            }

            System.out.println("Input the student name:");
            String studentName = input.nextLine();

            System.out.println("Input the student date of birth:");
            String studentBirth = input.nextLine();


            System.out.println("Input the student gender: ");
            String studentGender = input.nextLine();



            System.out.println("Input the student class name: ");
            String studentClassName = input.nextLine();

            System.out.println("Input the student course:");
            String studentCourse = input.nextLine();
            Student student =new Student(studentId,studentName,studentBirth,studentGender,studentClassName,studentCourse);
            students[number]= student;
            number++;
        }
        else{
            System.out.println("The list has full!");
        }



    }

    @Override
    public void getAll() {
        for (int i=0;i<number;i++)
        {
            System.out.println(students[i]);
        }
    }

    @Override
    public void getNStudent() {
        System.out.println("Input the number of student want to add: ");
        int add=input.nextInt();
        if(add+number> students.length)
        {
            System.out.println("The list has full!");
        }
        else
        {
            for (int i=0;i<add;i++)
            {
                getAdd();
            }
        }

    }

    @Override
    public void removeIndex() {
        System.out.println("Input your index you want to remove: ");
        int index=Integer.parseInt(input.nextLine());
        for (int i=index-1;i<number-1;i++)
        {
            students[i]=students[i+1];
        }
        number--;

    }

    @Override
    public void removeId() {
        System.out.println("Input student ID you want to remove: ");
        String studentIdRemove=input.nextLine();
        int index=0;
        boolean flag=false;
        for (int i=0;i<number;i++)
        {
            if(students[i].getStudentid().equals(studentIdRemove))
            {
                    index=i;
                    flag=true;
            }
        }
        if (flag)
        {
            for (int i=index;i<number-1;i++)
            {
                students[i]=students[i+1];
            }
            number--;
        }
        else
        {
            System.out.println("Student you want to remove don't have in the list!");
        }


    }
    public void searchIdAndName(){
        System.out.println("Input name or ID of student you want to find: ");
        String search=input.nextLine();
        for (int i=0;i<number;i++)
        {
            if(students[i].getStudentid().equals(search))
            {
                System.out.println("Student id has found!");
                System.out.println(students[i]);
            }
            else if(students[i].getNamestudent().equals(search))
            {
                System.out.println("Student name has found!");
                System.out.println(students[i]);
            }
            else
            {
                System.out.println("Student you want to find don't have in the list!");
            }
        }


    }

    @Override
    public void sort() {
        int number1=0;
        for (int i=0;i<number;i++)
        {
            if (students[i]!=null)
                number1++;
        }
        Student[] students1 =new Student[number1];
        for (int i=0;i<students1.length;i++)
        {
            students1[i]=students[i];
        }
        Arrays.sort(students1);


        for (int i=0;i<number;i++)
        {
            System.out.println(students1[i]);
        }
    }

}
