package Test_04_02_2022.controller;



import Test_04_02_2022.services.StudentCodeGymServiceImpl;
import Test_04_02_2022.services.TeacherCodegymServiceImpl;
import Test_04_02_2022.services.service.StudentService;

import java.util.Scanner;

public class CodeGymController {
    static TeacherCodegymServiceImpl teacherCodegymService=new TeacherCodegymServiceImpl();
    static StudentCodeGymServiceImpl studentCodeGymService=new StudentCodeGymServiceImpl();
    static Scanner input=new Scanner(System.in);


    public static void main(String[] args) {
        while(true)
        {
            System.out.println("_CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1.\tThêm mới giảng viên hoặc học sinh");
            System.out.println("2.\tXóa giảng viên hoặc học sinh");
            System.out.println("3.\tXem danh sách giảng viên hoặc học sinh");
            System.out.println("4.\tTìm kiếm giảng viên hoặc học sinh");
            System.out.println("5.\tThoát");
            System.out.println("Chọn chức năng:");
            String choice=input.nextLine();
            while(choice==null||!choice.matches("[0-9]"))
            {
                System.out.println("Đầu vào nhập sai! Xin nhập lại");
                System.out.println("Chọn chức năng:");
                choice=input.nextLine();
            }
            switch (choice) {
                case "1":
                    System.out.println("Bạn muốn thêm giảng viên hay học sinh?");
                    System.out.println("1.giảng viên");
                    System.out.println("2.học sinh");
                    System.out.println("Chọn chức năng:");
                    String choice2=input.nextLine();
                    while(choice2==null||!choice.matches("[0-9]"))
                    {
                        System.out.println("Đầu vào nhập sai! Xin nhập lại");
                        System.out.println("Chọn chức năng:");
                        choice2=input.nextLine();
                    }
                    if(choice2.equals("1"))
                    {
                        teacherCodegymService.add();
                    }
                    else if(choice2.equals("2"))
                    {
                        studentCodeGymService.add();
                    }
                    else{
                        System.out.println("Xin mời chọn lại!");
                        continue;
                    }
                    continue;
                case "2":
                    System.out.println("Bạn muốn xóa trong danh sách giáo viên hay học sinh?");
                    System.out.println("1.giảng viên");
                    System.out.println("2.học sinh");
                    System.out.println("Chọn chức năng:");
                    String choice4=input.nextLine();
                    while(choice4==null||!choice.matches("[0-9]"))
                    {
                        System.out.println("Đầu vào nhập sai! Xin nhập lại");
                        System.out.println("Chọn chức năng:");
                        choice4=input.nextLine();
                    }
                    if(choice4.equals("1"))
                    {
                        teacherCodegymService.delete();
                    }
                    else if(choice4.equals("2"))
                    {
                        studentCodeGymService.delete();
                    }
                    else{
                        System.out.println("Xin mời chọn lại!");
                        continue;
                    }
                    continue;
                case "3":
                    System.out.println("Bạn muốn xem danh sách giảng viên hay học sinh?");
                    System.out.println("1.giảng viên");
                    System.out.println("2.học sinh");
                    System.out.println("Chọn chức năng:");
                    String choice3=input.nextLine();
                    while(choice3==null||!choice.matches("[0-9]"))
                    {
                        System.out.println("Đầu vào nhập sai! Xin nhập lại");
                        System.out.println("Chọn chức năng:");
                        choice2=input.nextLine();
                    }
                    if(choice3.equals("1"))
                    {
                        teacherCodegymService.display();
                    }
                    else if(choice3.equals("2"))
                    {
                        studentCodeGymService.display();
                    }
                    else{
                        System.out.println("Xin mời chọn lại!");
                        continue;
                    }
                    continue;
                case "4":
                    System.out.println("Bạn muốn tìm kiếm giảng viên hay học sinh?");
                    System.out.println("1.giảng viên");
                    System.out.println("2.học sinh");
                    System.out.println("Chọn chức năng:");
                    String choice5=input.nextLine();
                    while(choice5==null||!choice.matches("[0-9]"))
                    {
                        System.out.println("Đầu vào nhập sai! Xin nhập lại");
                        System.out.println("Chọn chức năng:");
                        choice2=input.nextLine();
                    }
                    if(choice5.equals("1"))
                    {
                        teacherCodegymService.search();
                    }
                    else if(choice5.equals("2"))
                    {
                        studentCodeGymService.search();
                    }
                    else{
                        System.out.println("Xin mời chọn lại!");
                        continue;
                    }
                    continue;
                case "5":
                    System.out.println("Chúc bạn một ngày vui vẻ!!");
                    break;
            }
            break;
        }

    }
    }






