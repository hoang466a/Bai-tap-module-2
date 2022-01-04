package Test_04_02_2022.services;


import Test_04_02_2022.exception.MyException;
import Test_04_02_2022.model.Student;
import Test_04_02_2022.model.Teacher;
import Test_04_02_2022.services.service.StudentService;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentCodeGymServiceImpl implements StudentService {
    public static Scanner input=new Scanner(System.in);
    public static LinkedList<Student> studentList=new LinkedList<>();
    public static String fileStudent="D:\\Codegym\\Module02\\module2\\src\\Test_04_02_2022\\data\\student.csv";
    static{
        Student student=new Student("SV-0001","Nguyễn Văn A","01/01/2001","Nam","C09","10");
        Student student1=new Student("SV-0002","Nguyễn Văn B","01/01/2001","Nam","C09","09");
        studentList.add(student);
        studentList.add(student1);
    }


    @Override
    public void add() {
        System.out.println("Nhập vào mã giáo viên: ");
        String id=input.nextLine();
        boolean checkId=false;
        while (id==null||!id.matches("^[S][V][-][0-9]{4}")){
            System.out.println("Mã nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào mã học sinh: ");
            id=input.nextLine();
        }
        while  (!checkId)
        {
            for (Student student:studentList)
            {
                if (id.equals(student.getId())){
                    System.out.println("Mã số đã tồn tại, xin nhập lại");
                    System.out.println("Nhập vào mã học sinh: ");
                    id=input.nextLine();
                    continue;
                }
            }
            checkId=true;
        }


        System.out.println("Nhập vào tên học sinh: ");
        String name=input.nextLine();
        while(name==null) {
            System.out.println("Tên nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào tên học sinh: ");
            name=input.nextLine();
        }

        System.out.println("Nhập vào ngày sinh học sinh");
        String dateOfBirth=input.nextLine();
        while(dateOfBirth==null||!dateOfBirth.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((19|2[0-9])[0-9]{2})$"))
        {System.out.println("Mã nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào ngày sinh học sinh: ");
            dateOfBirth=input.nextLine();
        }

        System.out.println("Nhập vào giới tính học sinh (Nam/Nu/Khac)");
        String gender=input.nextLine();
        while(gender==null||!gender.matches("(Nam|Nu|Khac)")){
            System.out.println("Nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào giới tính học sinh (Nam/Nu/Khac)");
            gender=input.nextLine();
        }

        System.out.println("Nhập vào lớp học sinh (CXX)");
        String grade=input.nextLine();
        while (grade==null||!grade.matches("[C][0-9]{2}"))
        {
            System.out.println("Nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào lớp học sinh (CXX)");
            grade=input.nextLine();
        }

        System.out.println("Nhập vào điểm học sinh (XX)");
        String point=input.nextLine();
        while (point==null||!point.matches("[0-9]{2}"))
        {
            System.out.println("Nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào điểm học sinh (XX)");
            point=input.nextLine();
        }


        Student student=new Student(id,name,dateOfBirth,gender,grade,point);
        studentList.add(student);
        writeFile(fileStudent,studentList);
        System.out.println("Thêm vào file thành công!");
    }

    @Override
    public void delete() {
        System.out.println("Nhập vào id học sinh muốn xóa:");
    }

    @Override
    public void display() {
        List<Student>studentListDisplay=readFile(fileStudent);
        for (Student student:studentListDisplay)
        {
            System.out.println(student);
        }
    }

    public void search() {
        System.out.println("Nhập vào mã học sinh: ");
        String id=input.nextLine();
        boolean checkId=false;
        while (id==null||!id.matches("^[S][V][-][0-9]{4}")){
            System.out.println("Mã nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào mã học sinh: ");
            id=input.nextLine();
        }
        for (Student student:studentList)
        {
            if (id.equals(student.getId()))
            {
                System.out.println("Đã tìm thấy!");
                System.out.println(student);
                checkId=true;
            }
        }
        if (!checkId)
        {
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println(e.getMessage());;
            }
        }
    }


    public void writeFile(String filePath,LinkedList<Student> studentList)
    {
        try {
            FileWriter fw=new FileWriter(filePath);
            BufferedWriter bw=new BufferedWriter(fw);
            for (Student student:studentList)
            {
                bw.write(student.getId()+","+
                        student.getName()+","+
                        student.getDateOfBirth()+","+
                        student.getGender()+","+
                        student.getName_class()+","+
                        student.getPoint()+"\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public List<Student> readFile(String filePath)
    {
        List<Student> studentList=new LinkedList<>();
        BufferedReader br=null;

        try {
            br=new BufferedReader(new FileReader(filePath));
            String line;
            String[] temp;
            Student student;
            while ((line=br.readLine())!=null) {
                temp = line.split(",");
                System.out.println(temp);
                student = new Student(temp[0], temp[1], temp[2], temp[3], temp[4],temp[5]);
                studentList.add(student);
            }

        } catch (IOException e) {
            System.out.println("Không tìm thấy file hoặc quá trình đọc file có vấn đề!");
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Failed to Read File from Data!");
            }
        }
        return studentList;
    }
}
