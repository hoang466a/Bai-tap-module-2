package BaiLamThem.bai2.controller;
import BaiLamThem.bai1.service.CandidateService;
import BaiLamThem.bai2.service.StudentService;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        StudentService studentService=new StudentService();
        while  (1>0)
        {
            System.out.println("1. Add new student");
            System.out.println("2. Remove student (student ID)");
            System.out.println("3. Remove student (index)");
            System.out.println("4. Search student ");
            System.out.println("5. Get all student");
            System.out.println("6. Sort list by id");
            System.out.println("7. End the program");

            String choice=input.nextLine();
            switch (choice){
                case "1":
                {
                    studentService.getAdd();
                    continue;
                }
                case "2":
                {
                    studentService.removeId();
                    continue;
                }
                case "3":
                {
                    studentService.removeIndex();
                    continue;
                }
                case "4":
                {
                    studentService.searchIdAndName();
                    continue;
                }
                case "5":
                {
                    studentService.getAll();
                    continue;
                }
                case "6":
                {
                    studentService.sort();
                    continue;
                }
                case "7":
                {
                    System.out.println("Have a nice day, bye!");
                    break;
                }
                default:
                {
                    System.out.println("Input is invalid, please re-enter your input ");
                    continue;
                }
            }
            break;

        }




    }


}
