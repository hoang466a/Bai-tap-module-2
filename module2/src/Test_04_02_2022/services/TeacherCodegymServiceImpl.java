package Test_04_02_2022.services;

import Test_04_02_2022.exception.MyException;

import Test_04_02_2022.model.Teacher;
import Test_04_02_2022.services.service.TeacherService;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class TeacherCodegymServiceImpl implements TeacherService {
    public static Scanner input=new Scanner(System.in);
    public static LinkedList<Teacher> teacherList=new LinkedList<>();
    public static String fileTeacher="D:\\Codegym\\Module02\\module2\\src\\Test_04_02_2022\\data\\teacher.csv";
    static {
        Teacher teacherTest1=new Teacher("GV-0001","Trần Văn A","01/01/2001","Nam","tutor");
        Teacher teacherTest2=new Teacher("GV-0002","Trần Văn B","01/01/2001","Nam","tutor");
        teacherList.add(teacherTest1);
        teacherList.add(teacherTest2);
    }



    @Override
    public void add() {
        System.out.println("Nhập vào mã giáo viên: ");
        String id=input.nextLine();
        boolean checkId=false;
        while (id==null||!id.matches("^[G][V][-][0-9]{4}")){
            System.out.println("Mã nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào mã giáo viên: ");
            id=input.nextLine();
        }
        while  (!checkId)
        {
            for (Teacher teacher:teacherList)
            {
                if (id.equals(teacher.getId())){
                    System.out.println("Mã số đã tồn tại, xin nhập lại");
                    System.out.println("Nhập vào mã giáo viên: ");
                    id=input.nextLine();
                    continue;
                }
            }
            checkId=true;
        }


        System.out.println("Nhập vào tên giáo viên: ");
        String name=input.nextLine();
        while(name==null) {
            System.out.println("Tên nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào tên giáo viên: ");
            name=input.nextLine();
        }

        System.out.println("Nhập vào ngày sinh giáo viên");
        String dateOfBirth=input.nextLine();
        while(dateOfBirth==null||!dateOfBirth.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((19|2[0-9])[0-9]{2})$"))
        {System.out.println("Mã nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào ngày sinh giáo viên: ");
            dateOfBirth=input.nextLine();
        }

        System.out.println("Nhập vào giới tính giáo viên (Nam/Nu/Khac)");
        String gender=input.nextLine();
        while(gender==null||!gender.matches("(Nam|Nu|Khac)")){
            System.out.println("Nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào giới tính giáo viên (Nam/Nu/Khac)");
            gender=input.nextLine();
        }

        System.out.println("Nhập vào chuyên môn giáo viên (tutor/instructor)");
        String speciallity=input.nextLine();
        while (speciallity==null||!speciallity.matches("(tutor|instructor)"))
        {
            System.out.println("Nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào chuyên môn giáo viên (tutor/instructor)");
            speciallity=input.nextLine();
        }

        Teacher teacher=new Teacher(id,name,dateOfBirth,gender,speciallity);
        teacherList.add(teacher);
        writeFile(fileTeacher,teacherList);
        System.out.println("Thêm vào file thành công!");
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        List<Teacher>teacherListDisplay=readFile(fileTeacher);
        for (Teacher teacher:teacherListDisplay)
        {
            System.out.println(teacher);
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập vào mã giáo viên: ");
        String id=input.nextLine();
        boolean checkId=false;
        while (id==null||!id.matches("^[G][V][-][0-9]{4}")){
            System.out.println("Mã nhập vào không hợp lệ, xin nhập lại!");
            System.out.println("Nhập vào mã giáo viên: ");
            id=input.nextLine();
        }
        for (Teacher teacher:teacherList)
        {
            if (id.equals(teacher.getId()))
            {
                System.out.println("Đã tìm thấy!");
                System.out.println(teacher);
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



    public void writeFile(String filePath,LinkedList<Teacher> teacherList)
    {
        try {
            FileWriter fw=new FileWriter(filePath);
            BufferedWriter bw=new BufferedWriter(fw);
            for (Teacher teacher:teacherList)
            {
                bw.write(teacher.getId()+","+
                        teacher.getName()+","+
                        teacher.getDateOfBirth()+","+
                        teacher.getGender()+","+
                        teacher.getSpeciality()+"\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public List<Teacher> readFile(String filePath)
    {
        List<Teacher> teacherList=new LinkedList<>();
        BufferedReader br=null;

        try {
            br=new BufferedReader(new FileReader(filePath));
            String line;
            String[] temp;
            Teacher teacher;
            while ((line=br.readLine())!=null) {
                temp = line.split(",");
                System.out.println(temp);
                teacher = new Teacher(temp[0], temp[1], temp[2], temp[3], temp[4]);
                teacherList.add(teacher);
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
        return teacherList;
    }



}
