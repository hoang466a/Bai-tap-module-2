package BaiLamThem.bai2.model;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String studentid;
    private String namestudent;
    private String dateofbirth;
    private String gender;
    private String classname ;
    private String course;


    public Student(String productname, String productid, int productprice)
    {}

    public Student(String studentid,String namestudent,String dateofbirth,String gender, String classname,String course)
    {
        this.studentid=studentid;
        this.namestudent=namestudent;
        this.dateofbirth=dateofbirth;
        this.gender=gender;
        this.classname=classname;
        this.course=course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid='" + studentid + '\'' +
                ", namestudent='" + namestudent + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", gender='" + gender + '\'' +
                ", classname='" + classname + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getNamestudent() {
        return namestudent;
    }

    public void setNamestudent(String namestudent) {
        this.namestudent = namestudent;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public int compareTo(Student student) {

        return this.getStudentid().compareTo(student.getStudentid());
    }








}
